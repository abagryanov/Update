/* Generated By:JavaCC: Do not edit this line. FormParserConstants.java */
/*
 *  This file is part of MxUpdate <http://www.mxupdate.org>.
 *
 *  MxUpdate is a deployment tool for a PLM platform to handle
 *  administration objects as single update files (configuration item).
 *
 *  Copyright (C) 2008-2016 The MxUpdate Team - All Rights Reserved
 *
 *  You may use, distribute and modify MxUpdate under the terms of the
 *  MxUpdate license. You should have received a copy of the MxUpdate
 *  license with this file. If not, please write to <info@mxupdate.org>,
 *  or visit <www.mxupdate.org>.
 *
 */

package org.mxupdate.update.userinterface;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
interface FormParserConstants_mxJPO {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int PACKAGE = 5;
  /** RegularExpression Id. */
  int UUID = 6;
  /** RegularExpression Id. */
  int SYMBOLICNAME = 7;
  /** RegularExpression Id. */
  int DESCRIPTION = 8;
  /** RegularExpression Id. */
  int HIDDEN_TRUE = 9;
  /** RegularExpression Id. */
  int HIDDEN_FALSE = 10;
  /** RegularExpression Id. */
  int STRING = 11;
  /** RegularExpression Id. */
  int SINGLE = 12;
  /** RegularExpression Id. */
  int MULTILINESTRING = 13;
  /** RegularExpression Id. */
  int MULTILINESINGLE = 14;
  /** RegularExpression Id. */
  int FIELD = 15;
  /** RegularExpression Id. */
  int FIELD_OPEN = 16;
  /** RegularExpression Id. */
  int FIELD_CLOSE = 17;
  /** RegularExpression Id. */
  int FIELD_NAME = 18;
  /** RegularExpression Id. */
  int FIELD_LABEL = 19;
  /** RegularExpression Id. */
  int FIELD_SELECT = 20;
  /** RegularExpression Id. */
  int FIELD_BOBJ = 21;
  /** RegularExpression Id. */
  int FIELD_REL = 22;
  /** RegularExpression Id. */
  int FIELD_RANGE = 23;
  /** RegularExpression Id. */
  int FIELD_HREF = 24;
  /** RegularExpression Id. */
  int FIELD_ALT = 25;
  /** RegularExpression Id. */
  int FIELD_USER = 26;
  /** RegularExpression Id. */
  int FIELD_SETTING = 27;
  /** RegularExpression Id. */
  int FIELD_STRING = 28;
  /** RegularExpression Id. */
  int FIELD_SINGLE = 29;
  /** RegularExpression Id. */
  int SETTING_STRING = 30;
  /** RegularExpression Id. */
  int SETTING_SINGLE = 31;
  /** RegularExpression Id. */
  int PROPERTY = 32;
  /** RegularExpression Id. */
  int PROPERTYTO = 33;
  /** RegularExpression Id. */
  int PROPERTYVAL = 34;
  /** RegularExpression Id. */
  int ADMINTYPE_STRING = 35;
  /** RegularExpression Id. */
  int ADMINTYPE_SINGLE = 36;

  /** Lexical state. */
  int ADMINREF_EXPECTED = 0;
  /** Lexical state. */
  int SETTING_STRING_EXPECTED = 1;
  /** Lexical state. */
  int FIELD_STRING_EXPECTED = 2;
  /** Lexical state. */
  int FIELD_EXPECTED = 3;
  /** Lexical state. */
  int FIELD_OPENEXPECTED = 4;
  /** Lexical state. */
  int MULTILINESTRING_EXPECTED = 5;
  /** Lexical state. */
  int STRING_EXPECTED = 6;
  /** Lexical state. */
  int DEFAULT = 7;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "<token of kind 4>",
    "\"package\"",
    "\"uuid\"",
    "\"symbolicname\"",
    "\"description\"",
    "\"hidden\"",
    "\"!hidden\"",
    "<STRING>",
    "<SINGLE>",
    "<MULTILINESTRING>",
    "<MULTILINESINGLE>",
    "\"field\"",
    "\"{\"",
    "\"}\"",
    "\"name\"",
    "\"label\"",
    "\"select\"",
    "\"businessobject\"",
    "\"relationship\"",
    "\"range\"",
    "\"href\"",
    "\"alt\"",
    "\"user\"",
    "\"setting\"",
    "<FIELD_STRING>",
    "<FIELD_SINGLE>",
    "<SETTING_STRING>",
    "<SETTING_SINGLE>",
    "\"property\"",
    "\"to\"",
    "\"value\"",
    "<ADMINTYPE_STRING>",
    "<ADMINTYPE_SINGLE>",
  };

}
