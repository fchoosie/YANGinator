// This is a generated file. Not intended for manual editing.
package tech.pantheon.yanginator.plugin.psi;

import com.intellij.psi.PsiElement;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public interface YangPredicate extends YangNamedElement {

  @NotNull
  List<YangWsp> getWspList();

  @NotNull
  List<YangPos> getPosList();

  @NotNull
  List<YangPredicateExpr> getPredicateExprList();

  @NotNull
  PsiElement getOpenBracket();

}
