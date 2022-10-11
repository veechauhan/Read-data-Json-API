package controllers

import models.APIResponse

import javax.inject._
import spray.json._
import play.api.mvc._
import play.api.libs.ws.WSClient
import spray.json.DefaultJsonProtocol.listFormat

import scala.concurrent.ExecutionContext.Implicits.global


@Singleton
class HomeController @Inject()(
                                cc: ControllerComponents,
                                ws: WSClient,
                              ) extends AbstractController(cc) {

  def index(postId: Option[Int], id: Option[Int], name: Option[String], email: Option[String]): Action[AnyContent] =
    Action.async { implicit request: Request[AnyContent] =>
      val result = ws.url(s"https://jsonplaceholder.typicode.com/comments").get()
      result.map { response =>
        val jsValue = response.body.parseJson
        val listOfAPIResponse: List[APIResponse] = jsValue.convertTo[List[APIResponse]]

        if (id.isDefined) {
          val filterByID = listOfAPIResponse.filter(apiResponse => apiResponse.id == id.get)
          Ok(views.html.index(filterByID))
        }
        else if (postId.isDefined) {
          val filterByPostId = listOfAPIResponse.filter(apiResponse => apiResponse.postId == postId.get)
          Ok(views.html.index(filterByPostId))
        }
        else if (name.isDefined) {
          val filterByName = listOfAPIResponse.filter(apiResponse => apiResponse.name.contains(name.get))
          Ok(views.html.index(filterByName))
        }
        else if (email.isDefined) {
          val filterByEmail = listOfAPIResponse.filter(apiResponse => apiResponse.email.contains(email.get))
          Ok(views.html.index(filterByEmail))
        }
        else {
          Ok(views.html.index(listOfAPIResponse))
        }
      }
    }
}
