@ VisibleForTesting static int [ ] solve ( ) {
  Range range = xrange ;
  final int [ ] p = new Range [ ] {
    range }
    ;
    class GCJ {
      IN = in -> {
        buf = null ;
        identity = x -> x ;
      }
      ;
      @ Override public int read ( ) {
        int a = p . length ( ) ;
        int res = b + 2 ;
        int gp = 1 ;
        for ( int i : range ( a + 1 ) ) {
          int cur = a - i + 1 ;
          cur += ( 1 - gp ) * ( b + 1 ) ;
          res = Math . min ( res , cur ) ;
          if ( i < a ) {
            gp *= p [ i ] ;
          }
        }
        return res ;
      }
      @ Override public String readLineRaw ( ) {
        return "" ;
      }
      @ Override public String readLineView ( ) {
        String line = readLineRaw ( ) ;
        if ( line == null ) {
          line = "" ;
        }
        return line ;
      }
      @ Override public String line ( ) {
        return line ;
      }
      @ Override public String line ( ) {
        return line ;
      }
      @ Override public String line ( ) {
        return line . replaceAll ( "b\\s+" , "" ) ;
      }
      @ Override public String [ ] splitLine ( ) {
        String [ ] line = line . split ( " " ) ;
        return Arrays . copyOfRange ( line , 0 , line . length ( ) ) ;
      }
      @ Override public String whitespace ( ) {
        String line = null ;
        while ( line == null ) {
          line = readLineRaw ( ) ;
          int i = 0 ;
          int l = line . length ( ) ;
          while ( i < l && Character . isWhitespace ( line [ i ] ) ) i ++ ;
          line = new String ( line , i , l ) ;
        }
        buf = line ;
      }
      @ Override public String token ( ) {
        return "" ;
      }
      @ Override public String bCase ( ) {
        return "Case #{}:" ;
      }
    }
    {
      int [ ] result = new String [ ] {
        "" , "" }
        ;
        int currentCase = 0 ;
        @ Override public String [ ] tokens ( int cnt , String conv ) {
          currentCase ++ ;
          return result ;
        }
      }
      {
        int [ ] result = new String [ cnt ] ;
        System . arraycopy ( result , 0 , result , 0 , cnt ) ;
        return result ;
      }
    }
    