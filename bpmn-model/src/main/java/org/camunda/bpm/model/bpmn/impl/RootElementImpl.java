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
package org.camunda.bpm.model.bpmn.impl;

import org.camunda.bpm.model.bpmn.BaseElement;
import org.camunda.bpm.model.bpmn.RootElement;
import org.camunda.bpm.model.xml.ModelBuilder;
import org.camunda.bpm.model.xml.impl.instance.ModelTypeInstanceContext;
import org.camunda.bpm.model.xml.type.ModelElementType;
import org.camunda.bpm.model.xml.type.ModelElementTypeBuilder;

import static org.camunda.bpm.model.bpmn.impl.BpmnModelConstants.BPMN20_NS;
import static org.camunda.bpm.model.bpmn.impl.BpmnModelConstants.BPMN_TYPE_ROOT_ELEMENT;

/**
 * @author Daniel Meyer
 *
 */
public abstract class RootElementImpl extends BaseElementImp implements RootElement {

  public static ModelElementType MODEL_TYPE;

  public static void registerType(ModelBuilder modelBuilder) {

    ModelElementTypeBuilder typeBuilder = modelBuilder.defineType(RootElement.class, BPMN_TYPE_ROOT_ELEMENT)
      .namespaceUri(BPMN20_NS)
      .abstractType()
      .extendsType(BaseElement.class);

    MODEL_TYPE = typeBuilder.build();

  }

  public RootElementImpl(ModelTypeInstanceContext context) {
    super(context);
  }

}
