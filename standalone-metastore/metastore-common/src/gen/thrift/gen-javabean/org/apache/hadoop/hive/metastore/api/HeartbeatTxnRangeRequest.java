/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class HeartbeatTxnRangeRequest implements org.apache.thrift.TBase<HeartbeatTxnRangeRequest, HeartbeatTxnRangeRequest._Fields>, java.io.Serializable, Cloneable, Comparable<HeartbeatTxnRangeRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HeartbeatTxnRangeRequest");

  private static final org.apache.thrift.protocol.TField MIN_FIELD_DESC = new org.apache.thrift.protocol.TField("min", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField MAX_FIELD_DESC = new org.apache.thrift.protocol.TField("max", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new HeartbeatTxnRangeRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new HeartbeatTxnRangeRequestTupleSchemeFactory();

  private long min; // required
  private long max; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MIN((short)1, "min"),
    MAX((short)2, "max");

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
        case 1: // MIN
          return MIN;
        case 2: // MAX
          return MAX;
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
  private static final int __MIN_ISSET_ID = 0;
  private static final int __MAX_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MIN, new org.apache.thrift.meta_data.FieldMetaData("min", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.MAX, new org.apache.thrift.meta_data.FieldMetaData("max", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HeartbeatTxnRangeRequest.class, metaDataMap);
  }

  public HeartbeatTxnRangeRequest() {
  }

  public HeartbeatTxnRangeRequest(
    long min,
    long max)
  {
    this();
    this.min = min;
    setMinIsSet(true);
    this.max = max;
    setMaxIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HeartbeatTxnRangeRequest(HeartbeatTxnRangeRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.min = other.min;
    this.max = other.max;
  }

  public HeartbeatTxnRangeRequest deepCopy() {
    return new HeartbeatTxnRangeRequest(this);
  }

  @Override
  public void clear() {
    setMinIsSet(false);
    this.min = 0;
    setMaxIsSet(false);
    this.max = 0;
  }

  public long getMin() {
    return this.min;
  }

  public void setMin(long min) {
    this.min = min;
    setMinIsSet(true);
  }

  public void unsetMin() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MIN_ISSET_ID);
  }

  /** Returns true if field min is set (has been assigned a value) and false otherwise */
  public boolean isSetMin() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MIN_ISSET_ID);
  }

  public void setMinIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MIN_ISSET_ID, value);
  }

  public long getMax() {
    return this.max;
  }

  public void setMax(long max) {
    this.max = max;
    setMaxIsSet(true);
  }

  public void unsetMax() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MAX_ISSET_ID);
  }

  /** Returns true if field max is set (has been assigned a value) and false otherwise */
  public boolean isSetMax() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MAX_ISSET_ID);
  }

  public void setMaxIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MAX_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case MIN:
      if (value == null) {
        unsetMin();
      } else {
        setMin((java.lang.Long)value);
      }
      break;

    case MAX:
      if (value == null) {
        unsetMax();
      } else {
        setMax((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case MIN:
      return getMin();

    case MAX:
      return getMax();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case MIN:
      return isSetMin();
    case MAX:
      return isSetMax();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof HeartbeatTxnRangeRequest)
      return this.equals((HeartbeatTxnRangeRequest)that);
    return false;
  }

  public boolean equals(HeartbeatTxnRangeRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_min = true;
    boolean that_present_min = true;
    if (this_present_min || that_present_min) {
      if (!(this_present_min && that_present_min))
        return false;
      if (this.min != that.min)
        return false;
    }

    boolean this_present_max = true;
    boolean that_present_max = true;
    if (this_present_max || that_present_max) {
      if (!(this_present_max && that_present_max))
        return false;
      if (this.max != that.max)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(min);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(max);

    return hashCode;
  }

  @Override
  public int compareTo(HeartbeatTxnRangeRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetMin()).compareTo(other.isSetMin());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMin()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.min, other.min);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMax()).compareTo(other.isSetMax());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMax()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.max, other.max);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("HeartbeatTxnRangeRequest(");
    boolean first = true;

    sb.append("min:");
    sb.append(this.min);
    first = false;
    if (!first) sb.append(", ");
    sb.append("max:");
    sb.append(this.max);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetMin()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'min' is unset! Struct:" + toString());
    }

    if (!isSetMax()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'max' is unset! Struct:" + toString());
    }

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

  private static class HeartbeatTxnRangeRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public HeartbeatTxnRangeRequestStandardScheme getScheme() {
      return new HeartbeatTxnRangeRequestStandardScheme();
    }
  }

  private static class HeartbeatTxnRangeRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<HeartbeatTxnRangeRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HeartbeatTxnRangeRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MIN
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.min = iprot.readI64();
              struct.setMinIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MAX
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.max = iprot.readI64();
              struct.setMaxIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, HeartbeatTxnRangeRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(MIN_FIELD_DESC);
      oprot.writeI64(struct.min);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(MAX_FIELD_DESC);
      oprot.writeI64(struct.max);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HeartbeatTxnRangeRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public HeartbeatTxnRangeRequestTupleScheme getScheme() {
      return new HeartbeatTxnRangeRequestTupleScheme();
    }
  }

  private static class HeartbeatTxnRangeRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<HeartbeatTxnRangeRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HeartbeatTxnRangeRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.min);
      oprot.writeI64(struct.max);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HeartbeatTxnRangeRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.min = iprot.readI64();
      struct.setMinIsSet(true);
      struct.max = iprot.readI64();
      struct.setMaxIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
