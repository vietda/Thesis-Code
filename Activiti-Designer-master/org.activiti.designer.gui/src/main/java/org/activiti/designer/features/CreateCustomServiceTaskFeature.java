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
/**
 * 
 */
package org.activiti.designer.features;

import org.eclipse.graphiti.features.IFeatureProvider;

/**
 * @author Tiese Barrell
 * @since 0.5.1
 * @version 1
 * 
 */
public class CreateCustomServiceTaskFeature extends CreateServiceTaskFeature {

	public CreateCustomServiceTaskFeature(IFeatureProvider fp, String name, String description,
			String customServiceTaskId) {
		super(fp, name, description, customServiceTaskId);
	}

}
