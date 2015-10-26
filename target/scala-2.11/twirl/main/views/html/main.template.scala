
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, nav: String = "")(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import be.objectify.deadbolt.java.views.html._
import be.objectify.deadbolt.core.utils.TemplateUtils._

Seq[Any](format.raw/*1.50*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<!DOCTYPE html>
<html lang=""""),_display_(/*7.14*/lang()/*7.20*/.code()),format.raw/*7.27*/("""">
  <head>
    <title>"""),_display_(/*9.13*/title),format.raw/*9.18*/("""</title>

    <!-- Le meta -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Play Authenticate - an authentication module for the Play! Framework 2.0">
    <meta name="author" content="The Play Authenticate Team">

    <!-- Le scripts -->
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
	<script src=""""),_display_(/*19.16*/routes/*19.22*/.Application.jsRoutes),format.raw/*19.43*/("""" defer="defer"></script>
	<script src=""""),_display_(/*20.16*/routes/*20.22*/.Assets.at("assets/plugins/jquery/jquery-1.9.1.min.js")),format.raw/*20.77*/(""""></script>
	<script src=""""),_display_(/*21.16*/routes/*21.22*/.Assets.at("assets/plugins/jquery/jquery-migrate-1.1.0.min.js")),format.raw/*21.85*/(""""></script>
	<script src=""""),_display_(/*22.16*/routes/*22.22*/.Assets.at("assets/plugins/jquery-ui/ui/minified/jquery-ui.min.js")),format.raw/*22.89*/(""""></script>
	<script src=""""),_display_(/*23.16*/routes/*23.22*/.Assets.at("assets/plugins/bootstrap/js/bootstrap.min.js")),format.raw/*23.80*/(""""></script>
	<script src=""""),_display_(/*24.16*/routes/*24.22*/.Assets.at("assets/plugins/slimscroll/jquery.slimscroll.min.js")),format.raw/*24.86*/(""""></script>
	<script src=""""),_display_(/*25.16*/routes/*25.22*/.Assets.at("assets/plugins/jquery-cookie/jquery.cookie.js")),format.raw/*25.81*/(""""></script>

	
	<link href=""""),_display_(/*28.15*/routes/*28.21*/.Assets.at("assets/plugins/jquery-ui/themes/base/minified/jquery-ui.min.css")),format.raw/*28.98*/("""" rel="stylesheet">
    <link href=""""),_display_(/*29.18*/routes/*29.24*/.Assets.at("assets/plugins/bootstrap/css/bootstrap.min.css")),format.raw/*29.84*/("""" rel="stylesheet">
     <link href=""""),_display_(/*30.19*/routes/*30.25*/.Assets.at("assets/plugins/font-awesome/css/font-awesome.min.css")),format.raw/*30.91*/("""" rel="stylesheet">
    <link href=""""),_display_(/*31.18*/routes/*31.24*/.Assets.at("assets/css/animate.min.css")),format.raw/*31.64*/("""" rel="stylesheet">
     <link href=""""),_display_(/*32.19*/routes/*32.25*/.Assets.at("assets/css/style.min.css")),format.raw/*32.63*/("""" rel="stylesheet">
    <link href=""""),_display_(/*33.18*/routes/*33.24*/.Assets.at("assets/css/style-responsive.min.css")),format.raw/*33.73*/("""" rel="stylesheet">
    <link href=""""),_display_(/*34.18*/routes/*34.24*/.Assets.at("assets/css/theme/default.css")),format.raw/*34.66*/("""" rel="stylesheet">
    <!-- Le styles -->
   
	
	<!-- ================== BEGIN PAGE LEVEL CSS STYLE ================== -->
    <link href="assets/plugins/jquery-jvectormap/jquery-jvectormap-1.2.2.css" rel="stylesheet" />
    <link href="assets/plugins/bootstrap-calendar/css/bootstrap_calendar.css" rel="stylesheet" />
    <link href="assets/plugins/gritter/css/jquery.gritter.css" rel="stylesheet" />
    <link href="assets/plugins/morris/morris.css" rel="stylesheet" />
	<!-- ================== END PAGE LEVEL CSS STYLE ================== -->
	
	<!-- ================== BEGIN BASE JS ================== -->
	<script src="assets/plugins/pace/pace.min.js"></script>
	<!-- ================== END BASE JS ================== -->
    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

  </head>

  <body>
	
	
    <div id="page-container" class="page-sidebar-fixed page-header-fixed">
		<!-- begin #header -->
		<div id="header" class="header navbar navbar-inverse navbar-fixed-top">
			<!-- begin container-fluid -->
			<div class="container-fluid">
				<!-- begin mobile sidebar expand / collapse button -->
				<div class="navbar-header">
					<a href=""""),_display_(/*65.16*/routes/*65.22*/.Application.index()),format.raw/*65.42*/("""" class="navbar-brand"><span class="navbar-logo"></span>Doctors Scheduler</a>
					<button type="button" class="navbar-toggle" data-click="sidebar-toggled">
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
				</div>


          <div class="btn-group pull-right">
          """),_display_(/*75.12*/subjectPresentOr()/*75.30*/ {_display_(Seq[Any](format.raw/*75.32*/("""
          	"""),_display_(/*76.13*/defining(Application.getLocalUser(session()))/*76.58*/ { user =>_display_(Seq[Any](format.raw/*76.68*/("""
            """),format.raw/*77.13*/("""<ul class="nav navbar-nav navbar-right">
            <li class="dropdown navbar-user">
						<a href=""""),_display_(/*79.17*/routes/*79.23*/.Application.profile()),format.raw/*79.45*/("""" class="dropdown-toggle" data-toggle="dropdown">
							<img src="assets/img/user-13.jpg" alt="" /> 
							<span class="hidden-xs">"""),_display_(/*81.33*/user/*81.37*/.name),format.raw/*81.42*/("""</span> <b class="caret"></b>
						</a>
						<ul class="nav dropdown-menu animated fadeInLeft">
							<li class="arrow"></li>
							<li><a href=""""),_display_(/*85.22*/routes/*85.28*/.Application.profile()),format.raw/*85.50*/("""">Edit Profile</a></li>
							<li><a href="javascript:;"><span class="badge badge-danger pull-right">2</span> Inbox</a></li>
							<li><a href="javascript:;">Calendar</a></li>
							<li><a href="javascript:;">Setting</a></li>
							<li class="divider"></li>
							<li><a href=""""),_display_(/*90.22*/com/*90.25*/.feth.play.module.pa.controllers.routes.Authenticate.logout()),format.raw/*90.86*/("""">Log Out</a></li>
						</ul>
					</li>
               </ul>
            """)))}),format.raw/*94.14*/("""
          """)))}/*95.12*/{_display_(Seq[Any](format.raw/*95.13*/("""
          """),format.raw/*96.11*/("""<ul class="nav navbar-right">
          <li><a href=""""),_display_(/*97.25*/routes/*97.31*/.Application.login()),format.raw/*97.51*/("""" class="btn btn-primary m-r-5 m-b-5 """),_display_(/*97.89*/("disabled".when(nav == "login"))),format.raw/*97.122*/("""">"""),_display_(/*97.125*/Messages("playauthenticate.navigation.login")),format.raw/*97.170*/("""</a></li>
          </ul>
            
          """)))}),format.raw/*100.12*/("""
          """),format.raw/*101.11*/("""</div>


          <div class="navbar-header">
            <ul class="nav navbar-nav">
              <li class=""""),_display_(/*106.27*/("active".when(nav == ""))),format.raw/*106.53*/(""""><a href=""""),_display_(/*106.65*/routes/*106.71*/.Application.index()),format.raw/*106.91*/("""">"""),_display_(/*106.94*/Messages("playauthenticate.navigation.home")),format.raw/*106.138*/("""</a></li>
              <li class=""""),_display_(/*107.27*/("active".when(nav == "restricted"))),format.raw/*107.63*/(""""><a href=""""),_display_(/*107.75*/routes/*107.81*/.Application.restricted()),format.raw/*107.106*/("""">"""),_display_(/*107.109*/Messages("playauthenticate.navigation.restricted")),format.raw/*107.159*/("""</a></li>

                """),_display_(/*109.18*/subjectNotPresent()/*109.37*/ {_display_(Seq[Any](format.raw/*109.39*/("""
			    	"""),format.raw/*110.9*/("""<li class=""""),_display_(/*110.21*/("active".when(nav == "signup"))),format.raw/*110.53*/(""""><a href=""""),_display_(/*110.65*/routes/*110.71*/.Application.signup()),format.raw/*110.92*/("""">"""),_display_(/*110.95*/Messages("playauthenticate.navigation.signup")),format.raw/*110.141*/("""</a></li>
			    """)))}),format.raw/*111.9*/("""
            """),format.raw/*112.13*/("""</ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

    <div class="container">
	    """),_display_(/*119.7*/if(flash.contains(Application.FLASH_ERROR_KEY))/*119.54*/ {_display_(Seq[Any](format.raw/*119.56*/("""
	      """),format.raw/*120.8*/("""<div class="alert alert-error">
	      	"""),_display_(/*121.10*/flash()/*121.17*/.get(Application.FLASH_ERROR_KEY)),format.raw/*121.50*/("""
	      """),format.raw/*122.8*/("""</div>
	    """)))}),format.raw/*123.7*/("""
	    """),_display_(/*124.7*/if(flash.contains(Application.FLASH_MESSAGE_KEY))/*124.56*/ {_display_(Seq[Any](format.raw/*124.58*/("""
	      """),format.raw/*125.8*/("""<div class="alert alert-success">
	      	"""),_display_(/*126.10*/flash()/*126.17*/.get(Application.FLASH_MESSAGE_KEY)),format.raw/*126.52*/("""
	      """),format.raw/*127.8*/("""</div>
	    """)))}),format.raw/*128.7*/("""
		"""),_display_(/*129.4*/content),format.raw/*129.11*/("""

    """),format.raw/*131.5*/("""<hr>

      <footer>
        <p>&copy; 2015-2016 Doctor Scheduler! Licensed under Apache License, Version 2.0. View details <a href="">here</a>.</p>
        <p>
        <small>Developed by <a href="https://bd.linkedin.com/pub/shekhar-ullah/26/a88/3ba" target="_blank">Shekhar Ullah</a> </p>
      </footer>
    </div> <!-- /container -->

	<!-- ================== BEGIN BASE JS ================== -->
	<script src="assets/plugins/jquery/jquery-1.9.1.min.js"></script>
	<script src="assets/plugins/jquery/jquery-migrate-1.1.0.min.js"></script>
	<script src="assets/plugins/jquery-ui/ui/minified/jquery-ui.min.js"></script>
	<script src="assets/plugins/bootstrap/js/bootstrap.min.js"></script>
	<!--[if lt IE 9]>
		<script src="assets/crossbrowserjs/html5shiv.js"></script>
		<script src="assets/crossbrowserjs/respond.min.js"></script>
		<script src="assets/crossbrowserjs/excanvas.min.js"></script>
	<![endif]-->
	<script src="assets/plugins/slimscroll/jquery.slimscroll.min.js"></script>
	<script src="assets/plugins/jquery-cookie/jquery.cookie.js"></script>
	<!-- ================== END BASE JS ================== -->
	
	<!-- ================== BEGIN PAGE LEVEL JS ================== -->
    <script src="assets/plugins/morris/raphael.min.js"></script>
    <script src="assets/plugins/morris/morris.js"></script>
    <script src="assets/plugins/jquery-jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
    <script src="assets/plugins/jquery-jvectormap/jquery-jvectormap-world-merc-en.js"></script>
    <script src="assets/plugins/bootstrap-calendar/js/bootstrap_calendar.min.js"></script>
	<script src="assets/plugins/gritter/js/jquery.gritter.js"></script>
	<script src="assets/js/dashboard-v2.min.js"></script>
	<script src="assets/js/apps.min.js"></script>
	<!-- ================== END PAGE LEVEL JS ================== -->
  </body>
</html>
"""))}
  }

  def render(title:String,nav:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,nav)(content)

  def f:((String,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,nav) => (content) => apply(title,nav)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Oct 26 15:38:53 BDT 2015
                  SOURCE: F:/Shekhar/play project/doctorscheduler/play-authenticate-mongo-master/app/views/main.scala.html
                  HASH: a8f2751b38f2571a5e052ad8888a3ccd0d54fe6c
                  MATRIX: 734->1|972->49|1000->156|1027->157|1082->186|1096->192|1123->199|1173->223|1198->228|1657->660|1672->666|1714->687|1782->728|1797->734|1873->789|1927->816|1942->822|2026->885|2080->912|2095->918|2183->985|2237->1012|2252->1018|2331->1076|2385->1103|2400->1109|2485->1173|2539->1200|2554->1206|2634->1265|2690->1294|2705->1300|2803->1377|2867->1414|2882->1420|2963->1480|3028->1518|3043->1524|3130->1590|3194->1627|3209->1633|3270->1673|3335->1711|3350->1717|3409->1755|3473->1792|3488->1798|3558->1847|3622->1884|3637->1890|3700->1932|5010->3215|5025->3221|5066->3241|5445->3593|5472->3611|5512->3613|5552->3626|5606->3671|5654->3681|5695->3694|5825->3797|5840->3803|5883->3825|6044->3959|6057->3963|6083->3968|6260->4118|6275->4124|6318->4146|6628->4429|6640->4432|6722->4493|6829->4569|6860->4581|6899->4582|6938->4593|7019->4647|7034->4653|7075->4673|7140->4711|7195->4744|7226->4747|7293->4792|7375->4842|7415->4853|7556->4966|7604->4992|7644->5004|7660->5010|7702->5030|7733->5033|7800->5077|7864->5113|7922->5149|7962->5161|7978->5167|8026->5192|8058->5195|8131->5245|8187->5273|8216->5292|8257->5294|8294->5303|8334->5315|8388->5347|8428->5359|8444->5365|8487->5386|8518->5389|8587->5435|8636->5453|8678->5466|8824->5585|8881->5632|8922->5634|8958->5642|9027->5683|9044->5690|9099->5723|9135->5731|9179->5744|9213->5751|9272->5800|9313->5802|9349->5810|9420->5853|9437->5860|9494->5895|9530->5903|9574->5916|9605->5920|9634->5927|9668->5933
                  LINES: 26->1|30->1|32->5|33->6|34->7|34->7|34->7|36->9|36->9|46->19|46->19|46->19|47->20|47->20|47->20|48->21|48->21|48->21|49->22|49->22|49->22|50->23|50->23|50->23|51->24|51->24|51->24|52->25|52->25|52->25|55->28|55->28|55->28|56->29|56->29|56->29|57->30|57->30|57->30|58->31|58->31|58->31|59->32|59->32|59->32|60->33|60->33|60->33|61->34|61->34|61->34|92->65|92->65|92->65|102->75|102->75|102->75|103->76|103->76|103->76|104->77|106->79|106->79|106->79|108->81|108->81|108->81|112->85|112->85|112->85|117->90|117->90|117->90|121->94|122->95|122->95|123->96|124->97|124->97|124->97|124->97|124->97|124->97|124->97|127->100|128->101|133->106|133->106|133->106|133->106|133->106|133->106|133->106|134->107|134->107|134->107|134->107|134->107|134->107|134->107|136->109|136->109|136->109|137->110|137->110|137->110|137->110|137->110|137->110|137->110|137->110|138->111|139->112|146->119|146->119|146->119|147->120|148->121|148->121|148->121|149->122|150->123|151->124|151->124|151->124|152->125|153->126|153->126|153->126|154->127|155->128|156->129|156->129|158->131
                  -- GENERATED --
              */
          