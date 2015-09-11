package org.hl7.fhir.instance.model.valuesets;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Tue, Sep 8, 2015 15:35-0400 for FHIR v1.0.0


import org.hl7.fhir.instance.model.EnumFactory;

public class V3EntityDeterminerEnumFactory implements EnumFactory<V3EntityDeterminer> {

  public V3EntityDeterminer fromCode(String codeString) throws IllegalArgumentException {
    if (codeString == null || "".equals(codeString))
      return null;
    if ("INSTANCE".equals(codeString))
      return V3EntityDeterminer.INSTANCE;
    if ("GROUP".equals(codeString))
      return V3EntityDeterminer.GROUP;
    if ("KIND".equals(codeString))
      return V3EntityDeterminer.KIND;
    if ("GROUPKIND".equals(codeString))
      return V3EntityDeterminer.GROUPKIND;
    throw new IllegalArgumentException("Unknown V3EntityDeterminer code '"+codeString+"'");
  }

  public String toCode(V3EntityDeterminer code) {
    if (code == V3EntityDeterminer.INSTANCE)
      return "INSTANCE";
    if (code == V3EntityDeterminer.GROUP)
      return "GROUP";
    if (code == V3EntityDeterminer.KIND)
      return "KIND";
    if (code == V3EntityDeterminer.GROUPKIND)
      return "GROUPKIND";
    return "?";
  }


}

