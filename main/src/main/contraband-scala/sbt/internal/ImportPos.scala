/**
 * This code is generated using [[http://www.scala-sbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package sbt.internal
final class ImportPos private (
  val text: String,
  val startLine: Int) extends Serializable {
  
  
  
  override def equals(o: Any): Boolean = o match {
    case x: ImportPos => (this.text == x.text) && (this.startLine == x.startLine)
    case _ => false
  }
  override def hashCode: Int = {
    37 * (37 * (37 * (17 + "sbt.internal.ImportPos".##) + text.##) + startLine.##)
  }
  override def toString: String = {
    "ImportPos(" + text + ", " + startLine + ")"
  }
  protected[this] def copy(text: String = text, startLine: Int = startLine): ImportPos = {
    new ImportPos(text, startLine)
  }
  def withText(text: String): ImportPos = {
    copy(text = text)
  }
  def withStartLine(startLine: Int): ImportPos = {
    copy(startLine = startLine)
  }
}
object ImportPos {
  
  def apply(text: String, startLine: Int): ImportPos = new ImportPos(text, startLine)
}
