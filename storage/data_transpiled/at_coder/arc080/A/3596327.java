public static int N ( ) {
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int odd = 0 ;
  int even = 0 ;
  int four = 0 ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    if ( a [ i ] % 4 == 0 ) {
      four ++ ;
    }
    else if ( a [ i ] % 2 == 0 ) {
      even ++ ;
    }
    else {
      odd ++ ;
    }
  }
  if ( even == 0 ) {
    if ( four >= odd - 1 ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
  else {
    if ( four >= odd ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
  return odd ;
}
