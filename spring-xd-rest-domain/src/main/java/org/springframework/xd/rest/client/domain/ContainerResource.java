/*
 * Copyright 2014 the original author or authors.
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

package org.springframework.xd.rest.client.domain;

import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.hateoas.PagedResources;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.util.Assert;

/**
 * Represents runtime container info model.
 *
 * @author Ilayaperumal Gopinathan
 */
@XmlRootElement
public class ContainerResource extends ResourceSupport {

	private Map<String, String> attributes;

	@SuppressWarnings("unused")
	private ContainerResource() {
	}

	/**
	 * Construct ContainerResource using the container attributes.
	 *
	 * @param attributes the container attributes
	 */
	public ContainerResource(Map<String, String> attributes) {
		Assert.notNull(attributes);
		this.attributes = attributes;
	}

	/**
	 * Get all the container attributes.
	 *
	 * @return all the container attributes.
	 */
	public Map<String, String> getAttributes() {
		return this.attributes;
	}

	/**
	 * Get the attribute value by given name.
	 *
	 * @param name the attribute name
	 * @return value corresponding to the given attribute name.
	 */
	public String getAttribute(String name) {
		return this.attributes.get(name);
	}

	@Override
	public String toString() {
		return attributes.toString();
	}


	/**
	 * Dedicated subclass to workaround type erasure.
	 *
	 * @author Eric Bottard
	 */
	public static class Page extends PagedResources<ContainerResource> {

	}

}
