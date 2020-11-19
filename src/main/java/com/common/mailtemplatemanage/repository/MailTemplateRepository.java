package com.common.mailtemplatemanage.repository;

import com.core.data.model.DataModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author dechun.yuan
 * @version 1.0
 */
@Repository
@Mapper
public interface MailTemplateRepository {

    DataModel findMailTemplateByName(DataModel queryModel);
}
