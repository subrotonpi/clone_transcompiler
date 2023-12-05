public static String input ( ) {
  String [ ] lst = {
    "dreamer" , "dream" , "eraser" , "erase" }
    ;
    Arrays . sort ( lst ) ;
    String S = new String ( list . reverse ( ) ) ;
    int i = 0 ;
    while ( i < S . length ( ) ) {
      boolean found = false ;
      for ( String k : lst ) {
        try {
          if ( S . substring ( i ) . indexOf ( k ) == 0 ) {
            found = true ;
            i += k . length ( ) ;
            break ;
          }
        }
        catch ( Exception e ) {
          continue ;
        }
      }
      if ( ! found ) {
        System . out . println ( "NO" ) ;
        exit ( 0 ) ;
      }
    }
    System . out . println ( "YES" ) ;
    return S ;
  }
  