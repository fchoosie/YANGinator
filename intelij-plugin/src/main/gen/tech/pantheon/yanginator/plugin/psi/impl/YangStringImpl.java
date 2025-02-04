// This is a generated file. Not intended for manual editing.
package tech.pantheon.yanginator.plugin.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tech.pantheon.yanginator.plugin.psi.YangIdentifierLiteral;
import tech.pantheon.yanginator.plugin.psi.YangNonQuotedString;
import tech.pantheon.yanginator.plugin.psi.YangQuotedStringBodyCharacters;
import tech.pantheon.yanginator.plugin.psi.YangSingleQuoteStringSplitter;
import tech.pantheon.yanginator.plugin.psi.YangSingleQuotedStringBodyCharacters;
import tech.pantheon.yanginator.plugin.psi.YangString;
import tech.pantheon.yanginator.plugin.psi.YangStringSplitter;
import tech.pantheon.yanginator.plugin.psi.YangVisitor;

public class YangStringImpl extends YangNamedElementImpl implements YangString {

  public YangStringImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YangVisitor visitor) {
    visitor.visitString(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YangSingleQuoteStringSplitter> getSingleQuoteStringSplitterList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangSingleQuoteStringSplitter.class);
  }

  @Override
  @NotNull
  public List<YangStringSplitter> getStringSplitterList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangStringSplitter.class);
  }

  @Override
  @NotNull
  public List<YangIdentifierLiteral> getIdentifierLiteralList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangIdentifierLiteral.class);
  }

  @Override
  @Nullable
  public YangNonQuotedString getNonQuotedString() {
    return findChildByClass(YangNonQuotedString.class);
  }

  @Override
  @NotNull
  public List<YangQuotedStringBodyCharacters> getQuotedStringBodyCharactersList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangQuotedStringBodyCharacters.class);
  }

  @Override
  @NotNull
  public List<YangSingleQuotedStringBodyCharacters> getSingleQuotedStringBodyCharactersList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangSingleQuotedStringBodyCharacters.class);
  }

}
