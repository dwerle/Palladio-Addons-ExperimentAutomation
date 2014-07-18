package org.palladiosimulator.experimentautomation.application.variation;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.experimentautomation.application.utils.PCMModelHelper;
import de.uka.ipd.sdq.pcm.core.CoreFactory;
import de.uka.ipd.sdq.pcm.core.PCMRandomVariable;
import de.uka.ipd.sdq.pcm.usagemodel.Loop;

public class LoopIterationVariation implements IVariationStrategy {

    private static final Logger logger = Logger.getLogger(LoopIterationVariation.class);

    private Loop loop;

    @Override
    public void setVariedObject(final EObject o) {
        if (!Loop.class.isInstance(o)) {
            throw new RuntimeException("Expected a Loop, but encountered a " + o.getClass().getName());
        }
        this.loop = (Loop) o;
    }

    @Override
    public String vary(final long value) {
        int intValue;
        if (value > Integer.MAX_VALUE) {
            logger.warn("Warning: Converted long to int, but the value was larger than MAXINT.");
            intValue = Integer.MAX_VALUE;
        }
        intValue = new Long(value).intValue();
        final PCMRandomVariable r = CoreFactory.eINSTANCE.createPCMRandomVariable();
        r.setSpecification(new Integer(intValue).toString());
        this.loop.setLoopIteration_Loop(r);

        return "Loop Iteration Count = " + value + ": " + PCMModelHelper.toString(this.loop);
    }

}
