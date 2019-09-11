/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package openstars.platform.passport;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-08-24")
public class TPassportInfo implements org.apache.thrift.TBase<TPassportInfo, TPassportInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TPassportInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TPassportInfo");

  private static final org.apache.thrift.protocol.TField SHA2_PWD_FIELD_DESC = new org.apache.thrift.protocol.TField("sha2Pwd", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField EXT_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("ExtData", org.apache.thrift.protocol.TType.MAP, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TPassportInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TPassportInfoTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String sha2Pwd; // required
  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> ExtData; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SHA2_PWD((short)1, "sha2Pwd"),
    EXT_DATA((short)7, "ExtData");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SHA2_PWD
          return SHA2_PWD;
        case 7: // EXT_DATA
          return EXT_DATA;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SHA2_PWD, new org.apache.thrift.meta_data.FieldMetaData("sha2Pwd", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXT_DATA, new org.apache.thrift.meta_data.FieldMetaData("ExtData", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TPassportInfo.class, metaDataMap);
  }

  public TPassportInfo() {
  }

  public TPassportInfo(
    java.lang.String sha2Pwd,
    java.util.Map<java.lang.String,java.lang.String> ExtData)
  {
    this();
    this.sha2Pwd = sha2Pwd;
    this.ExtData = ExtData;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TPassportInfo(TPassportInfo other) {
    if (other.isSetSha2Pwd()) {
      this.sha2Pwd = other.sha2Pwd;
    }
    if (other.isSetExtData()) {
      java.util.Map<java.lang.String,java.lang.String> __this__ExtData = new java.util.HashMap<java.lang.String,java.lang.String>(other.ExtData);
      this.ExtData = __this__ExtData;
    }
  }

  public TPassportInfo deepCopy() {
    return new TPassportInfo(this);
  }

  @Override
  public void clear() {
    this.sha2Pwd = null;
    this.ExtData = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getSha2Pwd() {
    return this.sha2Pwd;
  }

  public TPassportInfo setSha2Pwd(@org.apache.thrift.annotation.Nullable java.lang.String sha2Pwd) {
    this.sha2Pwd = sha2Pwd;
    return this;
  }

  public void unsetSha2Pwd() {
    this.sha2Pwd = null;
  }

  /** Returns true if field sha2Pwd is set (has been assigned a value) and false otherwise */
  public boolean isSetSha2Pwd() {
    return this.sha2Pwd != null;
  }

  public void setSha2PwdIsSet(boolean value) {
    if (!value) {
      this.sha2Pwd = null;
    }
  }

  public int getExtDataSize() {
    return (this.ExtData == null) ? 0 : this.ExtData.size();
  }

  public void putToExtData(java.lang.String key, java.lang.String val) {
    if (this.ExtData == null) {
      this.ExtData = new java.util.HashMap<java.lang.String,java.lang.String>();
    }
    this.ExtData.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.String,java.lang.String> getExtData() {
    return this.ExtData;
  }

  public TPassportInfo setExtData(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> ExtData) {
    this.ExtData = ExtData;
    return this;
  }

  public void unsetExtData() {
    this.ExtData = null;
  }

  /** Returns true if field ExtData is set (has been assigned a value) and false otherwise */
  public boolean isSetExtData() {
    return this.ExtData != null;
  }

  public void setExtDataIsSet(boolean value) {
    if (!value) {
      this.ExtData = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SHA2_PWD:
      if (value == null) {
        unsetSha2Pwd();
      } else {
        setSha2Pwd((java.lang.String)value);
      }
      break;

    case EXT_DATA:
      if (value == null) {
        unsetExtData();
      } else {
        setExtData((java.util.Map<java.lang.String,java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SHA2_PWD:
      return getSha2Pwd();

    case EXT_DATA:
      return getExtData();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SHA2_PWD:
      return isSetSha2Pwd();
    case EXT_DATA:
      return isSetExtData();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TPassportInfo)
      return this.equals((TPassportInfo)that);
    return false;
  }

  public boolean equals(TPassportInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_sha2Pwd = true && this.isSetSha2Pwd();
    boolean that_present_sha2Pwd = true && that.isSetSha2Pwd();
    if (this_present_sha2Pwd || that_present_sha2Pwd) {
      if (!(this_present_sha2Pwd && that_present_sha2Pwd))
        return false;
      if (!this.sha2Pwd.equals(that.sha2Pwd))
        return false;
    }

    boolean this_present_ExtData = true && this.isSetExtData();
    boolean that_present_ExtData = true && that.isSetExtData();
    if (this_present_ExtData || that_present_ExtData) {
      if (!(this_present_ExtData && that_present_ExtData))
        return false;
      if (!this.ExtData.equals(that.ExtData))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSha2Pwd()) ? 131071 : 524287);
    if (isSetSha2Pwd())
      hashCode = hashCode * 8191 + sha2Pwd.hashCode();

    hashCode = hashCode * 8191 + ((isSetExtData()) ? 131071 : 524287);
    if (isSetExtData())
      hashCode = hashCode * 8191 + ExtData.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TPassportInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSha2Pwd()).compareTo(other.isSetSha2Pwd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSha2Pwd()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sha2Pwd, other.sha2Pwd);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetExtData()).compareTo(other.isSetExtData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExtData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ExtData, other.ExtData);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TPassportInfo(");
    boolean first = true;

    sb.append("sha2Pwd:");
    if (this.sha2Pwd == null) {
      sb.append("null");
    } else {
      sb.append(this.sha2Pwd);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ExtData:");
    if (this.ExtData == null) {
      sb.append("null");
    } else {
      sb.append(this.ExtData);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TPassportInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TPassportInfoStandardScheme getScheme() {
      return new TPassportInfoStandardScheme();
    }
  }

  private static class TPassportInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<TPassportInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TPassportInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SHA2_PWD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sha2Pwd = iprot.readString();
              struct.setSha2PwdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // EXT_DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.ExtData = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map0.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _key1;
                @org.apache.thrift.annotation.Nullable java.lang.String _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readString();
                  _val2 = iprot.readString();
                  struct.ExtData.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setExtDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TPassportInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.sha2Pwd != null) {
        oprot.writeFieldBegin(SHA2_PWD_FIELD_DESC);
        oprot.writeString(struct.sha2Pwd);
        oprot.writeFieldEnd();
      }
      if (struct.ExtData != null) {
        oprot.writeFieldBegin(EXT_DATA_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.ExtData.size()));
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter4 : struct.ExtData.entrySet())
          {
            oprot.writeString(_iter4.getKey());
            oprot.writeString(_iter4.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TPassportInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TPassportInfoTupleScheme getScheme() {
      return new TPassportInfoTupleScheme();
    }
  }

  private static class TPassportInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<TPassportInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TPassportInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSha2Pwd()) {
        optionals.set(0);
      }
      if (struct.isSetExtData()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSha2Pwd()) {
        oprot.writeString(struct.sha2Pwd);
      }
      if (struct.isSetExtData()) {
        {
          oprot.writeI32(struct.ExtData.size());
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter5 : struct.ExtData.entrySet())
          {
            oprot.writeString(_iter5.getKey());
            oprot.writeString(_iter5.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TPassportInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.sha2Pwd = iprot.readString();
        struct.setSha2PwdIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.ExtData = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map6.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _key7;
          @org.apache.thrift.annotation.Nullable java.lang.String _val8;
          for (int _i9 = 0; _i9 < _map6.size; ++_i9)
          {
            _key7 = iprot.readString();
            _val8 = iprot.readString();
            struct.ExtData.put(_key7, _val8);
          }
        }
        struct.setExtDataIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

