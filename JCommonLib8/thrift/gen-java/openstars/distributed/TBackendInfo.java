/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package openstars.distributed;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-08-24")
public class TBackendInfo implements org.apache.thrift.TBase<TBackendInfo, TBackendInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TBackendInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TBackendInfo");

  private static final org.apache.thrift.protocol.TField HOST_FIELD_DESC = new org.apache.thrift.protocol.TField("host", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("port", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField START_RANGE_FIELD_DESC = new org.apache.thrift.protocol.TField("startRange", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField WEIGHT_FIELD_DESC = new org.apache.thrift.protocol.TField("weight", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField SERVICE_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("servicePath", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TBackendInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TBackendInfoTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String host; // required
  public int port; // required
  public long startRange; // required
  public int weight; // required
  /**
   * 
   * @see TBackendStatus
   */
  public @org.apache.thrift.annotation.Nullable TBackendStatus status; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String servicePath; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HOST((short)1, "host"),
    PORT((short)2, "port"),
    START_RANGE((short)3, "startRange"),
    WEIGHT((short)4, "weight"),
    /**
     * 
     * @see TBackendStatus
     */
    STATUS((short)5, "status"),
    SERVICE_PATH((short)6, "servicePath");

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
        case 1: // HOST
          return HOST;
        case 2: // PORT
          return PORT;
        case 3: // START_RANGE
          return START_RANGE;
        case 4: // WEIGHT
          return WEIGHT;
        case 5: // STATUS
          return STATUS;
        case 6: // SERVICE_PATH
          return SERVICE_PATH;
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
  private static final int __PORT_ISSET_ID = 0;
  private static final int __STARTRANGE_ISSET_ID = 1;
  private static final int __WEIGHT_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HOST, new org.apache.thrift.meta_data.FieldMetaData("host", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PORT, new org.apache.thrift.meta_data.FieldMetaData("port", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.START_RANGE, new org.apache.thrift.meta_data.FieldMetaData("startRange", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "THashType")));
    tmpMap.put(_Fields.WEIGHT, new org.apache.thrift.meta_data.FieldMetaData("weight", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TBackendStatus.class)));
    tmpMap.put(_Fields.SERVICE_PATH, new org.apache.thrift.meta_data.FieldMetaData("servicePath", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TBackendInfo.class, metaDataMap);
  }

  public TBackendInfo() {
  }

  public TBackendInfo(
    java.lang.String host,
    int port,
    long startRange,
    int weight,
    TBackendStatus status,
    java.lang.String servicePath)
  {
    this();
    this.host = host;
    this.port = port;
    setPortIsSet(true);
    this.startRange = startRange;
    setStartRangeIsSet(true);
    this.weight = weight;
    setWeightIsSet(true);
    this.status = status;
    this.servicePath = servicePath;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TBackendInfo(TBackendInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetHost()) {
      this.host = other.host;
    }
    this.port = other.port;
    this.startRange = other.startRange;
    this.weight = other.weight;
    if (other.isSetStatus()) {
      this.status = other.status;
    }
    if (other.isSetServicePath()) {
      this.servicePath = other.servicePath;
    }
  }

  public TBackendInfo deepCopy() {
    return new TBackendInfo(this);
  }

  @Override
  public void clear() {
    this.host = null;
    setPortIsSet(false);
    this.port = 0;
    setStartRangeIsSet(false);
    this.startRange = 0;
    setWeightIsSet(false);
    this.weight = 0;
    this.status = null;
    this.servicePath = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getHost() {
    return this.host;
  }

  public TBackendInfo setHost(@org.apache.thrift.annotation.Nullable java.lang.String host) {
    this.host = host;
    return this;
  }

  public void unsetHost() {
    this.host = null;
  }

  /** Returns true if field host is set (has been assigned a value) and false otherwise */
  public boolean isSetHost() {
    return this.host != null;
  }

  public void setHostIsSet(boolean value) {
    if (!value) {
      this.host = null;
    }
  }

  public int getPort() {
    return this.port;
  }

  public TBackendInfo setPort(int port) {
    this.port = port;
    setPortIsSet(true);
    return this;
  }

  public void unsetPort() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PORT_ISSET_ID);
  }

  /** Returns true if field port is set (has been assigned a value) and false otherwise */
  public boolean isSetPort() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PORT_ISSET_ID);
  }

  public void setPortIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PORT_ISSET_ID, value);
  }

  public long getStartRange() {
    return this.startRange;
  }

  public TBackendInfo setStartRange(long startRange) {
    this.startRange = startRange;
    setStartRangeIsSet(true);
    return this;
  }

  public void unsetStartRange() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STARTRANGE_ISSET_ID);
  }

  /** Returns true if field startRange is set (has been assigned a value) and false otherwise */
  public boolean isSetStartRange() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STARTRANGE_ISSET_ID);
  }

  public void setStartRangeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STARTRANGE_ISSET_ID, value);
  }

  public int getWeight() {
    return this.weight;
  }

  public TBackendInfo setWeight(int weight) {
    this.weight = weight;
    setWeightIsSet(true);
    return this;
  }

  public void unsetWeight() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __WEIGHT_ISSET_ID);
  }

  /** Returns true if field weight is set (has been assigned a value) and false otherwise */
  public boolean isSetWeight() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __WEIGHT_ISSET_ID);
  }

  public void setWeightIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __WEIGHT_ISSET_ID, value);
  }

  /**
   * 
   * @see TBackendStatus
   */
  @org.apache.thrift.annotation.Nullable
  public TBackendStatus getStatus() {
    return this.status;
  }

  /**
   * 
   * @see TBackendStatus
   */
  public TBackendInfo setStatus(@org.apache.thrift.annotation.Nullable TBackendStatus status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getServicePath() {
    return this.servicePath;
  }

  public TBackendInfo setServicePath(@org.apache.thrift.annotation.Nullable java.lang.String servicePath) {
    this.servicePath = servicePath;
    return this;
  }

  public void unsetServicePath() {
    this.servicePath = null;
  }

  /** Returns true if field servicePath is set (has been assigned a value) and false otherwise */
  public boolean isSetServicePath() {
    return this.servicePath != null;
  }

  public void setServicePathIsSet(boolean value) {
    if (!value) {
      this.servicePath = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case HOST:
      if (value == null) {
        unsetHost();
      } else {
        setHost((java.lang.String)value);
      }
      break;

    case PORT:
      if (value == null) {
        unsetPort();
      } else {
        setPort((java.lang.Integer)value);
      }
      break;

    case START_RANGE:
      if (value == null) {
        unsetStartRange();
      } else {
        setStartRange((java.lang.Long)value);
      }
      break;

    case WEIGHT:
      if (value == null) {
        unsetWeight();
      } else {
        setWeight((java.lang.Integer)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((TBackendStatus)value);
      }
      break;

    case SERVICE_PATH:
      if (value == null) {
        unsetServicePath();
      } else {
        setServicePath((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case HOST:
      return getHost();

    case PORT:
      return getPort();

    case START_RANGE:
      return getStartRange();

    case WEIGHT:
      return getWeight();

    case STATUS:
      return getStatus();

    case SERVICE_PATH:
      return getServicePath();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case HOST:
      return isSetHost();
    case PORT:
      return isSetPort();
    case START_RANGE:
      return isSetStartRange();
    case WEIGHT:
      return isSetWeight();
    case STATUS:
      return isSetStatus();
    case SERVICE_PATH:
      return isSetServicePath();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TBackendInfo)
      return this.equals((TBackendInfo)that);
    return false;
  }

  public boolean equals(TBackendInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_host = true && this.isSetHost();
    boolean that_present_host = true && that.isSetHost();
    if (this_present_host || that_present_host) {
      if (!(this_present_host && that_present_host))
        return false;
      if (!this.host.equals(that.host))
        return false;
    }

    boolean this_present_port = true;
    boolean that_present_port = true;
    if (this_present_port || that_present_port) {
      if (!(this_present_port && that_present_port))
        return false;
      if (this.port != that.port)
        return false;
    }

    boolean this_present_startRange = true;
    boolean that_present_startRange = true;
    if (this_present_startRange || that_present_startRange) {
      if (!(this_present_startRange && that_present_startRange))
        return false;
      if (this.startRange != that.startRange)
        return false;
    }

    boolean this_present_weight = true;
    boolean that_present_weight = true;
    if (this_present_weight || that_present_weight) {
      if (!(this_present_weight && that_present_weight))
        return false;
      if (this.weight != that.weight)
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_servicePath = true && this.isSetServicePath();
    boolean that_present_servicePath = true && that.isSetServicePath();
    if (this_present_servicePath || that_present_servicePath) {
      if (!(this_present_servicePath && that_present_servicePath))
        return false;
      if (!this.servicePath.equals(that.servicePath))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetHost()) ? 131071 : 524287);
    if (isSetHost())
      hashCode = hashCode * 8191 + host.hashCode();

    hashCode = hashCode * 8191 + port;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(startRange);

    hashCode = hashCode * 8191 + weight;

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + status.getValue();

    hashCode = hashCode * 8191 + ((isSetServicePath()) ? 131071 : 524287);
    if (isSetServicePath())
      hashCode = hashCode * 8191 + servicePath.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TBackendInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetHost()).compareTo(other.isSetHost());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHost()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.host, other.host);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPort()).compareTo(other.isSetPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.port, other.port);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStartRange()).compareTo(other.isSetStartRange());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartRange()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startRange, other.startRange);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetWeight()).compareTo(other.isSetWeight());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWeight()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.weight, other.weight);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetServicePath()).compareTo(other.isSetServicePath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServicePath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.servicePath, other.servicePath);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TBackendInfo(");
    boolean first = true;

    sb.append("host:");
    if (this.host == null) {
      sb.append("null");
    } else {
      sb.append(this.host);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("port:");
    sb.append(this.port);
    first = false;
    if (!first) sb.append(", ");
    sb.append("startRange:");
    sb.append(this.startRange);
    first = false;
    if (!first) sb.append(", ");
    sb.append("weight:");
    sb.append(this.weight);
    first = false;
    if (!first) sb.append(", ");
    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("servicePath:");
    if (this.servicePath == null) {
      sb.append("null");
    } else {
      sb.append(this.servicePath);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TBackendInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TBackendInfoStandardScheme getScheme() {
      return new TBackendInfoStandardScheme();
    }
  }

  private static class TBackendInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<TBackendInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TBackendInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HOST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.host = iprot.readString();
              struct.setHostIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.port = iprot.readI32();
              struct.setPortIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // START_RANGE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.startRange = iprot.readI64();
              struct.setStartRangeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // WEIGHT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.weight = iprot.readI32();
              struct.setWeightIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = openstars.distributed.TBackendStatus.findByValue(iprot.readI32());
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // SERVICE_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.servicePath = iprot.readString();
              struct.setServicePathIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TBackendInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.host != null) {
        oprot.writeFieldBegin(HOST_FIELD_DESC);
        oprot.writeString(struct.host);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PORT_FIELD_DESC);
      oprot.writeI32(struct.port);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(START_RANGE_FIELD_DESC);
      oprot.writeI64(struct.startRange);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(WEIGHT_FIELD_DESC);
      oprot.writeI32(struct.weight);
      oprot.writeFieldEnd();
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        oprot.writeI32(struct.status.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.servicePath != null) {
        oprot.writeFieldBegin(SERVICE_PATH_FIELD_DESC);
        oprot.writeString(struct.servicePath);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TBackendInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TBackendInfoTupleScheme getScheme() {
      return new TBackendInfoTupleScheme();
    }
  }

  private static class TBackendInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<TBackendInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TBackendInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetHost()) {
        optionals.set(0);
      }
      if (struct.isSetPort()) {
        optionals.set(1);
      }
      if (struct.isSetStartRange()) {
        optionals.set(2);
      }
      if (struct.isSetWeight()) {
        optionals.set(3);
      }
      if (struct.isSetStatus()) {
        optionals.set(4);
      }
      if (struct.isSetServicePath()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetHost()) {
        oprot.writeString(struct.host);
      }
      if (struct.isSetPort()) {
        oprot.writeI32(struct.port);
      }
      if (struct.isSetStartRange()) {
        oprot.writeI64(struct.startRange);
      }
      if (struct.isSetWeight()) {
        oprot.writeI32(struct.weight);
      }
      if (struct.isSetStatus()) {
        oprot.writeI32(struct.status.getValue());
      }
      if (struct.isSetServicePath()) {
        oprot.writeString(struct.servicePath);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TBackendInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.host = iprot.readString();
        struct.setHostIsSet(true);
      }
      if (incoming.get(1)) {
        struct.port = iprot.readI32();
        struct.setPortIsSet(true);
      }
      if (incoming.get(2)) {
        struct.startRange = iprot.readI64();
        struct.setStartRangeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.weight = iprot.readI32();
        struct.setWeightIsSet(true);
      }
      if (incoming.get(4)) {
        struct.status = openstars.distributed.TBackendStatus.findByValue(iprot.readI32());
        struct.setStatusIsSet(true);
      }
      if (incoming.get(5)) {
        struct.servicePath = iprot.readString();
        struct.setServicePathIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

