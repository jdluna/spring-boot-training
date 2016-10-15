/*
 * Copyright (C) 2016 Thinkenterprise
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
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
 *
 *
 * @author Rafael Kansy
 * @author Michael Schaefer
 */

package com.thinkenterprise.security;

import org.springframework.security.web.authentication.preauth.RequestHeaderAuthenticationFilter;

import javax.servlet.http.HttpServletRequest;

public class SSORequestHeaderAuthenticationFilter extends RequestHeaderAuthenticationFilter {

    public SSORequestHeaderAuthenticationFilter() {
        super();
        this.setPrincipalRequestHeader("SM_USER");
    }

    @Override
    protected Object getPreAuthenticatedPrincipal(HttpServletRequest request) {
        String userName = (String) (super.getPreAuthenticatedPrincipal(request));
        if (userName == null || userName.isEmpty()) {
            return userName;
        }

        return userName;
    }
}
