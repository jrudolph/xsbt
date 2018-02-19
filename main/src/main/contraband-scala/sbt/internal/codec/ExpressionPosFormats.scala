/**
 * This code is generated using [[http://www.scala-sbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package sbt.internal.codec
import _root_.sjsonnew.{ Unbuilder, Builder, JsonFormat, deserializationError }
trait ExpressionPosFormats { self: sjsonnew.BasicJsonProtocol =>
implicit lazy val ExpressionPosFormat: JsonFormat[sbt.internal.ExpressionPos] = new JsonFormat[sbt.internal.ExpressionPos] {
  override def read[J](jsOpt: Option[J], unbuilder: Unbuilder[J]): sbt.internal.ExpressionPos = {
    jsOpt match {
      case Some(js) =>
      unbuilder.beginObject(js)
      val text = unbuilder.readField[String]("text")
      val startLine = unbuilder.readField[Int]("startLine")
      val endLine = unbuilder.readField[Int]("endLine")
      unbuilder.endObject()
      sbt.internal.ExpressionPos(text, startLine, endLine)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: sbt.internal.ExpressionPos, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("text", obj.text)
    builder.addField("startLine", obj.startLine)
    builder.addField("endLine", obj.endLine)
    builder.endObject()
  }
}
}
