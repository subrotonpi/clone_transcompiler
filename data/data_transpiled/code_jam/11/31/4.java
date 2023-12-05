public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  for ( int num = 1 ;
  num <= N ;
  num ++ ) {
    int r = input . nextInt ( ) ;
    int c = input . nextInt ( ) ;
    r = Integer . parseInt ( r ) ;
    c = Integer . parseInt ( c ) ;
    char [ ] [ ] M = new char [ r ] [ c ] ;
    for ( int i = 0 ;
    i < r ;
    i ++ ) {
      M [ i ] = new char [ r ] ;
    }
    for ( int i = 0 ;
    i < r ;
    i ++ ) {
      M [ i ] = new char [ r ] ;
    }
    boolean ans = true ;
    for ( int i = 0 ;
    i < r - 1 ;
    i ++ ) {
      for ( int j = 0 ;
      j < c - 1 ;
      j ++ ) {
        if ( M [ i ] [ j ] == '#' ) {
          if ( M [ i + 1 ] [ j ] == '#' && M [ i ] [ j + 1 ] == '#' && M [ i + 1 ] [ j + 1 ] == '#' ) {
            M [ i ] [ j ] = '/' ;
            M [ i ] [ j + 1 ] = '\\' ;
            M [ i + 1 ] [ j ] = '\\' ;
            M [ i + 1 ] [ j ] = '/' ;
          }
          else {
            ans = false ;
          }
        }
      }
      if ( M [ i ] . charAt ( 0 ) == '#' ) {
        ans = false ;
      }
    }
    if ( M [ M . length - 1 ] . charAt ( 0 ) == '#' ) {
      ans = false ;
    }
    System . out . print ( "Case #" + num + ":" ) ;
    if ( ans ) {
      for ( int i = 0 ;
      i < r ;
      i ++ ) {
        System . out . println ( new String ( M [ i ] ) ) ;
      }
    }
    else {
      System . out . println ( "Impossible" ) ;
    }
  }
}
