public static int [ ] getN ( ) {
  int [ ] a = new int [ N ] , b = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int aa = Integer . parseInt ( input . nextLine ( ) ) ;
    int bb = Integer . parseInt ( input . nextLine ( ) ) ;
    a [ i ] = aa ;
    b [ i ] = bb ;
  }
  int ans = 0 ;
  int add_v = 0 ;
  int i = N - 1 ;
  while ( i >= 0 ) {
    int r = ( a [ i ] + add_v ) % b [ i ] ;
    if ( r != 0 ) {
      int to_add = b [ i ] - r ;
      add_v += to_add ;
      ans += to_add ;
    }
    i -- ;
  }
  return ans ;
}
