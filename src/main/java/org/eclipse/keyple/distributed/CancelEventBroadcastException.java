/* **************************************************************************************
 * Copyright (c) 2021 Calypso Networks Association https://www.calypsonet-asso.org/
 *
 * See the NOTICE file(s) distributed with this work for additional information
 * regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License 2.0 which is available at http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 ************************************************************************************** */
package org.eclipse.keyple.distributed;

/**
 * This functional exception commands to cancel the event's broadcast to the remote node.
 *
 * <p>It could be thrown during the invocation of the method {@link
 * org.eclipse.keyple.distributed.spi.ReaderEventFilterSpi#beforeEventBroadcast(org.eclipse.keyple.core.common.KeypleReaderEvent)}.
 *
 * @since 2.0
 */
public final class CancelEventBroadcastException extends Exception {

  /**
   * @param message The message to identify the exception context.
   * @since 2.0
   */
  public CancelEventBroadcastException(String message) {
    super(message);
  }
}