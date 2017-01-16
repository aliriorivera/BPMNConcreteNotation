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

import third.ConditionalINOUT;
import third.Input;
import third.Output;
import third.SimpleBPMN;
import third.diagram.edit.policies.ThirdBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ConditionalINOUTReorientCommand extends EditElementCommand {

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
	public ConditionalINOUTReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ConditionalINOUT) {
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
		if (!(oldEnd instanceof Output && newEnd instanceof Output)) {
			return false;
		}
		Input target = getLink().getTo();
		if (!(getLink().eContainer() instanceof SimpleBPMN)) {
			return false;
		}
		SimpleBPMN container = (SimpleBPMN) getLink().eContainer();
		return ThirdBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistConditionalINOUT_4002(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Input && newEnd instanceof Input)) {
			return false;
		}
		Output source = getLink().getFrom();
		if (!(getLink().eContainer() instanceof SimpleBPMN)) {
			return false;
		}
		SimpleBPMN container = (SimpleBPMN) getLink().eContainer();
		return ThirdBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistConditionalINOUT_4002(container, getLink(), source,
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
	protected ConditionalINOUT getLink() {
		return (ConditionalINOUT) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Output getOldSource() {
		return (Output) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Output getNewSource() {
		return (Output) newEnd;
	}

	/**
	 * @generated
	 */
	protected Input getOldTarget() {
		return (Input) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Input getNewTarget() {
		return (Input) newEnd;
	}
}
