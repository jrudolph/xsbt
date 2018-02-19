/**
 * This code is generated using [[http://www.scala-sbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package sbt.internal
final class ImportsAndExpressions private (
  val imports: Vector[sbt.internal.ImportPos],
  val expressions: Vector[sbt.internal.ExpressionPos]) extends Serializable {
  
  
  
  override def equals(o: Any): Boolean = o match {
    case x: ImportsAndExpressions => (this.imports == x.imports) && (this.expressions == x.expressions)
    case _ => false
  }
  override def hashCode: Int = {
    37 * (37 * (37 * (17 + "sbt.internal.ImportsAndExpressions".##) + imports.##) + expressions.##)
  }
  override def toString: String = {
    "ImportsAndExpressions(" + imports + ", " + expressions + ")"
  }
  protected[this] def copy(imports: Vector[sbt.internal.ImportPos] = imports, expressions: Vector[sbt.internal.ExpressionPos] = expressions): ImportsAndExpressions = {
    new ImportsAndExpressions(imports, expressions)
  }
  def withImports(imports: Vector[sbt.internal.ImportPos]): ImportsAndExpressions = {
    copy(imports = imports)
  }
  def withExpressions(expressions: Vector[sbt.internal.ExpressionPos]): ImportsAndExpressions = {
    copy(expressions = expressions)
  }
}
object ImportsAndExpressions {
  
  def apply(imports: Vector[sbt.internal.ImportPos], expressions: Vector[sbt.internal.ExpressionPos]): ImportsAndExpressions = new ImportsAndExpressions(imports, expressions)
}
