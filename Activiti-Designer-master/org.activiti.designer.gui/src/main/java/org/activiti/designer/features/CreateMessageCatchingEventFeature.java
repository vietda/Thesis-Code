/**
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
package org.activiti.designer.features;

import org.activiti.bpmn.model.IntermediateCatchEvent;
import org.activiti.bpmn.model.MessageEventDefinition;
import org.activiti.designer.PluginImage;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;

public class CreateMessageCatchingEventFeature extends AbstractCreateFastBPMNFeature {

  public static final String FEATURE_ID_KEY = "messageintermediatecatchevent";

  public CreateMessageCatchingEventFeature(IFeatureProvider fp) {
    // set name and description of the creation feature
    super(fp, "MessageCatchingEvent", "Add message intermediate catching event");
  }

  public Object[] create(ICreateContext context) {
    IntermediateCatchEvent catchEvent = new IntermediateCatchEvent();
    MessageEventDefinition eventDef = new MessageEventDefinition();
    catchEvent.getEventDefinitions().add(eventDef);
    addObjectToContainer(context, catchEvent, "MessageCatchEvent");

    // return newly created business object(s)
    return new Object[] { catchEvent };
  }

  @Override
  public String getCreateImageId() {
    return PluginImage.IMG_EVENT_MESSAGE.getImageKey();
  }

  @Override
  protected String getFeatureIdKey() {
    return FEATURE_ID_KEY;
  }
}
