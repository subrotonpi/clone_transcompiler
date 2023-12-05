public static int k = Integer . parseInt ( input ) {
  int n = Integer . parseInt ( input ) ;
  Tuple [ ] x = new Tuple [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) x [ i ] = tuple ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int ans = 0 , k2 = 0 , x [ 0 ] = new Integer ( input . nextLine ( ) ) ;
  {
    int a = 0 ;
    for ( int i = 0 ;
    i < x . length ;
    i ++ ) {
      int j = x [ i ] . get ( ) ;
      if ( p >= x [ i ] . get ( ) ) a += ( p - x [ i ] . get ( ) + j ) / j ;
      else break ;
    }
    return a < k ;
  }
}
