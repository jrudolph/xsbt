/**
 * This code is generated using [[http://www.scala-sbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package sbt.internal.codec
import _root_.sjsonnew.{ Unbuilder, Builder, JsonFormat, deserializationError }
trait ImportsAndExpressionsFormats { self: sbt.internal.codec.ImportPosFormats with sbt.internal.codec.ExpressionPosFormats with sjsonnew.BasicJsonProtocol =>
implicit lazy val ImportsAndExpressionsFormat: JsonFormat[sbt.internal.ImportsAndExpressions] = new JsonFormat[sbt.internal.ImportsAndExpressions] {
  override def read[J](jsOpt: Option[J], unbuilder: Unbuilder[J]): sbt.internal.ImportsAndExpressions = {
    jsOpt match {
      case Some(js) =>
      unbuilder.beginObject(js)
      val imports = unbuilder.readField[Vector[sbt.internal.ImportPos]]("imports")
      val expressions = unbuilder.readField[Vector[sbt.internal.ExpressionPos]]("expressions")
      unbuilder.endObject()
      sbt.internal.ImportsAndExpressions(imports, expressions)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: sbt.internal.ImportsAndExpressions, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("imports", obj.imports)
    builder.addField("expressions", obj.expressions)
    builder.endObject()
  }
}
}
