/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.camunda.bpm.model.bpmn.instance.bpmndi;

import org.camunda.bpm.model.bpmn.instance.BpmnModelElementInstanceTest;
import org.camunda.bpm.model.bpmn.instance.di.LabeledEdge;

import java.util.Arrays;
import java.util.Collection;

import static org.camunda.bpm.model.bpmn.impl.BpmnModelConstants.BPMNDI_NS;

/**
 * @author Sebastian Menski
 */
public class BpmnEdgeTest extends BpmnModelElementInstanceTest {

  public TypeAssumption getTypeAssumption() {
    return new TypeAssumption(BPMNDI_NS, LabeledEdge.class, false);
  }

  public Collection<ChildElementAssumption> getChildElementAssumptions() {
    return Arrays.asList(
      new ChildElementAssumption(BPMNDI_NS, BpmnLabel.class, 0, 1)
    );
  }

  public Collection<AttributeAssumption> getAttributesAssumptions() {
    return Arrays.asList(
      new AttributeAssumption(BPMNDI_NS, "bpmnElement"),
      new AttributeAssumption(BPMNDI_NS, "sourceElement"),
      new AttributeAssumption(BPMNDI_NS, "targetElement"),
      new AttributeAssumption(BPMNDI_NS, "messageVisibleKind")
    );
  }
}
