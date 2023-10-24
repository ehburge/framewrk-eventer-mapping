package co.ex.framewrk.eventer.model.impl;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.jackson.Jacksonized;

@ToString
@Getter
@Jacksonized
@Builder(access = AccessLevel.PUBLIC)
public class DtoPart {

  private final String partId;
  private final int qty;
  private final String lineAction;
  private final String promoCodes;
}
