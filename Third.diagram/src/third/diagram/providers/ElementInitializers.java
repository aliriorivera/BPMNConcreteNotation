/*
 * 
 */
package third.diagram.providers;

import third.diagram.part.ThirdDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ThirdDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			ThirdDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
