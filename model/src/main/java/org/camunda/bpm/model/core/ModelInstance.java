/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.model.core;

import java.util.Collection;

import org.camunda.bpm.model.core.instance.ModelElementInstance;
import org.camunda.bpm.model.core.type.ModelElementType;

/**
 * An instance of a Model
 *
 * @author Daniel Meyer
 *
 */
public interface ModelInstance {

  <T extends ModelElementInstance> T newInstance(Class<T> type);

  <T extends ModelElementInstance> T newInstance(ModelElementType type);

  ModelElementInstance getDocumentElement();

  void setDocumentElement(ModelElementInstance documentElement);

  Model getModel();

  ModelElementInstance findModelElementById(String id);

  /**
   * @param referencingType
   * @return
   */
  Collection<ModelElementInstance> findModelElementsByType(ModelElementType referencingType);

}