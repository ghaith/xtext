/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.parsetree.reconstr;

import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A wrapper for EObjects holding the information about what values have already been consumed by a serialization
 * process.
 * 
 * @author Sven Efftinge - Initial contribution and API
 * @author Moritz Eysholdt
 */
public interface IEObjectConsumer {

	IEObjectConsumer cloneAndConsume(String feature);

	Object getConsumable(String feature, boolean allowDefault);

	EObject getEObject();

	Map<EStructuralFeature, Integer> getUnconsumed();

	boolean isConsumed();

	boolean isConsumedWithLastConsumtion(String feature);

	/**
	 * @param classifier the
	 *            type as it is used within the grammar of the given language
	 * @return true if the delegate is a direct instance of the given type
	 */
	boolean isInstanceOf(EClassifier classifier);
}