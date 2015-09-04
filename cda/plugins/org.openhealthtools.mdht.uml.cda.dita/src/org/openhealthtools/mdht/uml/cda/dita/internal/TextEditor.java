package org.openhealthtools.mdht.uml.cda.dita.internal;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.openhealthtools.mdht.uml.cda.dita.DitaTransformerOptions;
import org.openhealthtools.mdht.uml.cda.dita.TransformClassContent;
import org.openhealthtools.mdht.uml.ui.properties.internal.sections.ConstraintEditor;

public class TextEditor implements ConstraintEditor {

	private Text text;

	private Constraint constraint;

	private boolean checkDita = false;

	public void setText(Text text) {
		this.text = text;
		this.text.addFocusListener(new FocusListener() {

			public void focusLost(FocusEvent e) {
				checkDita = true;
			}

			public void focusGained(FocusEvent e) {
				// Not needed
			}
		});

		this.text.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				if (checkDita) {
					generateTempDita();
					checkDita = false;
				}
			}
		});
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openhealthtools.mdht.uml.ui.properties.internal.sections.ConstraintEditor#setConstraint(org.eclipse.uml2.uml.Constraint)
	 */
	public void setConstraint(Constraint constraint) {
		this.constraint = constraint;
	}

	private IPath generateTempDita() {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IPath tmpFileInWorkspaceDir = workspace.getRoot().getLocation().append("tmp").append(
			constraint.getContext().getName()).addFileExtension("dita");

		DitaTransformerOptions transformerOptions = new DitaTransformerOptions();
		transformerOptions.setExampleDepth(0);

		TransformClassContent transformer = new TransformClassContent(transformerOptions);

		if (!tmpFileInWorkspaceDir.toFile().getParentFile().exists())
			tmpFileInWorkspaceDir.toFile().getParentFile().mkdirs();

		transformer.writeClassToFile((Class) constraint.getContext(), tmpFileInWorkspaceDir);
		return tmpFileInWorkspaceDir;
	}

}
