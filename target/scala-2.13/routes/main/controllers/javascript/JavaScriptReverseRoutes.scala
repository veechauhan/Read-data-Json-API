// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function(postId0,id1,name2,email3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "API" + _qS([(postId0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Option[Int]]].javascriptUnbind + """)("postId", postId0)), (id1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Option[Int]]].javascriptUnbind + """)("id", id1)), (name2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Option[String]]].javascriptUnbind + """)("name", name2)), (""" + implicitly[play.api.mvc.QueryStringBindable[Option[String]]].javascriptUnbind + """)("email", email3)])})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
