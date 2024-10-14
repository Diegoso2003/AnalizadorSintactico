// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: src/main/java/com/mycompany/analizadorsintactico/archivo.flex

package com.mycompany.analizadorsintactico;

//Seccion de imports
import com.mycompany.analizadorsintactico.token.Token;
import com.mycompany.analizadorsintactico.token.TipoToken;
import java.util.ArrayList;
import java.util.List;


@SuppressWarnings("fallthrough")
public class AnalizadorLexico1 {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\10\0\2\1\1\2\2\3\1\2\22\0\1\4\6\0"+
    "\1\5\2\6\2\7\1\6\1\10\1\11\1\7\12\12"+
    "\1\0\1\6\1\13\1\14\1\13\2\0\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\5\0"+
    "\1\46\1\0\32\47\12\0\1\3\u01a2\0\2\3\326\0"+
    "\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\1\1\4\2\5\1\6"+
    "\1\7\25\1\1\10\1\0\1\11\3\0\1\7\3\0"+
    "\1\12\3\0\1\12\23\0\1\13\15\0\1\14\1\15"+
    "\1\0\1\13\1\16\54\0\1\17\11\0\1\20\35\0"+
    "\1\21";

  private static int [] zzUnpackAction() {
    int [] result = new int[169];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\50\0\50\0\50\0\120\0\50\0\50\0\170"+
    "\0\240\0\310\0\360\0\u0118\0\u0140\0\u0168\0\u0190\0\u01b8"+
    "\0\u01e0\0\u0208\0\u0230\0\u0258\0\u0280\0\u02a8\0\u02d0\0\u02f8"+
    "\0\u0320\0\u0348\0\u0370\0\u0398\0\u03c0\0\u03e8\0\u0410\0\u0438"+
    "\0\u0460\0\50\0\u0488\0\u04b0\0\u04d8\0\50\0\u0500\0\u0528"+
    "\0\u0550\0\u0578\0\u05a0\0\u05c8\0\u05f0\0\50\0\u0618\0\u0640"+
    "\0\u0668\0\u0690\0\u06b8\0\u06e0\0\u0708\0\u0730\0\u0758\0\u0780"+
    "\0\u07a8\0\u07d0\0\u07f8\0\u0820\0\u0848\0\u0870\0\u0898\0\u08c0"+
    "\0\u08e8\0\u0910\0\u0938\0\u0960\0\u0988\0\u09b0\0\u09d8\0\u0a00"+
    "\0\u0a28\0\u0a50\0\u0a78\0\u0aa0\0\u0ac8\0\u0af0\0\u0b18\0\u0b40"+
    "\0\u04d8\0\u0b68\0\50\0\50\0\u0b90\0\u0bb8\0\u0be0\0\u0c08"+
    "\0\u0c30\0\u0c58\0\u0c80\0\u0ca8\0\u0cd0\0\u0cf8\0\u0578\0\u0d20"+
    "\0\u0d48\0\u0d70\0\u0d98\0\u0dc0\0\u0de8\0\u0e10\0\u0e38\0\u0e60"+
    "\0\u0e88\0\u0eb0\0\u0ed8\0\u0f00\0\u0f28\0\u0f50\0\u0f78\0\u0fa0"+
    "\0\u0fc8\0\u0ff0\0\u1018\0\u1040\0\u1068\0\u1090\0\u10b8\0\u10e0"+
    "\0\u1108\0\u1130\0\u1158\0\u1180\0\u11a8\0\u11d0\0\u11f8\0\u1220"+
    "\0\50\0\u1248\0\u1270\0\u1298\0\u12c0\0\u12e8\0\u1310\0\u1338"+
    "\0\u1360\0\u1388\0\50\0\u13b0\0\u13d8\0\u1400\0\u1428\0\u1450"+
    "\0\u1478\0\u14a0\0\u14c8\0\u14f0\0\u1518\0\u1540\0\u1568\0\u1590"+
    "\0\u15b8\0\u15e0\0\u1608\0\u1630\0\u1658\0\u1680\0\u16a8\0\u16d0"+
    "\0\u16f8\0\u1720\0\u1748\0\u1770\0\u1798\0\u17c0\0\u17e8\0\u1810"+
    "\0\50";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[169];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\3\1\5\1\6\1\7\1\10"+
    "\1\6\1\11\1\12\1\6\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\2\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\2\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\3\2\1\40\50\0\5\41\1\42"+
    "\4\41\1\43\35\41\4\0\1\44\54\0\1\45\1\11"+
    "\51\0\1\46\53\0\1\47\7\0\1\50\1\0\1\51"+
    "\4\0\1\52\2\0\1\53\32\0\1\54\5\0\1\55"+
    "\11\0\1\56\17\0\1\57\15\0\1\60\2\0\1\61"+
    "\26\0\1\62\3\0\1\63\14\0\1\64\55\0\1\65"+
    "\20\0\1\66\15\0\1\67\2\0\1\70\47\0\1\71"+
    "\33\0\1\56\7\0\1\72\50\0\1\73\35\0\1\74"+
    "\53\0\1\75\37\0\1\76\7\0\1\77\55\0\1\100"+
    "\5\0\1\101\40\0\1\56\3\0\1\102\47\0\1\103"+
    "\32\0\1\104\47\0\1\105\17\0\1\106\23\0\1\107"+
    "\3\0\1\110\14\0\1\111\6\0\1\112\34\0\1\113"+
    "\1\0\1\114\30\0\1\115\56\0\1\116\35\0\1\40"+
    "\33\0\2\40\5\41\1\42\47\41\1\42\4\41\1\117"+
    "\35\41\10\0\1\120\51\0\1\121\55\0\1\56\67\0"+
    "\1\122\27\0\1\123\46\0\1\56\53\0\1\124\47\0"+
    "\1\125\57\0\1\126\53\0\1\127\40\0\1\130\1\0"+
    "\1\131\6\0\1\132\27\0\1\133\66\0\1\134\26\0"+
    "\1\135\10\0\1\136\6\0\1\137\43\0\1\140\41\0"+
    "\1\141\52\0\1\142\55\0\1\143\44\0\1\144\47\0"+
    "\1\145\53\0\1\146\1\147\34\0\1\150\67\0\1\56"+
    "\33\0\1\151\62\0\1\124\35\0\1\124\55\0\1\123"+
    "\37\0\1\152\37\0\1\122\54\0\1\153\44\0\1\154"+
    "\55\0\1\155\5\0\1\156\1\0\1\56\40\0\1\124"+
    "\34\0\1\157\75\0\1\160\44\0\1\161\42\0\1\162"+
    "\40\0\1\163\42\0\1\133\57\0\1\164\5\0\1\165"+
    "\32\0\1\166\26\0\5\41\1\42\4\41\1\167\35\41"+
    "\2\120\2\0\44\120\21\0\1\170\53\0\1\171\52\0"+
    "\1\172\36\0\1\173\71\0\1\174\45\0\1\175\42\0"+
    "\1\176\32\0\1\177\47\0\1\200\3\0\1\201\53\0"+
    "\1\202\43\0\1\177\62\0\1\56\52\0\1\203\47\0"+
    "\1\161\31\0\1\204\57\0\1\56\57\0\1\140\27\0"+
    "\1\205\47\0\1\206\11\0\1\56\46\0\1\56\42\0"+
    "\1\203\52\0\1\56\50\0\1\207\37\0\1\210\47\0"+
    "\1\211\53\0\1\212\52\0\1\162\57\0\1\201\30\0"+
    "\1\213\47\0\1\56\63\0\1\214\53\0\1\215\25\0"+
    "\1\216\66\0\1\162\11\0\5\41\1\42\4\41\1\217"+
    "\35\41\36\0\1\56\43\0\1\160\36\0\1\220\43\0"+
    "\1\221\63\0\1\150\56\0\1\222\47\0\1\124\47\0"+
    "\1\162\25\0\1\223\62\0\1\212\56\0\1\56\34\0"+
    "\1\224\60\0\1\203\34\0\1\225\41\0\1\226\70\0"+
    "\1\227\30\0\1\203\45\0\1\230\73\0\1\162\27\0"+
    "\1\231\52\0\1\232\23\0\5\41\1\42\2\41\1\233"+
    "\37\41\15\0\1\234\52\0\1\162\65\0\1\235\26\0"+
    "\1\236\55\0\1\150\45\0\1\237\64\0\1\74\32\0"+
    "\1\240\56\0\1\201\56\0\1\56\25\0\1\237\32\0"+
    "\5\41\1\42\4\41\1\241\35\41\32\0\1\201\32\0"+
    "\1\242\71\0\1\162\46\0\1\201\43\0\1\243\15\0"+
    "\5\41\1\42\4\41\1\244\35\41\25\0\1\245\41\0"+
    "\1\215\30\0\5\41\1\42\2\41\1\246\37\41\32\0"+
    "\1\203\15\0\5\41\1\42\4\41\1\247\42\41\1\42"+
    "\4\41\1\250\42\41\1\251\42\41";

  private static int [] zzUnpacktrans() {
    int [] result = new int[6200];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\3\11\1\1\2\11\31\1\1\0\1\11\3\0"+
    "\1\11\3\0\1\1\3\0\1\11\23\0\1\1\15\0"+
    "\2\1\1\0\2\11\54\0\1\11\11\0\1\11\35\0"+
    "\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[169];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */

// Codigo Java

    private List<Token> lista = new ArrayList<>();
    private List<Token> listaErrores = new ArrayList<>();

    private void addList(TipoToken tipo, int fila, int columna) {
        Token token = new Token();
        token.setFila(fila);
        token.setColumna(columna);
        token.setToken(tipo);
        token.setLexema(yytext());
        lista.add(token);
    }

    private void addListaErrores(int fila, int columna) {
        Token token = new Token();
        token.setFila(fila);
        token.setColumna(columna);
        token.setToken(TipoToken.ERROR);
        token.setLexema(yytext());
        lista.add(token);
    }

    public List<Token> getLista(){
        return lista;
    }
    
    public List<Token> getListaErrores(){
        return listaErrores;
    }



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalizadorLexico1(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public int yylex() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { addListaErrores(yyline, yycolumn);
            }
          // fall through
          case 18: break;
          case 2:
            { /*Ignore*/
            }
          // fall through
          case 19: break;
          case 3:
            { System.out.print(yytext());
            }
          // fall through
          case 20: break;
          case 4:
            { addList(TipoToken.SIGNOS, yyline, yycolumn);
            }
          // fall through
          case 21: break;
          case 5:
            { addList(TipoToken.ARITMETICO, yyline, yycolumn);
            }
          // fall through
          case 22: break;
          case 6:
            { addList(TipoToken.ENTERO, yyline, yycolumn);
            }
          // fall through
          case 23: break;
          case 7:
            { addList(TipoToken.RELACIONAL, yyline, yycolumn);
            }
          // fall through
          case 24: break;
          case 8:
            { addList(TipoToken.IDENTIFICADOR, yyline, yycolumn);
            }
          // fall through
          case 25: break;
          case 9:
            { addList(TipoToken.CADENA, yyline, yycolumn);
            }
          // fall through
          case 26: break;
          case 10:
            { addList(TipoToken.CREATE, yyline, yycolumn);
            }
          // fall through
          case 27: break;
          case 11:
            { addList(TipoToken.LOGICO, yyline, yycolumn);
            }
          // fall through
          case 28: break;
          case 12:
            { addList(TipoToken.COMENTARIO, yyline, yycolumn);
            }
          // fall through
          case 29: break;
          case 13:
            { addList(TipoToken.DECIMAL, yyline, yycolumn);
            }
          // fall through
          case 30: break;
          case 14:
            { addList(TipoToken.FUNCION_DE_AGREGACION, yyline, yycolumn);
            }
          // fall through
          case 31: break;
          case 15:
            { addList(TipoToken.TIPO_DE_DATO, yyline, yycolumn);
            }
          // fall through
          case 32: break;
          case 16:
            { addList(TipoToken.BOOLEANO, yyline, yycolumn);
            }
          // fall through
          case 33: break;
          case 17:
            { addList(TipoToken.FECHA, yyline, yycolumn);
            }
          // fall through
          case 34: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String[] argv) {
    if (argv.length == 0) {
      System.out.println("Usage : java AnalizadorLexico1 [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          // Side-effect: is encodingName valid?
          java.nio.charset.Charset.forName(encodingName);
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        AnalizadorLexico1 scanner = null;
        java.io.FileInputStream stream = null;
        java.io.Reader reader = null;
        try {
          stream = new java.io.FileInputStream(argv[i]);
          reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new AnalizadorLexico1(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
        finally {
          if (reader != null) {
            try {
              reader.close();
            }
            catch (java.io.IOException e) {
              System.out.println("IO error closing file \""+argv[i]+"\"");
              System.out.println(e);
            }
          }
          if (stream != null) {
            try {
              stream.close();
            }
            catch (java.io.IOException e) {
              System.out.println("IO error closing file \""+argv[i]+"\"");
              System.out.println(e);
            }
          }
        }
      }
    }
  }


}