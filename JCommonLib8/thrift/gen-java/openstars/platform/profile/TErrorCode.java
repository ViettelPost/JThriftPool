/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package openstars.platform.profile;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-08-24")
public enum TErrorCode implements org.apache.thrift.TEnum {
  EGood(0),
  ENotFound(-1),
  EUnknown(-2),
  EDataExisted(-3);

  private final int value;

  private TErrorCode(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static TErrorCode findByValue(int value) { 
    switch (value) {
      case 0:
        return EGood;
      case -1:
        return ENotFound;
      case -2:
        return EUnknown;
      case -3:
        return EDataExisted;
      default:
        return null;
    }
  }
}