package com.jimine.jiminebackend.repository.reference;

import com.jimine.jiminebackend.model.User;
import com.jimine.jiminebackend.model.reference.RefUserProject;
import com.jimine.jiminebackend.model.reference.ckey.CKeyUserProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface RefUserProjectRepository extends JpaRepository<RefUserProject, CKeyUserProject> {

    Set<RefUserProject> findAllByUserIn(Set<User> users);
}
