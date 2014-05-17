/* Generated By:JavaCC: Do not edit this line. AttributeDefParserConstants.java */
package org.mxupdate.update.datamodel.attribute;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface AttributeDefParserConstants_mxJPO {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int DESCRIPTION = 5;
  /** RegularExpression Id. */
  int DEFAULTVALUE = 6;
  /** RegularExpression Id. */
  int HIDDEN_TRUE = 7;
  /** RegularExpression Id. */
  int HIDDEN_FALSE = 8;
  /** RegularExpression Id. */
  int RESETONCLONE_TRUE = 9;
  /** RegularExpression Id. */
  int RESETONCLONE_FALSE = 10;
  /** RegularExpression Id. */
  int RESETONREVISION_TRUE = 11;
  /** RegularExpression Id. */
  int RESETONREVISION_FALSE = 12;
  /** RegularExpression Id. */
  int RANGEVALUE_TRUE = 13;
  /** RegularExpression Id. */
  int RANGEVALUE_FALSE = 14;
  /** RegularExpression Id. */
  int MULTILINE_TRUE = 15;
  /** RegularExpression Id. */
  int MULTILINE_FALSE = 16;
  /** RegularExpression Id. */
  int MAXLENGTH = 17;
  /** RegularExpression Id. */
  int RULE = 18;
  /** RegularExpression Id. */
  int TRIG_MODIFY_ACTION = 19;
  /** RegularExpression Id. */
  int TRIG_MODIFY_CHECK = 20;
  /** RegularExpression Id. */
  int TRIG_MODIFY_OVERRIDE = 21;
  /** RegularExpression Id. */
  int RANGE_EQUAL = 22;
  /** RegularExpression Id. */
  int RANGE_GREATERTHAN = 23;
  /** RegularExpression Id. */
  int RANGE_GREATERTHANEQUAL = 24;
  /** RegularExpression Id. */
  int RANGE_LESSTHAN = 25;
  /** RegularExpression Id. */
  int RANGE_LESSTHANEQUAL = 26;
  /** RegularExpression Id. */
  int RANGE_NOTEQUAL = 27;
  /** RegularExpression Id. */
  int RANGE_MATCH = 28;
  /** RegularExpression Id. */
  int RANGE_NOTMATCH = 29;
  /** RegularExpression Id. */
  int RANGE_SMATCH = 30;
  /** RegularExpression Id. */
  int RANGE_NOTSMATCH = 31;
  /** RegularExpression Id. */
  int RANGE_PROGRAM = 32;
  /** RegularExpression Id. */
  int RANGE_BETWEEN = 33;
  /** RegularExpression Id. */
  int INPUT = 34;
  /** RegularExpression Id. */
  int STRING = 39;
  /** RegularExpression Id. */
  int SINGLE = 40;
  /** RegularExpression Id. */
  int APOSTROPHE = 41;
  /** RegularExpression Id. */
  int CHAR = 42;
  /** RegularExpression Id. */
  int MAXLENGTH_NUMBER = 47;
  /** RegularExpression Id. */
  int TRIGPROG_STRING = 52;
  /** RegularExpression Id. */
  int TRIGPROG_SINGLE = 53;
  /** RegularExpression Id. */
  int TRIGGERPROGNAME_APOSTROPHE = 54;
  /** RegularExpression Id. */
  int TRIGGERPROGNAME_CHAR = 55;
  /** RegularExpression Id. */
  int TRIGGERINPUT = 60;
  /** RegularExpression Id. */
  int BETW1_STRING = 65;
  /** RegularExpression Id. */
  int BETW1_SINGLE = 66;
  /** RegularExpression Id. */
  int BETW1_APOSTROPHE = 67;
  /** RegularExpression Id. */
  int BETW1_CHAR = 68;
  /** RegularExpression Id. */
  int BETW2_INCLUSIVE = 73;
  /** RegularExpression Id. */
  int BETW2_EXCLUSIVE = 74;
  /** RegularExpression Id. */
  int BETW3_STRING = 79;
  /** RegularExpression Id. */
  int BETW3_SINGLE = 80;
  /** RegularExpression Id. */
  int BETW3_APOSTROPHE = 81;
  /** RegularExpression Id. */
  int BETW3_CHAR = 82;
  /** RegularExpression Id. */
  int BETW4_INCLUSIVE = 87;
  /** RegularExpression Id. */
  int BETW4_EXCLUSIVE = 88;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int STRING_EXPECTED = 1;
  /** Lexical state. */
  int MAXLENGTH_EXPECTED = 2;
  /** Lexical state. */
  int TRIGGERPROGNAME_EXPECTED = 3;
  /** Lexical state. */
  int TRIGGERINPUT_EXPECTED = 4;
  /** Lexical state. */
  int BETW1_EXPECTED = 5;
  /** Lexical state. */
  int BETW2_EXPECTED = 6;
  /** Lexical state. */
  int BETW3_EXPECTED = 7;
  /** Lexical state. */
  int BETW4_EXPECTED = 8;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\r\"",
    "\"\\t\"",
    "\"\\n\"",
    "\"description\"",
    "\"default\"",
    "\"hidden\"",
    "\"!hidden\"",
    "\"resetonclone\"",
    "\"!resetonclone\"",
    "\"resetonrevision\"",
    "\"!resetonrevision\"",
    "\"rangevalue\"",
    "\"!rangevalue\"",
    "\"multiline\"",
    "\"!multiline\"",
    "\"maxlength\"",
    "\"rule\"",
    "<TRIG_MODIFY_ACTION>",
    "<TRIG_MODIFY_CHECK>",
    "<TRIG_MODIFY_OVERRIDE>",
    "<RANGE_EQUAL>",
    "<RANGE_GREATERTHAN>",
    "<RANGE_GREATERTHANEQUAL>",
    "<RANGE_LESSTHAN>",
    "<RANGE_LESSTHANEQUAL>",
    "<RANGE_NOTEQUAL>",
    "<RANGE_MATCH>",
    "<RANGE_NOTMATCH>",
    "<RANGE_SMATCH>",
    "<RANGE_NOTSMATCH>",
    "<RANGE_PROGRAM>",
    "<RANGE_BETWEEN>",
    "\"input\"",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "<STRING>",
    "<SINGLE>",
    "\"\\\"\"",
    "<CHAR>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "<MAXLENGTH_NUMBER>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "<TRIGPROG_STRING>",
    "<TRIGPROG_SINGLE>",
    "\"\\\"\"",
    "<TRIGGERPROGNAME_CHAR>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"input\"",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "<BETW1_STRING>",
    "<BETW1_SINGLE>",
    "\"\\\"\"",
    "<BETW1_CHAR>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"inclusive\"",
    "\"exclusive\"",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "<BETW3_STRING>",
    "<BETW3_SINGLE>",
    "\"\\\"\"",
    "<BETW3_CHAR>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"inclusive\"",
    "\"exclusive\"",
  };

}