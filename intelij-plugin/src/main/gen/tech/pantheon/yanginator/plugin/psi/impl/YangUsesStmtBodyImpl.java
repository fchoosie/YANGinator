// This is a generated file. Not intended for manual editing.
package tech.pantheon.yanginator.plugin.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import tech.pantheon.yanginator.plugin.psi.YangStatement;
import tech.pantheon.yanginator.plugin.psi.YangStmtsep;
import tech.pantheon.yanginator.plugin.psi.YangUsesStmtBody;
import tech.pantheon.yanginator.plugin.psi.YangVisitor;

public class YangUsesStmtBodyImpl extends YangNamedElementImpl implements YangUsesStmtBody {

  public YangUsesStmtBodyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YangVisitor visitor) {
    visitor.visitUsesStmtBody(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public YangStatement getStatement() {
    return findNotNullChildByClass(YangStatement.class);
  }

  @Override
  @NotNull
  public YangStmtsep getStmtsep() {
    return findNotNullChildByClass(YangStmtsep.class);
  }

}
