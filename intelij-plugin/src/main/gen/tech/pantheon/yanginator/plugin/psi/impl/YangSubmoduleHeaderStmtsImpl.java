// This is a generated file. Not intended for manual editing.
package tech.pantheon.yanginator.plugin.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tech.pantheon.yanginator.plugin.psi.YangSubmoduleHeaderStmts;
import tech.pantheon.yanginator.plugin.psi.YangSubmoduleHeaderStmtsBody;
import tech.pantheon.yanginator.plugin.psi.YangVisitor;

public class YangSubmoduleHeaderStmtsImpl extends YangNamedElementImpl implements YangSubmoduleHeaderStmts {

  public YangSubmoduleHeaderStmtsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YangVisitor visitor) {
    visitor.visitSubmoduleHeaderStmts(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YangSubmoduleHeaderStmtsBody> getSubmoduleHeaderStmtsBodyList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangSubmoduleHeaderStmtsBody.class);
  }

}
