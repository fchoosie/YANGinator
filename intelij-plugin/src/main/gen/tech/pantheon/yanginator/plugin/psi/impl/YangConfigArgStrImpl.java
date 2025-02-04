// This is a generated file. Not intended for manual editing.
package tech.pantheon.yanginator.plugin.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import tech.pantheon.yanginator.plugin.psi.YangConfigArg;
import tech.pantheon.yanginator.plugin.psi.YangConfigArgStr;
import tech.pantheon.yanginator.plugin.psi.YangVisitor;

public class YangConfigArgStrImpl extends YangNamedElementImpl implements YangConfigArgStr {

  public YangConfigArgStrImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YangVisitor visitor) {
    visitor.visitConfigArgStr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public YangConfigArg getConfigArg() {
    return findNotNullChildByClass(YangConfigArg.class);
  }

}
