/* Copyright (c) Meta Platforms, Inc. and affiliates. All rights reserved.
 *
 * This source code is licensed under the Apache 2.0 license found in
 * the LICENSE file in the root directory of this source tree.
 */

package com.whatsapp.eqwalizer.analyses

import com.whatsapp.eqwalizer.ast.Types.Type

trait TypeListener {
  def enterType(tp: Type): Unit = ()
  def exitType(tp: Type): Unit = ()
}
