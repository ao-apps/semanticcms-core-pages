/*
 * semanticcms-core-pages - Redistributable sets of SemanticCMS pages.
 * Copyright (C) 2017  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of semanticcms-core-pages.
 *
 * semanticcms-core-pages is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * semanticcms-core-pages is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with semanticcms-core-pages.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.semanticcms.core.pages;

import com.aoindustries.net.Path;
import java.io.IOException;

/**
 * Thrown when a page is not found.
 *
 * @see  Pages#getPage(com.aoindustries.net.Path, com.semanticcms.core.pages.CaptureLevel)
 */
public class PageNotFoundException extends IOException {

	private static final long serialVersionUID = 1L;

	public PageNotFoundException(PageRepository repository, Path path) {
		super(
			"Page not found: "
			+ repository.toString()
			+ (repository.toString().endsWith(":") ? "" : "!")
			+ path
		);
	}
}