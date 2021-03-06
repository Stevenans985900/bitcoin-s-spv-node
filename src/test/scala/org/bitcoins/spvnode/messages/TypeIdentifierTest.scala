package org.bitcoins.spvnode.messages

import org.scalatest.{FlatSpec, MustMatchers}

/**
  * Created by chris on 7/8/16.
  */
class TypeIdentifierTest extends FlatSpec with MustMatchers {

  "MsgTx" must "serialize to 01000000" in {
    MsgTx.hex must be ("01000000")
  }

  "MsgBlock" must "serialize to 02000000" in {
    MsgBlock.hex must be ("02000000")
  }

  "MsgFilteredBlock" must "serialize to 03000000" in {
    MsgFilteredBlock.hex must be ("03000000")
  }
}
