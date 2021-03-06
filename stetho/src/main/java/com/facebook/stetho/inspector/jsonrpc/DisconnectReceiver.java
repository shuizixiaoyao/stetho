/*
 * Copyright (c) 2014-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
//
// Copyright 2004-present Facebook. All Rights Reserved.

package com.facebook.stetho.inspector.jsonrpc;

/**
 * @see JsonRpcPeer#registerDisconnectReceiver(DisconnectReceiver)
 */
public interface DisconnectReceiver {
  /**
   * Invoked when a WebSocket peer disconnects.
   */
  public void onDisconnect();
}
