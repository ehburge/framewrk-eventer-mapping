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
public class DtoRole {

  private final Long actorId;
  private final String groupId;
  private final String loyaltyCode;
}
