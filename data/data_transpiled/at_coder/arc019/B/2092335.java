public static int input ( ) {
  int L = S . length ( ) ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < ( L + 1 ) / 2 ;
  i ++ ) {
    if ( S . charAt ( i ) != S . charAt ( S . length ( ) - i - 1 ) ) {
      cnt ++ ;
    }
  }
  if ( cnt > 1 ) {
    System . out . println ( 25 * L ) ;
  }
  else if ( cnt == 1 ) {
    System . out . println ( 25 * ( L - 2 ) + 24 * 2 ) ;
  }
  else {
    if ( L % 2 == 1 ) {
      System . out . println ( 25 * ( L - 1 ) ) ;
    }
    else {
      System . out . println ( 25 * L ) ;
    }
  }
  return L ;
}
