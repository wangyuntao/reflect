/*
 * Copyright 2017 wangyuntao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.ytcode.reflect.clazz;

import com.google.common.collect.ImmutableSet;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;

/** @author wangyuntao */
public abstract class Members<E extends Member & AnnotatedElement, M extends Members<E, M>>
    extends AnnotatedElements<E, M> {

  protected Members(ImmutableSet<E> set) {
    super(set);
  }

  @Override
  protected final int getModifier(E e) {
    return e.getModifiers();
  }
}
