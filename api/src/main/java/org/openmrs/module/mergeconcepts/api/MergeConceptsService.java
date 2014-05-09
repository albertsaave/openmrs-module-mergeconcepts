/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.mergeconcepts.api;

import java.util.List;
import java.util.Set;

import org.openmrs.*;
import org.openmrs.api.OpenmrsService;
import org.springframework.transaction.annotation.Transactional;

/**
 * This service exposes module's core functionality. It is a Spring managed bean which is configured in moduleApplicationContext.xml.
 * <p>
 * It can be accessed only via Context:<br>
 * <code>
 * Context.getService(MergeConceptsService.class).someMethod();
 * </code>
 * 
 * @see org.openmrs.api.context.Context
 */
@Transactional
public interface MergeConceptsService extends OpenmrsService {

	public int getObsCount(Integer conceptId);
	
	public List<Integer> getObsIds(Integer conceptId);

	public void updateObs(Integer oldConceptId, Integer newConceptId);

    public void updateFields(int oldConceptId, int newConceptId);

	public List<Drug> getDrugsByIngredient(Concept ingredient);

    void updateOrders(int oldConceptId, int newConceptId);

    public List<Order> getMatchingOrders(Concept concept);

    public void updatePrograms(int oldConceptId, int newConceptId);

    public List<Program> getMatchingPrograms(Concept concept);

    public Set<FormField> getMatchingFormFields(Concept concept);

    public Set<Form> getMatchingForms(Concept concept);

    public List<Drug> getDrugsByRouteConcept(Concept concept);

    public List<Drug> getDrugsByDosageFormConcept(Concept concept);
}