/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.ide.api.editor.events;

import com.google.gwt.event.shared.EventHandler;

/** Handler for {@link CompletionRequestEvent} events. */
public interface CompletionRequestHandler extends EventHandler {

  /**
   * Method called when reacting to the event.
   *
   * @param event the event
   */
  void onCompletionRequest(CompletionRequestEvent event);
}
