// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index(postId:Option[Int] = None, id:Option[Int] = None, name:Option[String] = None, email:Option[String]): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "API" + play.core.routing.queryString(List(if(postId == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[Int]]].unbind("postId", postId)), if(id == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[Int]]].unbind("id", id)), if(name == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("name", name)), Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("email", email)))))
    }
  
  }

  // @LINE:10
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
