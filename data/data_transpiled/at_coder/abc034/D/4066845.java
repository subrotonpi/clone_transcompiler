public static int n ( ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] w = new int [ n ] ;
  int [ ] p = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    w [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    p [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int lb = 0 ;
  int ub = 1 ;
  {
    int [ ] salt = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      salt [ i ] = w [ i ] * ( p [ i ] / 100 - per ) ;
    }
    Arrays . sort ( salt ) ;
    Arrays . reverse ( salt ) ;
  }
  while ( ub - lb > 0.00000001 ) {
    int mid = lb + ( ub - lb ) / 2 ;
    if ( ( mid = lb + 1 ) < k ) {
      lb = mid ;
    }
    else {
      ub = mid ;
    }
  }
  System . out . println ( lb * 100 ) ;
  return lb ;
}
