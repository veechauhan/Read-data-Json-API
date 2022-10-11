
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
/*1.2*/import models.APIResponse

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[APIResponse],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(apiResponse: List[APIResponse]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("API")/*5.13*/ {_display_(Seq[Any](format.raw/*5.15*/("""
  """),format.raw/*6.3*/("""<body>
    <h1>Result : """),_display_(/*7.19*/apiResponse/*7.30*/.length),format.raw/*7.37*/("""</h1>
    <table id="customers">
      <tr>
        <th>ID</th>
        <th>PostId</th>
        <th>Name</th>
        <th>Email</th>
        <th>Body</th>
      </tr>
      """),_display_(/*16.8*/for(data <- apiResponse) yield /*16.32*/{_display_(Seq[Any](format.raw/*16.33*/("""
        """),format.raw/*17.9*/("""<tr>
          <td>"""),_display_(/*18.16*/data/*18.20*/.id),format.raw/*18.23*/("""</td>
          <td>"""),_display_(/*19.16*/data/*19.20*/.postId),format.raw/*19.27*/("""</td>
          <td>"""),_display_(/*20.16*/data/*20.20*/.name),format.raw/*20.25*/("""</td>
          <td>"""),_display_(/*21.16*/data/*21.20*/.email),format.raw/*21.26*/("""</td>
          <td>"""),_display_(/*22.16*/data/*22.20*/.body),format.raw/*22.25*/("""</td>
        </tr>
      """)))}),format.raw/*24.8*/("""
    """),format.raw/*25.5*/("""</table>
  </body>
""")))}),format.raw/*27.2*/("""
"""))
      }
    }
  }

  def render(apiResponse:List[APIResponse]): play.twirl.api.HtmlFormat.Appendable = apply(apiResponse)

  def f:((List[APIResponse]) => play.twirl.api.HtmlFormat.Appendable) = (apiResponse) => apply(apiResponse)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 10fd40c7a7ddd70f740de0fd4661c0cf31d81eae
                  MATRIX: 432->1|773->29|899->62|926->64|945->75|984->77|1013->80|1064->105|1083->116|1110->123|1310->297|1350->321|1389->322|1425->331|1472->351|1485->355|1509->358|1557->379|1570->383|1598->390|1646->411|1659->415|1685->420|1733->441|1746->445|1773->451|1821->472|1834->476|1860->481|1917->508|1949->513|1999->533
                  LINES: 17->1|22->3|27->4|28->5|28->5|28->5|29->6|30->7|30->7|30->7|39->16|39->16|39->16|40->17|41->18|41->18|41->18|42->19|42->19|42->19|43->20|43->20|43->20|44->21|44->21|44->21|45->22|45->22|45->22|47->24|48->25|50->27
                  -- GENERATED --
              */
          