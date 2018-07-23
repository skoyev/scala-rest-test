package controllers

import play.api._
import play.api.mvc._

/**
 * Main application controller using Scala Play API
 * for the /index router.
 * @author Sergiy Koyev
 */
object Application extends Controller {

  def index = Action {
    Ok(views.html.index())
  }

}
