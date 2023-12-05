static final int n ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] num = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    num [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  /* g = (x / 2 + 1) * Math.factorial(n)/(x+1) */
  int count = 0 ;
  for ( int i = 0 ;
  i < num . length ;
  i ++ ) {
    int yakusu = 0 ;
    for ( int j = 0 ;
    j < num . length ;
    j ++ ) {
      if ( num [ i ] % num [ j ] == 0 ) yakusu ++ ;
    }
    count += g ( yakusu - 1 , n ) ;
  }
  return count ;
}
