package com.jp.programming.backoffice.tables;

import com.jp.programming.backoffice.api.model.ApiTable;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = MappingConstants.ComponentModel.CDI)
public interface TableMapper {

    @Mapping(target = "id", ignore = true)
    void mapToTable(ApiTable apitable, @MappingTarget Table table);

    ApiTable mapToApiTable(Table table);
}
