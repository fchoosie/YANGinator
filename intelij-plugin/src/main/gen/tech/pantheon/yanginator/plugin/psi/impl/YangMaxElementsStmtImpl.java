// This is a generated file. Not intended for manual editing.
package tech.pantheon.yanginator.plugin.psi.impl;

import static tech.pantheon.yanginator.plugin.psi.YangTypes.YANG_MAX_ELEMENTS_KEYWORD;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import tech.pantheon.yanginator.plugin.psi.YangMaxElementsStmt;
import tech.pantheon.yanginator.plugin.psi.YangMaxValueArgStr;
import tech.pantheon.yanginator.plugin.psi.YangSep;
import tech.pantheon.yanginator.plugin.psi.YangStmtend;
import tech.pantheon.yanginator.plugin.psi.YangVisitor;

public class YangMaxElementsStmtImpl extends YangStatementImpl implements YangMaxElementsStmt {

  public YangMaxElementsStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull YangVisitor visitor) {
    visitor.visitMaxElementsStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public YangMaxValueArgStr getMaxValueArgStr() {
    return findNotNullChildByClass(YangMaxValueArgStr.class);
  }

  @Override
  @NotNull
  public YangSep getSep() {
    return findNotNullChildByClass(YangSep.class);
  }

  @Override
  @NotNull
  public YangStmtend getStmtend() {
    return findNotNullChildByClass(YangStmtend.class);
  }

  @Override
  @NotNull
  public PsiElement getMaxElementsKeyword() {
    return findNotNullChildByType(YANG_MAX_ELEMENTS_KEYWORD);
  }

}
