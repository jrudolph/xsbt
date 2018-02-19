/**
 * This code is generated using [[http://www.scala-sbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
import _root_.sjsonnew.{ Unbuilder, Builder, JsonFormat, deserializationError }
trait ProjectOriginFormats { self: sjsonnew.BasicJsonProtocol =>
implicit lazy val ProjectOriginFormat: JsonFormat[sbt.ProjectOrigin] = new JsonFormat[sbt.ProjectOrigin] {
  override def read[J](jsOpt: Option[J], unbuilder: Unbuilder[J]): sbt.ProjectOrigin = {
    jsOpt match {
      case Some(js) =>
      unbuilder.readString(js) match {
        case "Organic" => sbt.ProjectOrigin.Organic
        case "ExtraProject" => sbt.ProjectOrigin.ExtraProject
        case "DerivedProject" => sbt.ProjectOrigin.DerivedProject
        case "GenericRoot" => sbt.ProjectOrigin.GenericRoot
      }
      case None =>
      deserializationError("Expected JsString but found None")
    }
  }
  override def write[J](obj: sbt.ProjectOrigin, builder: Builder[J]): Unit = {
    val str = obj match {
      case sbt.ProjectOrigin.Organic => "Organic"
      case sbt.ProjectOrigin.ExtraProject => "ExtraProject"
      case sbt.ProjectOrigin.DerivedProject => "DerivedProject"
      case sbt.ProjectOrigin.GenericRoot => "GenericRoot"
    }
    builder.writeString(str)
  }
}
}
