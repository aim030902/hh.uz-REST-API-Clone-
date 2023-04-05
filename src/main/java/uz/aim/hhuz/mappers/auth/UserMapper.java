package uz.aim.hhuz.mappers.auth;

import uz.aim.hhuz.domains.auth.UserInfo;
import uz.aim.hhuz.dto.auth.UserDto;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto fromUser(UserInfo userInfo);
}
