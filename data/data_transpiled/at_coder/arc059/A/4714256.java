public static int N = Integer . parseInt ( input ) {
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = Integer . MIN_VALUE ;
  for ( int i = - 100 ;
  i < 101 ;
  i ++ ) {
    int tmp = 0 ;
    for ( int j : a ) {
      tmp += ( i - j ) * ( i - j ) ;
    }
    if ( tmp < ans ) {
      ans = tmp ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
