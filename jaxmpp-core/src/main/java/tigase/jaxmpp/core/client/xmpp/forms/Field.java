/*
 * Tigase XMPP Client Library
 * Copyright (C) 2006-2012 "Bartosz Małkowski" <bartosz.malkowski@tigase.org>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. Look for COPYING file in the top folder.
 * If not, see http://www.gnu.org/licenses/.
 */
package tigase.jaxmpp.core.client.xmpp.forms;

import tigase.jaxmpp.core.client.xml.XMLException;

public interface Field<T> {

	public String getDesc() throws XMLException;

	T getFieldValue() throws XMLException;

	public String getLabel() throws XMLException;

	public String getType() throws XMLException;

	public String getVar() throws XMLException;

	public boolean isRequired() throws XMLException;

	public void setDesc(String desc) throws XMLException;

	void setFieldValue(T value) throws XMLException;

	public void setLabel(String label) throws XMLException;

	public void setRequired(boolean value) throws XMLException;

	public void setVar(String var) throws XMLException;
}