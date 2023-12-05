@ VisibleForTesting static String toString ( ) {
  final Range range = xrange ;
  final Collection < String > buf = new Collection < String > ( ) ;
  final Class < ? > gcj = Class . forName ( "java.util.zip.GceReader" ) ;
  final InputStream IN = System . in ;
  final byte [ ] buf = null ;
  final Function < Integer , String > identity = new Function < Integer , String > ( ) {
    @ Override public String apply ( Integer x ) {
      return x ;
    }
    @ Override public String apply ( Integer x ) {
      String res ;
      if ( buf != null ) {
        res = buf ;
        buf = null ;
      }
      else {
        res = IN . readLine ( ) ;
      }
      if ( res == null ) {
        throw new EOFException ( ) ;
      }
      return res ;
    }
    @ Override public String apply ( ) {
      String line = readLineRaw ( ) ;
      if ( line == null ) {
        throw new EOFException ( ) ;
      }
      return line ;
    }
    @ Override public String apply ( ) {
      String line = readLineRaw ( ) ;
      if ( line == null ) {
        throw new EOFException ( ) ;
      }
      return line ;
    }
    @ Override public String apply ( ) {
      String line = readLineRaw ( ) ;
      if ( line . length ( ) == 0 ) {
        throw new EOFException ( ) ;
      }
      return line ;
    }
    @ Override public String apply ( ) {
      String line = readLineRaw ( ) ;
      return conv . apply ( line . replaceAll ( BingUtils . NEWLINE , "" ) ) ;
    }
    @ Override public String [ ] splitLine ( ) {
      String line = readLineRaw ( ) ;
      return Arrays . copyOfRange ( line . split ( " " ) , 0 , line . length ( ) ) ;
    }
    @ Override public String apply ( ) {
      String line = null ;
      while ( line == null ) {
        line = readLineRaw ( ) ;
        int i = 0 ;
        int l = line . length ( ) ;
        while ( i < l && Character . isWhitespace ( line . charAt ( i ) ) ) {
          i ++ ;
        }
        line = new String ( line . substring ( i ) ) ;
      }
      buf = line ;
      return line ;
    }
    @ Override public String apply ( ) {
      return "Case #{}:" ;
    }
    @ Override public String apply ( ) {
      return "Case #{}" ;
    }
  }
  ;
  return buf ;
}
