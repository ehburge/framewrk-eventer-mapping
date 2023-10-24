package co.ex.framewrk.eventer.model.impl;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.jackson.Jacksonized;

@ToString
@Getter
@Jacksonized
@Builder
public class DtoSaveEventImpl implements co.ex.framewrk.eventer.model.DtoSaveEvent {

    @Setter
    private Long id;
    private DtoRole role;
    private String eventKind;
    private String promoCodes;
    private DtoComments comments;
    private DtoParts parts;
}
