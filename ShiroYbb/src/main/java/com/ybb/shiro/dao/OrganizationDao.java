package com.ybb.shiro.dao;

import com.ybb.shiro.entity.Organization;

import java.util.List;


public interface OrganizationDao {

    public Organization createOrganization(Organization organization);
    public Organization updateOrganization(Organization organization);
    public void deleteOrganization(Long organizationId);

    Organization findOne(Long organizationId);
    List<Organization> findAll();

    List<Organization> findAllWithExclude(Organization excludeOraganization);

    void move(Organization source, Organization target);
}
