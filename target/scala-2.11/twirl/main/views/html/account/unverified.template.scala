
package views.html.account

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
object unverified extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*2.2*/main(Messages("playauthenticate.verify.account.title"))/*2.57*/ {_display_(Seq[Any](format.raw/*2.59*/("""

	"""),format.raw/*4.2*/("""<h1>Account is Created!</h1>
	<p>
	"""),_display_(/*6.3*/Messages("playauthenticate.verify.account.before")),format.raw/*6.53*/(""" """),format.raw/*6.54*/("""<a href=""""),_display_(/*6.64*/routes/*6.70*/.Account.verifyEmail),format.raw/*6.90*/("""">"""),_display_(/*6.93*/Messages("playauthenticate.verify.account.first")),format.raw/*6.142*/("""</a>.<br/>
	</p>
""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Oct 22 01:54:10 BDT 2015
                  SOURCE: F:/Shekhar/play project/doctorscheduler/play-authenticate-mongo-master/app/views/account/unverified.scala.html
                  HASH: 1e2745babecc6d1963adb9f70237fd4650b7b745
                  MATRIX: 811->2|874->57|913->59|942->62|1003->98|1073->148|1101->149|1137->159|1151->165|1191->185|1220->188|1290->237
                  LINES: 29->2|29->2|29->2|31->4|33->6|33->6|33->6|33->6|33->6|33->6|33->6|33->6
                  -- GENERATED --
              */
          