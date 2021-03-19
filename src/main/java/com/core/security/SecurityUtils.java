package com.core.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

/**
 * @author spring.yuan
 * @version 1.0
 */
public class SecurityUtils {

    private static final Logger LOG = LoggerFactory.getLogger(SecurityUtils.class);

    private SecurityUtils() {
    }


    /**
     * get the login of the current user.
     *
     * @return
     */
    public static Optional<String> getCurrentUsername() {
        final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null) {
            LOG.debug("no authentication in security context found");
            return Optional.empty();
        }
        String username = (String) authentication.getPrincipal();
        return Optional.ofNullable(username);
    }
}
