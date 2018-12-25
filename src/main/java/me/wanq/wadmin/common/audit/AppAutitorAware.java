package me.wanq.wadmin.common.audit;

import me.wanq.wadmin.entity.system.User;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

public class AppAutitorAware implements AuditorAware<Integer> {
    @Override
    public Optional<Integer> getCurrentAuditor() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || !authentication.isAuthenticated()) {
            return Optional.empty();
        }

        System.out.println("authentication.getPrincipal():"+authentication.getPrincipal());

        return Optional.empty();
//        User user = (User) (authentication.getPrincipal());
//        Optional<Integer> currentUserId = Optional.ofNullable(user.getId());
//        return currentUserId;
    }
}
