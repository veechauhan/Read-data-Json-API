package models


import spray.json.DefaultJsonProtocol.{IntJsonFormat, StringJsonFormat}
import spray.json.{JsValue, RootJsonFormat}

case class APIResponse(postId: Int, id: Int, name: String, email: String, body: String)

object APIResponse {

  implicit object TestJsonFormat extends RootJsonFormat[APIResponse] {

    override def read(json: JsValue): APIResponse = {

      val jsObject = json.asJsObject
      val jsFields = jsObject.fields

      val postId = jsFields.get("postId").map(_.convertTo[Int]).getOrElse(0)
      val id = jsFields.get("id").map(_.convertTo[Int]).getOrElse(0)
      val name = jsFields.get("name").map(_.convertTo[String]).getOrElse("_")
      val email = jsFields.get("email").map(_.convertTo[String]).getOrElse("_")
      val body = jsFields.get("body").map(_.convertTo[String]).getOrElse("_")

      APIResponse(postId, id, name, email, body)

    }

    override def write(obj: APIResponse): JsValue = ???
  }
}