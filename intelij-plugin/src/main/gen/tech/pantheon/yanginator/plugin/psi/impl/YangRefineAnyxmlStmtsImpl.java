// This is a generated file. Not intended for manual editing.
package tech.pantheon.yanginator.plugin.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tech.pantheon.yanginator.plugin.psi.YangRefineAnyxmlStmts;
import tech.pantheon.yanginator.plugin.psi.YangRefineAnyxmlStmtsBody;
import tech.pantheon.yanginator.plugin.psi.YangVisitor;

public class YangRefineAnyxmlStmtsImpl extends YangNamedElementImpl implements YangRefineAnyxmlStmts {

  public YangRefineAnyxmlStmtsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YangVisitor visitor) {
    visitor.visitRefineAnyxmlStmts(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YangRefineAnyxmlStmtsBody> getRefineAnyxmlStmtsBodyList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangRefineAnyxmlStmtsBody.class);
  }

}
