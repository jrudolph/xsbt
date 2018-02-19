/**
 * This code is generated using [[http://www.scala-sbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package sbt.internal
final class ExpressionPos private (
  val text: String,
  val startLine: Int,
  val endLine: Int) extends Serializable {
  
  
  
  override def equals(o: Any): Boolean = o match {
    case x: ExpressionPos => (this.text == x.text) && (this.startLine == x.startLine) && (this.endLine == x.endLine)
    case _ => false
  }
  override def hashCode: Int = {
    37 * (37 * (37 * (37 * (17 + "sbt.internal.ExpressionPos".##) + text.##) + startLine.##) + endLine.##)
  }
  override def toString: String = {
    "ExpressionPos(" + text + ", " + startLine + ", " + endLine + ")"
  }
  protected[this] def copy(text: String = text, startLine: Int = startLine, endLine: Int = endLine): ExpressionPos = {
    new ExpressionPos(text, startLine, endLine)
  }
  def withText(text: String): ExpressionPos = {
    copy(text = text)
  }
  def withStartLine(startLine: Int): ExpressionPos = {
    copy(startLine = startLine)
  }
  def withEndLine(endLine: Int): ExpressionPos = {
    copy(endLine = endLine)
  }
}
object ExpressionPos {
  
  def apply(text: String, startLine: Int, endLine: Int): ExpressionPos = new ExpressionPos(text, startLine, endLine)
}
