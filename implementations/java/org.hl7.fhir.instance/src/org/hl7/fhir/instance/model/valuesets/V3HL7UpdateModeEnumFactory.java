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

public class V3HL7UpdateModeEnumFactory implements EnumFactory<V3HL7UpdateMode> {

  public V3HL7UpdateMode fromCode(String codeString) throws IllegalArgumentException {
    if (codeString == null || "".equals(codeString))
      return null;
    if ("A".equals(codeString))
      return V3HL7UpdateMode.A;
    if ("AR".equals(codeString))
      return V3HL7UpdateMode.AR;
    if ("D".equals(codeString))
      return V3HL7UpdateMode.D;
    if ("K".equals(codeString))
      return V3HL7UpdateMode.K;
    if ("N".equals(codeString))
      return V3HL7UpdateMode.N;
    if ("R".equals(codeString))
      return V3HL7UpdateMode.R;
    if ("REF".equals(codeString))
      return V3HL7UpdateMode.REF;
    if ("U".equals(codeString))
      return V3HL7UpdateMode.U;
    throw new IllegalArgumentException("Unknown V3HL7UpdateMode code '"+codeString+"'");
  }

  public String toCode(V3HL7UpdateMode code) {
    if (code == V3HL7UpdateMode.A)
      return "A";
    if (code == V3HL7UpdateMode.AR)
      return "AR";
    if (code == V3HL7UpdateMode.D)
      return "D";
    if (code == V3HL7UpdateMode.K)
      return "K";
    if (code == V3HL7UpdateMode.N)
      return "N";
    if (code == V3HL7UpdateMode.R)
      return "R";
    if (code == V3HL7UpdateMode.REF)
      return "REF";
    if (code == V3HL7UpdateMode.U)
      return "U";
    return "?";
  }


}

