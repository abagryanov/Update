/* Generated By:JavaCC: Do not edit this line. PolicyDefParserConstants.java */
package org.mxupdate.update.datamodel.policy;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
interface PolicyDefParserConstants_mxJPO {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int DESCRIPTION = 5;
  /** RegularExpression Id. */
  int TYPE = 6;
  /** RegularExpression Id. */
  int FORMAT = 7;
  /** RegularExpression Id. */
  int STORE = 8;
  /** RegularExpression Id. */
  int DEFAULTFORMAT = 9;
  /** RegularExpression Id. */
  int DELIMITER = 10;
  /** RegularExpression Id. */
  int SEQUENCE = 11;
  /** RegularExpression Id. */
  int MINORSEQUENCE = 12;
  /** RegularExpression Id. */
  int MAJORSEQUENCE = 13;
  /** RegularExpression Id. */
  int HIDDEN = 14;
  /** RegularExpression Id. */
  int STATE = 15;
  /** RegularExpression Id. */
  int ALLSTATE = 16;
  /** RegularExpression Id. */
  int REGISTEREDNAME = 17;
  /** RegularExpression Id. */
  int REVISION = 18;
  /** RegularExpression Id. */
  int MINORREVISION = 19;
  /** RegularExpression Id. */
  int MAJORREVISION = 20;
  /** RegularExpression Id. */
  int VERSION = 21;
  /** RegularExpression Id. */
  int PROMOTE = 22;
  /** RegularExpression Id. */
  int CHECKOUTHISTORY = 23;
  /** RegularExpression Id. */
  int REVOKE = 24;
  /** RegularExpression Id. */
  int LOGIN = 25;
  /** RegularExpression Id. */
  int OWNER = 26;
  /** RegularExpression Id. */
  int PUBLIC = 27;
  /** RegularExpression Id. */
  int USER = 28;
  /** RegularExpression Id. */
  int FILTER = 29;
  /** RegularExpression Id. */
  int ACTION = 30;
  /** RegularExpression Id. */
  int CHECK = 31;
  /** RegularExpression Id. */
  int OVERRIDE = 32;
  /** RegularExpression Id. */
  int INPUT = 33;
  /** RegularExpression Id. */
  int TRIGGER = 34;
  /** RegularExpression Id. */
  int APPROVE = 35;
  /** RegularExpression Id. */
  int IGNORE = 36;
  /** RegularExpression Id. */
  int REJECT = 37;
  /** RegularExpression Id. */
  int BRANCH = 38;
  /** RegularExpression Id. */
  int SIGNATURE = 39;
  /** RegularExpression Id. */
  int ROUTE = 40;
  /** RegularExpression Id. */
  int BOOLEAN_TRUE = 45;
  /** RegularExpression Id. */
  int BOOLEAN_FALSE = 46;
  /** RegularExpression Id. */
  int BOOLEAN_TRUESTR = 47;
  /** RegularExpression Id. */
  int BOOLEAN_FALSESTR = 48;
  /** RegularExpression Id. */
  int DELIMITER_CHAR = 53;
  /** RegularExpression Id. */
  int DELIMITER_CHARSTR = 54;
  /** RegularExpression Id. */
  int LS_CURLY_BRACKET_OPEN = 59;
  /** RegularExpression Id. */
  int LS_CURLY_BRACKET_CLOSE = 60;
  /** RegularExpression Id. */
  int LS_STRING = 61;
  /** RegularExpression Id. */
  int LS_SINGLE_STRING = 62;
  /** RegularExpression Id. */
  int LS_APOSTROPHE = 63;
  /** RegularExpression Id. */
  int LS_CHAR = 64;
  /** RegularExpression Id. */
  int SL_STRING = 69;
  /** RegularExpression Id. */
  int SL_SINGLE_STRING = 70;
  /** RegularExpression Id. */
  int SL_APOSTROPHE = 71;
  /** RegularExpression Id. */
  int SL_CHAR = 72;
  /** RegularExpression Id. */
  int S_STRING = 77;
  /** RegularExpression Id. */
  int S_SINGLE_STRING = 78;
  /** RegularExpression Id. */
  int S_APOSTROPHE = 79;
  /** RegularExpression Id. */
  int S_CHAR = 80;
  /** RegularExpression Id. */
  int LALL_CURLY_BRACKET_OPEN = 85;
  /** RegularExpression Id. */
  int LALL_ALL = 86;
  /** RegularExpression Id. */
  int L_CURLY_BRACKET_OPEN = 91;
  /** RegularExpression Id. */
  int L_CURLY_BRACKET_CLOSE = 96;
  /** RegularExpression Id. */
  int L_STRING = 97;
  /** RegularExpression Id. */
  int L_SINGLE_STRING = 98;
  /** RegularExpression Id. */
  int L_APOSTROPHE = 99;
  /** RegularExpression Id. */
  int L_CHAR = 100;
  /** RegularExpression Id. */
  int L2_CURLY_BRACKET_OPEN = 101;
  /** RegularExpression Id. */
  int L3_BRACE_STRING = 102;
  /** RegularExpression Id. */
  int L3_CHAR = 103;
  /** RegularExpression Id. */
  int L4_CURLY_BRACKET_CLOSE = 104;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int B_EXPECTED = 1;
  /** Lexical state. */
  int D_EXPECTED = 2;
  /** Lexical state. */
  int LS_EXPECTED = 3;
  /** Lexical state. */
  int SL_EXPECTED = 4;
  /** Lexical state. */
  int S_EXPECTED = 5;
  /** Lexical state. */
  int LALL_EXPECTED = 6;
  /** Lexical state. */
  int L_EXPECTED = 7;
  /** Lexical state. */
  int L2_EXPECTED = 8;
  /** Lexical state. */
  int L3_EXPECTED = 9;
  /** Lexical state. */
  int L4_EXPECTED = 10;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"description\"",
    "\"type\"",
    "\"format\"",
    "\"store\"",
    "\"defaultformat\"",
    "\"delimiter\"",
    "\"sequence\"",
    "\"minorsequence\"",
    "\"majorsequence\"",
    "\"hidden\"",
    "\"state\"",
    "\"allstate\"",
    "\"registeredName\"",
    "\"revision\"",
    "\"minorrevision\"",
    "\"majorrevision\"",
    "\"version\"",
    "\"promote\"",
    "\"checkouthistory\"",
    "\"revoke\"",
    "\"login\"",
    "\"owner\"",
    "\"public\"",
    "\"user\"",
    "\"filter\"",
    "\"action\"",
    "\"check\"",
    "\"override\"",
    "\"input\"",
    "\"trigger\"",
    "\"approve\"",
    "\"ignore\"",
    "\"reject\"",
    "\"branch\"",
    "\"signature\"",
    "\"route\"",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "<BOOLEAN_TRUE>",
    "<BOOLEAN_FALSE>",
    "<BOOLEAN_TRUESTR>",
    "<BOOLEAN_FALSESTR>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "<DELIMITER_CHAR>",
    "<DELIMITER_CHARSTR>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"{\"",
    "\"}\"",
    "<LS_STRING>",
    "<LS_SINGLE_STRING>",
    "\"\\\"\"",
    "<LS_CHAR>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "<SL_STRING>",
    "<SL_SINGLE_STRING>",
    "\"\\\"\"",
    "<SL_CHAR>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "<S_STRING>",
    "<S_SINGLE_STRING>",
    "\"\\\"\"",
    "<S_CHAR>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"{\"",
    "\"all\"",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"{\"",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"}\"",
    "<L_STRING>",
    "<L_SINGLE_STRING>",
    "\"\\\"\"",
    "<L_CHAR>",
    "\"{\"",
    "<L3_BRACE_STRING>",
    "<L3_CHAR>",
    "\"}\"",
    "\"{\"",
    "\"}\"",
  };

}
