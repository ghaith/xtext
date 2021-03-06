/**
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtend.ide.tests;

import com.google.common.base.Objects;
import org.eclipse.xtext.ui.refactoring.ui.RenameLinkedMode;
import org.eclipse.xtext.ui.refactoring.ui.RenameRefactoringController;

@SuppressWarnings("all")
public class WaitForLinkedModeCondition /* implements DefaultCondition  */{
  private RenameRefactoringController controller;
  
  public WaitForLinkedModeCondition(final RenameRefactoringController controller) {
    this.controller = controller;
  }
  
  @Override
  public String getFailureMessage() {
    return "Linked mode not entered";
  }
  
  @Override
  public boolean test() throws Exception {
    RenameLinkedMode _activeLinkedMode = this.controller.getActiveLinkedMode();
    return (!Objects.equal(_activeLinkedMode, null));
  }
}
