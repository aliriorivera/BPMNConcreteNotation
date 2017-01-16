/*
 * 
 */
package third.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import third.Elements;
import third.NormalF;
import third.SimpleBPMN;
import third.diagram.edit.policies.ThirdBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class NormalFReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public NormalFReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof NormalF) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Elements && newEnd instanceof Elements)) {
			return false;
		}
		Elements target = getLink().getTo();
		if (!(getLink().eContainer() instanceof SimpleBPMN)) {
			return false;
		}
		SimpleBPMN container = (SimpleBPMN) getLink().eContainer();
		return ThirdBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistNormalF_4003(container, getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Elements && newEnd instanceof Elements)) {
			return false;
		}
		Elements source = getLink().getFrom();
		if (!(getLink().eContainer() instanceof SimpleBPMN)) {
			return false;
		}
		SimpleBPMN container = (SimpleBPMN) getLink().eContainer();
		return ThirdBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistNormalF_4003(container, getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setFrom(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTo(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected NormalF getLink() {
		return (NormalF) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Elements getOldSource() {
		return (Elements) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Elements getNewSource() {
		return (Elements) newEnd;
	}

	/**
	 * @generated
	 */
	protected Elements getOldTarget() {
		return (Elements) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Elements getNewTarget() {
		return (Elements) newEnd;
	}
}
