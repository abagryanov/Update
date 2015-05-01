/* PersonAdminParser.java */
/* Generated By:JavaCC: Do not edit this line. PersonAdminParser.java */
package org.mxupdate.update.user;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

import org.mxupdate.mapping.TypeDef_mxJPO;
import org.mxupdate.update.user.PersonAdmin_mxJPO.TypeItem;
import org.mxupdate.update.util.AbstractParser_mxJPO;
import org.mxupdate.update.util.AbstractParser_mxJPO.ParseException;
import org.mxupdate.update.util.AbstractParser_mxJPO.SimpleCharStream;
import org.mxupdate.update.util.AbstractParser_mxJPO.Token;
import org.mxupdate.update.util.AbstractParser_mxJPO.TokenMgrError;
import org.mxupdate.update.util.AdminPropertyList_mxJPO.AdminProperty;

@SuppressWarnings("unused")
class PersonAdminParser_mxJPO
    extends AbstractParser_mxJPO<PersonAdmin_mxJPO> implements PersonAdminParserConstants_mxJPO {

/**************************************************************************** */

/**
 * Parses one complete person definition.
 *
 * @param _personAdmin  target admin person to update with parsed values
 */
  final public void parse(final PersonAdmin_mxJPO _personAdmin) throws ParseException, SecurityException, IllegalArgumentException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {Token tmp;
    AdminProperty property;
    jj_consume_token(KIND);
    jj_consume_token(KIND_ADMIN);
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case COMMENT:
      case HIDDEN_TRUE:
      case HIDDEN_FALSE:
      case ACTIVE_TRUE:
      case ACTIVE_FALSE:
      case TRUSTED_TRUE:
      case TRUSTED_FALSE:
      case EMAIL_TRUE:
      case EMAIL_FALSE:
      case INCONMAIL_TRUE:
      case INCONMAIL_FALSE:
      case VAULT:
      case APPLICATION:
      case SITE:
      case GROUP:
      case ROLE:
      case ADDRESS:
      case EMAILADDRESS:
      case FAX:
      case FULLNAME:
      case PHONE:
      case ACCESS:
      case ADMIN:
      case TYPE:
      case PRODUCT:
      case PROPERTY:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case COMMENT:{
        jj_consume_token(COMMENT);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case MULTILINESTRING:{
          tmp = jj_consume_token(MULTILINESTRING);
this.setValue(_personAdmin, "description",                     this.getString(tmp.image));
          break;
          }
        case MULTILINESINGLE:{
          tmp = jj_consume_token(MULTILINESINGLE);
this.setValue(_personAdmin, "description",                     this.getSingle(tmp.image));
          break;
          }
        default:
          jj_la1[1] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case HIDDEN_TRUE:{
        jj_consume_token(HIDDEN_TRUE);
this.setValue(_personAdmin, "hidden",                          true);
        break;
        }
      case HIDDEN_FALSE:{
        jj_consume_token(HIDDEN_FALSE);
this.setValue(_personAdmin, "hidden",                          false);
        break;
        }
      case ACTIVE_TRUE:{
        jj_consume_token(ACTIVE_TRUE);
this.setValue(_personAdmin, "active",                          true);
        break;
        }
      case ACTIVE_FALSE:{
        jj_consume_token(ACTIVE_FALSE);
this.setValue(_personAdmin, "active",                          false);
        break;
        }
      case TRUSTED_TRUE:{
        jj_consume_token(TRUSTED_TRUE);
this.setValue(_personAdmin, "trusted",                         true);
        break;
        }
      case TRUSTED_FALSE:{
        jj_consume_token(TRUSTED_FALSE);
this.setValue(_personAdmin, "trusted",                         false);
        break;
        }
      case ACCESS:{
        jj_consume_token(ACCESS);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case ACCESS_ALL:{
          jj_consume_token(ACCESS_ALL);
this.appendValue(_personAdmin, "access",                       "all");
          break;
          }
        case ACCESS_OPEN:{
          jj_consume_token(ACCESS_OPEN);
          label_2:
          while (true) {
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case ACCESS_EXPECTED_SINGLE:{
              ;
              break;
              }
            default:
              jj_la1[2] = jj_gen;
              break label_2;
            }
            tmp = jj_consume_token(ACCESS_EXPECTED_SINGLE);
this.appendValue(_personAdmin, "access",                       this.getString(tmp.image));
          }
          jj_consume_token(ACCESS_CLOSE);
          break;
          }
        default:
          jj_la1[3] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case ADMIN:{
        jj_consume_token(ADMIN);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case ADMIN_ALL:{
          jj_consume_token(ADMIN_ALL);
this.appendValue(_personAdmin, "admin",                        "all");
          break;
          }
        case ADMIN_OPEN:{
          jj_consume_token(ADMIN_OPEN);
          label_3:
          while (true) {
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case ADMIN_EXPECTED_SINGLE:{
              ;
              break;
              }
            default:
              jj_la1[4] = jj_gen;
              break label_3;
            }
            tmp = jj_consume_token(ADMIN_EXPECTED_SINGLE);
this.appendValue(_personAdmin, "admin",                        this.getString(tmp.image));
          }
          jj_consume_token(ADMIN_CLOSE);
          break;
          }
        default:
          jj_la1[5] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case EMAIL_TRUE:{
        jj_consume_token(EMAIL_TRUE);
this.setValue(_personAdmin, "email",                           true);
        break;
        }
      case EMAIL_FALSE:{
        jj_consume_token(EMAIL_FALSE);
this.setValue(_personAdmin, "email",                           false);
        break;
        }
      case INCONMAIL_TRUE:{
        jj_consume_token(INCONMAIL_TRUE);
this.setValue(_personAdmin, "iconmail",                        true);
        break;
        }
      case INCONMAIL_FALSE:{
        jj_consume_token(INCONMAIL_FALSE);
this.setValue(_personAdmin, "iconmail",                        false);
        break;
        }
      case ADDRESS:{
        jj_consume_token(ADDRESS);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STRING:{
          tmp = jj_consume_token(STRING);
this.setValue(_personAdmin, "address",                         this.getString(tmp.image));
          break;
          }
        case SINGLE:{
          tmp = jj_consume_token(SINGLE);
this.setValue(_personAdmin, "address",                         this.getSingle(tmp.image));
          break;
          }
        default:
          jj_la1[6] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case EMAILADDRESS:{
        jj_consume_token(EMAILADDRESS);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STRING:{
          tmp = jj_consume_token(STRING);
this.setValue(_personAdmin, "emailAddress",                    this.getString(tmp.image));
          break;
          }
        case SINGLE:{
          tmp = jj_consume_token(SINGLE);
this.setValue(_personAdmin, "emailAddress",                    this.getSingle(tmp.image));
          break;
          }
        default:
          jj_la1[7] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case FAX:{
        jj_consume_token(FAX);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STRING:{
          tmp = jj_consume_token(STRING);
this.setValue(_personAdmin, "fax",                             this.getString(tmp.image));
          break;
          }
        case SINGLE:{
          tmp = jj_consume_token(SINGLE);
this.setValue(_personAdmin, "fax",                             this.getSingle(tmp.image));
          break;
          }
        default:
          jj_la1[8] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case FULLNAME:{
        jj_consume_token(FULLNAME);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STRING:{
          tmp = jj_consume_token(STRING);
this.setValue(_personAdmin, "fullName",                        this.getString(tmp.image));
          break;
          }
        case SINGLE:{
          tmp = jj_consume_token(SINGLE);
this.setValue(_personAdmin, "fullName",                        this.getSingle(tmp.image));
          break;
          }
        default:
          jj_la1[9] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case PHONE:{
        jj_consume_token(PHONE);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STRING:{
          tmp = jj_consume_token(STRING);
this.setValue(_personAdmin, "phone",                           this.getString(tmp.image));
          break;
          }
        case SINGLE:{
          tmp = jj_consume_token(SINGLE);
this.setValue(_personAdmin, "phone",                           this.getSingle(tmp.image));
          break;
          }
        default:
          jj_la1[10] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case PRODUCT:{
        jj_consume_token(PRODUCT);
        jj_consume_token(PRODUCT_OPEN);
        label_4:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case PRODUCT_EXPECTED_SINGLE:{
            ;
            break;
            }
          default:
            jj_la1[11] = jj_gen;
            break label_4;
          }
          tmp = jj_consume_token(PRODUCT_EXPECTED_SINGLE);
this.appendValue(_personAdmin, "products",                     this.getString(tmp.image));
        }
        jj_consume_token(PRODUCT_CLOSE);
        break;
        }
      case TYPE:{
        jj_consume_token(TYPE);
        jj_consume_token(TYPE_OPEN);
        label_5:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case TYPE_APPLICATION:
          case TYPE_FULL:
          case TYPE_BUSINESS:
          case TYPE_SYSTEM:{
            ;
            break;
            }
          default:
            jj_la1[12] = jj_gen;
            break label_5;
          }
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case TYPE_APPLICATION:{
            jj_consume_token(TYPE_APPLICATION);
this.appendValue(_personAdmin, "types",                        TypeItem.APPLICATION);
            break;
            }
          case TYPE_FULL:{
            jj_consume_token(TYPE_FULL);
this.appendValue(_personAdmin, "types",                        TypeItem.FULL);
            break;
            }
          case TYPE_BUSINESS:{
            jj_consume_token(TYPE_BUSINESS);
this.appendValue(_personAdmin, "types",                        TypeItem.BUSINESS);
            break;
            }
          case TYPE_SYSTEM:{
            jj_consume_token(TYPE_SYSTEM);
this.appendValue(_personAdmin, "types",                        TypeItem.SYSTEM);
            break;
            }
          default:
            jj_la1[13] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
        }
        jj_consume_token(TYPE_CLOSE);
        break;
        }
      case VAULT:{
        jj_consume_token(VAULT);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STRING:{
          tmp = jj_consume_token(STRING);
this.setValue(_personAdmin, "vault",                           this.getString(tmp.image));
          break;
          }
        case SINGLE:{
          tmp = jj_consume_token(SINGLE);
this.setValue(_personAdmin, "vault",                           this.getSingle(tmp.image));
          break;
          }
        default:
          jj_la1[14] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case APPLICATION:{
        jj_consume_token(APPLICATION);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STRING:{
          tmp = jj_consume_token(STRING);
this.setValue(_personAdmin, "application",                     this.getString(tmp.image));
          break;
          }
        case SINGLE:{
          tmp = jj_consume_token(SINGLE);
this.setValue(_personAdmin, "application",                     this.getSingle(tmp.image));
          break;
          }
        default:
          jj_la1[15] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case SITE:{
        jj_consume_token(SITE);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STRING:{
          tmp = jj_consume_token(STRING);
this.setValue(_personAdmin, "site",                            this.getString(tmp.image));
          break;
          }
        case SINGLE:{
          tmp = jj_consume_token(SINGLE);
this.setValue(_personAdmin, "site",                            this.getSingle(tmp.image));
          break;
          }
        default:
          jj_la1[16] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case GROUP:{
        jj_consume_token(GROUP);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STRING:{
          tmp = jj_consume_token(STRING);
this.appendValue(_personAdmin, "groups",                       this.getString(tmp.image));
          break;
          }
        case SINGLE:{
          tmp = jj_consume_token(SINGLE);
this.appendValue(_personAdmin, "groups",                       this.getSingle(tmp.image));
          break;
          }
        default:
          jj_la1[17] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case ROLE:{
        jj_consume_token(ROLE);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STRING:{
          tmp = jj_consume_token(STRING);
this.appendValue(_personAdmin, "roles",                        this.getString(tmp.image));
          break;
          }
        case SINGLE:{
          tmp = jj_consume_token(SINGLE);
this.appendValue(_personAdmin, "roles",                        this.getSingle(tmp.image));
          break;
          }
        default:
          jj_la1[18] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case PROPERTY:{
        jj_consume_token(PROPERTY);
property = new AdminProperty();this.appendValue(_personAdmin, "properties", "propertiesStack", property);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STRING:{
          tmp = jj_consume_token(STRING);
this.setValue(property, "name", this.getString(tmp.image));
          break;
          }
        case SINGLE:{
          tmp = jj_consume_token(SINGLE);
this.setValue(property, "name", this.getSingle(tmp.image));
          break;
          }
        default:
          jj_la1[19] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        label_6:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case PROPERTYTO:
          case PROPERTYVAL:{
            ;
            break;
            }
          default:
            jj_la1[20] = jj_gen;
            break label_6;
          }
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case PROPERTYVAL:{
            jj_consume_token(PROPERTYVAL);
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case STRING:{
              tmp = jj_consume_token(STRING);
this.setValue(property, "value", this.getString(tmp.image));
              break;
              }
            case SINGLE:{
              tmp = jj_consume_token(SINGLE);
this.setValue(property, "value", this.getSingle(tmp.image));
              break;
              }
            default:
              jj_la1[21] = jj_gen;
              jj_consume_token(-1);
              throw new ParseException();
            }
            break;
            }
          case PROPERTYTO:{
            jj_consume_token(PROPERTYTO);
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case ADMINTYPE_STRING:{
              tmp = jj_consume_token(ADMINTYPE_STRING);
this.setValue(property, "refAdminType", this.getString(tmp.image));
              break;
              }
            case ADMINTYPE_SINGLE:{
              tmp = jj_consume_token(ADMINTYPE_SINGLE);
this.setValue(property, "refAdminType", this.getSingle(tmp.image));
              break;
              }
            default:
              jj_la1[22] = jj_gen;
              jj_consume_token(-1);
              throw new ParseException();
            }
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case STRING:{
              tmp = jj_consume_token(STRING);
this.setValue(property, "refAdminName", this.getString(tmp.image));
              break;
              }
            case SINGLE:{
              tmp = jj_consume_token(SINGLE);
this.setValue(property, "refAdminName", this.getSingle(tmp.image));
              break;
              }
            default:
              jj_la1[23] = jj_gen;
              jj_consume_token(-1);
              throw new ParseException();
            }
            break;
            }
          default:
            jj_la1[24] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
        }
        break;
        }
      default:
        jj_la1[25] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  /** Generated Token Manager. */
  public PersonAdminParserTokenManager_mxJPO token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[26];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x7ffffc0,0x60000000,0x0,0x0,0x0,0x0,0x18000000,0x18000000,0x18000000,0x18000000,0x18000000,0x0,0x0,0x0,0x18000000,0x18000000,0x18000000,0x18000000,0x18000000,0x18000000,0x0,0x18000000,0x0,0x18000000,0x0,0x7ffffc0,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x220421,0x0,0x10,0x6,0x200,0xc0,0x0,0x0,0x0,0x0,0x0,0x100000,0x1e000,0x1e000,0x0,0x0,0x0,0x0,0x0,0x0,0xc00000,0x0,0x3000000,0x0,0xc00000,0x220421,};
   }

  /** Constructor with InputStream. */
  public PersonAdminParser_mxJPO(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public PersonAdminParser_mxJPO(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new PersonAdminParserTokenManager_mxJPO(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 26; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 26; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public PersonAdminParser_mxJPO(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new PersonAdminParserTokenManager_mxJPO(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 26; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
      jj_input_stream = new SimpleCharStream(stream, 1, 1);
   } else {
      jj_input_stream.ReInit(stream, 1, 1);
   }
   if (token_source == null) {
      token_source = new PersonAdminParserTokenManager_mxJPO(jj_input_stream);
   }

    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 26; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public PersonAdminParser_mxJPO(PersonAdminParserTokenManager_mxJPO tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 26; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(PersonAdminParserTokenManager_mxJPO tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 26; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[58];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 26; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 58; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
