// This is a generated file. Not intended for manual editing.
package tech.pantheon.yanginator.plugin.psi.impl;

import static tech.pantheon.yanginator.plugin.psi.YangTypes.YANG_POSITIVE_NUMBER;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import tech.pantheon.yanginator.plugin.psi.YangNonZeroDigit;
import tech.pantheon.yanginator.plugin.psi.YangVisitor;

public class YangNonZeroDigitImpl extends YangNamedElementImpl implements YangNonZeroDigit {

  public YangNonZeroDigitImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YangVisitor visitor) {
    visitor.visitNonZeroDigit(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getPositiveNumber() {
    return findNotNullChildByType(YANG_POSITIVE_NUMBER);
  }

}
