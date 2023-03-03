@ VisibleForTesting static < T > Function < String , T > getBaseline ( ) {
  return new Function < String , T > ( ) {
    @ Override public T apply ( String input ) {
      HashMap < String , T > mem = new HashMap < > ( ) ;
      {
        if ( ! mem . containsKey ( input ) ) {
          mem . put ( input , input ) ;
        }
        return mem . get ( input ) ;
      }
    }
    ;
    Function < String , Integer > readInt = in -> Integer . parseInt ( in ) ;
    Function < String , Integer > readInts = in -> {
      int p = in . nextInt ( 65 ) ;
      int [ ] powerValues = new int [ p ] ;
      for ( int i = 0 ;
      i < p ;
      i ++ ) powerValues [ i ] = ( i - p ) / 2 * powerValues [ i ] ;
      return Integer . parseInt ( powerValues [ i ] ) ;
    }
    ;
    Scanner scanner = new Scanner ( FILE + ".in" , true ) ;
    scanner . useDelimiter ( " " ) ;
    scanner . useDelimiter ( "\n" ) ;
    scanner . useDelimiter ( "\n" ) ;
    scanner . useDelimiter ( "\n" ) ;
    scanner . useDelimiter ( "\n" ) ;
    scanner . useDelimiter ( "\n" ) ;
    scanner . useDelimiter ( "\n" ) ;
    scanner . useDelimiter ( "\n" ) ;
    scanner . useDelimiter ( "\n" ) ;
    scanner . useDelimiter ( "\n" ) ;
    scanner . useDelimiter ( "\n" ) ;
    scanner . useDelimiter ( "\n" ) ;
    scanner . useDelimiter ( "\n" ) ;
    scanner . useDelimiter ( "\n" ) ;
    scanner . useDelimiter ( "\n" ) ;
    scanner . useDelimiter ( "\n" ) ;
    scanner . useDelimiter ( "\n" ) ;
    scanner . useDelimiter ( "\n" ) ;
    scanner . useDelimiter ( "\n" ) ;
    scanner . useDelimiter ( "\n" ) ;
    scanner . useDelimiter ( "\n" ) ;
    scanner . useDelimiter ( "\n" ) ;
    scanner . useDelimiter ( "\n" ) ;
    scanner . useDelimiter ( "\n" ) ;
    scanner . useDelimiter ( "\n" ) ;
    scanner . useDelimiter ( "\n" ) ;
    scanner . useDelimiter ( "\n" ) ;
    scanner . useDelimiter ( "\n" ) ;
    scanner . useDelimiter ( "\n" ) ;
    scanner . useDelimiter ( "\n" ) ;
    scanner . useDelimiter ( "\n"