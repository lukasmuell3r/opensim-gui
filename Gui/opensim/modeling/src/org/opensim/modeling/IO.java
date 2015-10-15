/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class IO {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public IO(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(IO obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_IO(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static String ConstructDateAndTimeStamp() {
    return opensimModelJNI.IO_ConstructDateAndTimeStamp();
  }

  public static String FixSlashesInFilePath(String path) {
    return opensimModelJNI.IO_FixSlashesInFilePath(path);
  }

  public static void SetScientific(boolean aTrueFalse) {
    opensimModelJNI.IO_SetScientific(aTrueFalse);
  }

  public static boolean GetScientific() {
    return opensimModelJNI.IO_GetScientific();
  }

  public static void SetGFormatForDoubleOutput(boolean aTrueFalse) {
    opensimModelJNI.IO_SetGFormatForDoubleOutput(aTrueFalse);
  }

  public static boolean GetGFormatForDoubleOutput() {
    return opensimModelJNI.IO_GetGFormatForDoubleOutput();
  }

  public static void SetDigitsPad(int aPad) {
    opensimModelJNI.IO_SetDigitsPad(aPad);
  }

  public static int GetDigitsPad() {
    return opensimModelJNI.IO_GetDigitsPad();
  }

  public static void SetPrecision(int aPlaces) {
    opensimModelJNI.IO_SetPrecision(aPlaces);
  }

  public static int GetPrecision() {
    return opensimModelJNI.IO_GetPrecision();
  }

  public static String GetDoubleOutputFormat() {
    return opensimModelJNI.IO_GetDoubleOutputFormat();
  }

  public static void SetPrintOfflineDocuments(boolean aTrueFalse) {
    opensimModelJNI.IO_SetPrintOfflineDocuments(aTrueFalse);
  }

  public static boolean GetPrintOfflineDocuments() {
    return opensimModelJNI.IO_GetPrintOfflineDocuments();
  }

  public static int makeDir(String aDirName) {
    return opensimModelJNI.IO_makeDir(aDirName);
  }

  public static int chDir(String aDirName) {
    return opensimModelJNI.IO_chDir(aDirName);
  }

  public static String getCwd() {
    return opensimModelJNI.IO_getCwd();
  }

  public static String getParentDirectory(String fileName) {
    return opensimModelJNI.IO_getParentDirectory(fileName);
  }

  public static String GetFileNameFromURI(String aURI) {
    return opensimModelJNI.IO_GetFileNameFromURI(aURI);
  }

  public static String formatText(String aComment, String leadingWhitespace, int width, String endlineTokenToInsert) {
    return opensimModelJNI.IO_formatText__SWIG_0(aComment, leadingWhitespace, width, endlineTokenToInsert);
  }

  public static String formatText(String aComment, String leadingWhitespace, int width) {
    return opensimModelJNI.IO_formatText__SWIG_1(aComment, leadingWhitespace, width);
  }

  public static String GetSuffix(String aStr, int aLen) {
    return opensimModelJNI.IO_GetSuffix(aStr, aLen);
  }

  public static void RemoveSuffix(SWIGTYPE_p_std__string rStr, int aLen) {
    opensimModelJNI.IO_RemoveSuffix(SWIGTYPE_p_std__string.getCPtr(rStr), aLen);
  }

  public static String replaceSubstring(String aStr, String aFrom, String aTo) {
    return opensimModelJNI.IO_replaceSubstring(aStr, aFrom, aTo);
  }

  public static void TrimLeadingWhitespace(SWIGTYPE_p_std__string rStr) {
    opensimModelJNI.IO_TrimLeadingWhitespace(SWIGTYPE_p_std__string.getCPtr(rStr));
  }

  public static void TrimTrailingWhitespace(SWIGTYPE_p_std__string rStr) {
    opensimModelJNI.IO_TrimTrailingWhitespace(SWIGTYPE_p_std__string.getCPtr(rStr));
  }

  public static void TrimWhitespace(SWIGTYPE_p_std__string rStr) {
    opensimModelJNI.IO_TrimWhitespace(SWIGTYPE_p_std__string.getCPtr(rStr));
  }

  public static String Lowercase(String aStr) {
    return opensimModelJNI.IO_Lowercase(aStr);
  }

  public static String Uppercase(String aStr) {
    return opensimModelJNI.IO_Uppercase(aStr);
  }

  public IO() {
    this(opensimModelJNI.new_IO(), true);
  }

}
