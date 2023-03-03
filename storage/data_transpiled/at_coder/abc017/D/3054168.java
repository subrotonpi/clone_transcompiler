static void input ( int n , int m ) {
  int f = ( int ) input . nextInt ( ) ;
  int [ ] last = new int [ m + 1 ] , t = new int [ n + 1 ] ;
  last [ f ] = 0 ;
  int num = 1 , mod = 10 * 9 + 7 , ans = new int [ n + 1 ] ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    f = input . nextInt ( ) ;
    if ( num > last [ f ] ) {
      ans [ i ] = ( ans [ i - 1 ] * 2 ) % mod ;
    }
    else if ( num == 1 ) {
      ans [ i ] = ( ans [ i - 1 ] * 2 - t [ last [ f ] - 1 ] ) % mod ;
      num = last [ f ] + 1 ;
    }
    t [ i ] = ( t [ i - 1 ] + ans [ i - 1 ] ) % mod ;
    last [ f ] = i ;
  }
  System . out . println ( ans [ ans . length - 1 ] ) ;
}
