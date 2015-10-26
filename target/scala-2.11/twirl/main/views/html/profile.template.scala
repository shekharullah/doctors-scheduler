
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
object profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(localUser: models.User = null):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import com.feth.play.module.pa.views.html._

Seq[Any](format.raw/*1.33*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main(Messages("playauthenticate.profile.title"),"profile")/*5.60*/ {_display_(Seq[Any](format.raw/*5.62*/("""

    """),format.raw/*7.5*/("""<div>
	Hello
		
	</div>
	
   
""")))}),format.raw/*13.2*/("""
"""))}
  }

  def render(localUser:models.User): play.twirl.api.HtmlFormat.Appendable = apply(localUser)

  def f:((models.User) => play.twirl.api.HtmlFormat.Appendable) = (localUser) => apply(localUser)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Oct 26 13:53:30 BDT 2015
                  SOURCE: F:/Shekhar/play project/doctorscheduler/play-authenticate-mongo-master/app/views/profile.scala.html
                  HASH: 460a91d1b26a71ac0069eae3491a67a17d3eab16
                  MATRIX: 730->1|892->32|920->79|947->81|1013->139|1052->141|1084->147|1145->178
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|34->7|40->13
                  -- GENERATED --
              */
          