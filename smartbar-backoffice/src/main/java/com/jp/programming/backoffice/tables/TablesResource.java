package com.jp.programming.backoffice.tables;

import com.jp.programming.backoffice.api.model.ApiTable;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;

import java.net.URI;
import java.util.List;

public class TablesResource {

    private final TableService tableService;
    private final TableMapper mapper;

    @Inject
    public TablesResource(TableService tableService, TableMapper mapper) {
        this.tableService = tableService;
        this.mapper = mapper;
    }

    public Response tablesGet() {
        return Response.ok(List.of(tableService.get())).build();
    }

    public Response tablesPost(ApiTable apiTable) {
        final Table table = new Table();
        table.setName(apiTable.getName());
        table.setSeatCount(apiTable.getSeatCount());
        table.setActive(apiTable.getActive());

        final Table persistedTable = tableService.persist(table);

        ApiTable apiTable = mapper.mapToApiTable(persistedTable);

        return Response.created(URI.create("/tables/" + persistedTable.getId())).build();
    }

    public Response tablesTableIdGet(String tableId) {
        return Response.ok(tableService.get()).build();
    }

}
