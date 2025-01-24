package net.yc.race.track.controller;

import lombok.RequiredArgsConstructor;
import net.yc.race.track.Enum.RoleEnum;
import net.yc.race.track.service.UserServiceInf;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/admin/roles")
public class RoleController {


    private final UserServiceInf userService;
    @PostMapping("/changeToOrganizer/{id}")
    public ResponseEntity<String> changeToOrganizer(@PathVariable Long id) {
        userService.changeRole(id, RoleEnum.ROLE_ORGANIZER);
        return ResponseEntity.ok("User role changed successfully");
    }
    @PostMapping("/changeToAdmin/{id}")
    public ResponseEntity<String> changeToAdmin(@PathVariable Long id) {
        userService.changeRole(id, RoleEnum.ROLE_ADMIN);
        return ResponseEntity.ok("User role changed successfully");
    }

}
