package org.eclipse.twig.ui.editor;

import org.eclipse.dltk.core.CompletionProposal;
import org.eclipse.dltk.core.IMethod;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.php.internal.ui.editor.contentassist.PHPCompletionProposalLabelProvider;


/**
 * 
 * 
 * 
 * 
 * @author Robert Gruendler <r.gruendler@gmail.com>
 *
 */
@SuppressWarnings("restriction")
public class TwigCompletionProposalLabelProvider extends
		PHPCompletionProposalLabelProvider {

	
	protected String createMethodProposalLabel(CompletionProposal methodProposal) {
		StringBuffer nameBuffer = new StringBuffer();


		// method name
		nameBuffer.append(methodProposal.getName());

		// parameters
		//nameBuffer.append('(');
//		appendParameterList(nameBuffer, methodProposal);
//		nameBuffer.append(')');

		IMethod method = (IMethod) methodProposal.getModelElement();
		nameBuffer.append(" - "); //$NON-NLS-1$

		IModelElement parent = method.getParent();
		nameBuffer.append(parent.getElementName());

		return nameBuffer.toString();
	}
	
	protected String createOverrideMethodProposalLabel(
			CompletionProposal methodProposal) {

		StringBuffer nameBuffer = new StringBuffer();
		IMethod method = (IMethod) methodProposal.getModelElement();

//		if (method instanceof FakeConstructor) {
//			IType type = (IType) method.getParent();
//			if (type instanceof AliasType) {
//				AliasType aliasType = (AliasType) type;
//				nameBuffer.append(aliasType.getAlias());
//				nameBuffer.append("()");
//				return nameBuffer.toString();
//			}
//		}

		// method name
		nameBuffer.append(methodProposal.getName());

		// parameters
//		nameBuffer.append('(');
//		appendParameterList(nameBuffer, methodProposal);
//		nameBuffer.append(')'); //$NON-NLS-1$

//		nameBuffer.append(" - "); //$NON-NLS-1$

//		IModelElement parent = method.getParent();
//		nameBuffer.append(parent.getElementName());		

		return nameBuffer.toString();
	}
	
	
	
	@Override
	public ImageDescriptor createImageDescriptor(CompletionProposal proposal) {

		return super.createImageDescriptor(proposal);
	}
	
}