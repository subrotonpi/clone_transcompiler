public static int [ ] getN ( ) {
  int [ ] ans = new int [ 6 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    double MT = Integer . parseInt ( input . nextLine ( ) ) ;
    double mT = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( MT >= 35 ) ans [ 0 ] ++ ;
    else if ( MT >= 30 ) ans [ 1 ] ++ ;
    else if ( MT >= 25 ) ans [ 2 ] ++ ;
    if ( mT >= 25 ) ans [ 3 ] ++ ;
  }
  System . out . print ( ans [ 0 ] ) ;
  for ( int n = 1 ;
  n < ans . length ;
  n ++ ) System . out . print ( ans [ n ] ) ;
  return ans ;
}
