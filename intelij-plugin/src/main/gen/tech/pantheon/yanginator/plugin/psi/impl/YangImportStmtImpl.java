// This is a generated file. Not intended for manual editing.
package tech.pantheon.yanginator.plugin.psi.impl;

import static tech.pantheon.yanginator.plugin.psi.YangTypes.YANG_IMPORT_KEYWORD;
import static tech.pantheon.yanginator.plugin.psi.YangTypes.YANG_LEFT_BRACE;
import static tech.pantheon.yanginator.plugin.psi.YangTypes.YANG_RIGHT_BRACE;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tech.pantheon.yanginator.plugin.psi.YangIdentifierArgQuoted;
import tech.pantheon.yanginator.plugin.psi.YangImportStmt;
import tech.pantheon.yanginator.plugin.psi.YangOptsep;
import tech.pantheon.yanginator.plugin.psi.YangSep;
import tech.pantheon.yanginator.plugin.psi.YangStatement;
import tech.pantheon.yanginator.plugin.psi.YangStmtsep;
import tech.pantheon.yanginator.plugin.psi.YangVisitor;

public class YangImportStmtImpl extends YangStatementImpl implements YangImportStmt {

  public YangImportStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull YangVisitor visitor) {
    visitor.visitImportStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YangStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangStatement.class);
  }

  @Override
  @NotNull
  public YangIdentifierArgQuoted getIdentifierArgQuoted() {
    return findNotNullChildByClass(YangIdentifierArgQuoted.class);
  }

  @Override
  @NotNull
  public YangOptsep getOptsep() {
    return findNotNullChildByClass(YangOptsep.class);
  }

  @Override
  @NotNull
  public YangSep getSep() {
    return findNotNullChildByClass(YangSep.class);
  }

  @Override
  @NotNull
  public List<YangStmtsep> getStmtsepList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangStmtsep.class);
  }

  @Override
  @NotNull
  public PsiElement getImportKeyword() {
    return findNotNullChildByType(YANG_IMPORT_KEYWORD);
  }

  @Override
  @NotNull
  public PsiElement getLeftBrace() {
    return findNotNullChildByType(YANG_LEFT_BRACE);
  }

  @Override
  @NotNull
  public PsiElement getRightBrace() {
    return findNotNullChildByType(YANG_RIGHT_BRACE);
  }

}
