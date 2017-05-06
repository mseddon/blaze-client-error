import org.http4s._
import org.http4s.dsl._
import org.http4s.client._
import org.http4s.client.blaze.{defaultClient => client}

object OhDearieMe extends App {
  val req = POST(uri("https://duckduckgo.com/"), UrlForm("q" -> "http4s"))
  val responseBody = client.expect[String](req)
  println(responseBody.unsafeRun())
}