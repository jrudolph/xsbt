/**
 * This code is generated using [[http://www.scala-sbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
import _root_.sjsonnew.{ Unbuilder, Builder, JsonFormat, deserializationError }
trait PluginTriggerFormats { self: sjsonnew.BasicJsonProtocol =>
implicit lazy val PluginTriggerFormat: JsonFormat[sbt.PluginTrigger] = new JsonFormat[sbt.PluginTrigger] {
  override def read[J](jsOpt: Option[J], unbuilder: Unbuilder[J]): sbt.PluginTrigger = {
    jsOpt match {
      case Some(js) =>
      unbuilder.readString(js) match {
        case "AllRequirements" => sbt.PluginTrigger.AllRequirements
        case "NoTrigger" => sbt.PluginTrigger.NoTrigger
      }
      case None =>
      deserializationError("Expected JsString but found None")
    }
  }
  override def write[J](obj: sbt.PluginTrigger, builder: Builder[J]): Unit = {
    val str = obj match {
      case sbt.PluginTrigger.AllRequirements => "AllRequirements"
      case sbt.PluginTrigger.NoTrigger => "NoTrigger"
    }
    builder.writeString(str)
  }
}
}
