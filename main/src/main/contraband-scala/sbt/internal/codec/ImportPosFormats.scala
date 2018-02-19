/**
 * This code is generated using [[http://www.scala-sbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package sbt.internal.codec
import _root_.sjsonnew.{ Unbuilder, Builder, JsonFormat, deserializationError }
trait ImportPosFormats { self: sjsonnew.BasicJsonProtocol =>
implicit lazy val ImportPosFormat: JsonFormat[sbt.internal.ImportPos] = new JsonFormat[sbt.internal.ImportPos] {
  override def read[J](jsOpt: Option[J], unbuilder: Unbuilder[J]): sbt.internal.ImportPos = {
    jsOpt match {
      case Some(js) =>
      unbuilder.beginObject(js)
      val text = unbuilder.readField[String]("text")
      val startLine = unbuilder.readField[Int]("startLine")
      unbuilder.endObject()
      sbt.internal.ImportPos(text, startLine)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: sbt.internal.ImportPos, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("text", obj.text)
    builder.addField("startLine", obj.startLine)
    builder.endObject()
  }
}
}
