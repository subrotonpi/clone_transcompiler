public static int N = Integer . parseInt ( input ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int t4 = 0 ;
  int t2 = 0 ;
  int t = 0 ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    if ( A [ i ] % 4 == 0 ) {
      t4 ++ ;
    }
    else if ( A [ i ] % 2 == 0 ) {
      t2 ++ ;
    }
    else {
      t ++ ;
    }
  }
  if ( t4 >= t || ( t2 == 0 && t4 + 1 == t ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return t4 ;
}
