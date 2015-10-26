
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*2.2*/main(Messages("playauthenticate.index.title"))/*2.48*/ {_display_(Seq[Any](format.raw/*2.50*/("""
      """),format.raw/*3.7*/("""<!-- Main hero unit for a primary marketing message or call to action -->
      <div class="hero-unit">
        <h1>Welcome to Doctors Scheduler</h1>
        <p> <br/></p>
      </div>

      <!-- Example row of columns -->
      <div class="row">
        <div class="span4">
          <h2>"""),_display_(/*12.16*/Messages("playauthenticate.index.heading")),format.raw/*12.58*/("""</h2>
           <p>Cupcake ipsum dolor sit amet. Pastry pie powder biscuit bear claw. Jelly-o chocolate bar sweet roll sugar plum chocolate. Biscuit brownie chupa chups macaroon ice cream halvah sugar plum oat cake ice cream.</p>
          <p><a class="btn" href="#">"""),_display_(/*14.39*/Messages("playauthenticate.index.details")),format.raw/*14.81*/(""" """),format.raw/*14.82*/("""&raquo;</a></p>
        </div>
        <div class="span4">
          <h2>Heading</h2>
           <p>Applicake macaroon caramels gummi bears pastry. Cake liquorice carrot cake chocolate lollipop dessert. Halvah fruitcake marshmallow pie gummi bears pie marzipan.</p>
          <p><a class="btn" href="#">"""),_display_(/*19.39*/Messages("playauthenticate.index.details")),format.raw/*19.81*/(""" """),format.raw/*19.82*/("""&raquo;</a></p>
       </div>
        <div class="span4">
          <h2>Heading</h2>
          <p>Wafer halvah jujubes lollipop liquorice jelly-o pastry. Pie halvah toffee. Candy canes donut sugar plum. Chocolate cake powder tart liquorice cotton candy pudding sweet.</p>
          <p><a class="btn" href="#">"""),_display_(/*24.39*/Messages("playauthenticate.index.details")),format.raw/*24.81*/(""" """),format.raw/*24.82*/("""&raquo;</a></p>
        </div>
      </div>
    """)))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Oct 22 01:22:53 BDT 2015
                  SOURCE: F:/Shekhar/play project/doctorscheduler/play-authenticate-mongo-master/app/views/index.scala.html
                  HASH: 91bd149f1deb40d4d02fd8e78063ddaaa79d14c1
                  MATRIX: 798->2|852->48|891->50|924->57|1242->348|1305->390|1601->659|1664->701|1693->702|2024->1006|2087->1048|2116->1049|2453->1359|2516->1401|2545->1402
                  LINES: 29->2|29->2|29->2|30->3|39->12|39->12|41->14|41->14|41->14|46->19|46->19|46->19|51->24|51->24|51->24
                  -- GENERATED --
              */
          