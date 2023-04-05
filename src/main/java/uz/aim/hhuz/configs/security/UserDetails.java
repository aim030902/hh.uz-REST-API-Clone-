package uz.aim.hhuz.configs.security;

import uz.aim.hhuz.domains.auth.AuthPermission;
import uz.aim.hhuz.domains.auth.AuthRole;
import uz.aim.hhuz.domains.auth.UserInfo;
import lombok.Builder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Builder
public record UserDetails(UserInfo userInfo) implements org.springframework.security.core.userdetails.UserDetails {


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<GrantedAuthority> authorities = new HashSet<>();
        if (Objects.nonNull(userInfo.getRoles())) {
            for (AuthRole role : userInfo.getRoles()) {
                authorities.add(new SimpleGrantedAuthority(role.getAuthority()));
                for (AuthPermission permission : role.getPermissions()) {
                    authorities.add(new SimpleGrantedAuthority(permission.getAuthority()));
                }
            }
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return userInfo.getPassword();
    }

    @Override
    public String getUsername() {
        return userInfo.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return userInfo().getIsActive();
    }

    @Override
    public boolean isAccountNonLocked() {
        return userInfo.getIsActive();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return userInfo.getIsActive();
    }
}
