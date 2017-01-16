/*
 * 
 */
package third.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import third.diagram.part.ThirdVisualIDRegistry;

/**
 * @generated
 */
public class ThirdNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7003;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7002;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof ThirdNavigatorItem) {
			ThirdNavigatorItem item = (ThirdNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ThirdVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
