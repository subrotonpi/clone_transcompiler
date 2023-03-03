public static int n ( ) {
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] hoge = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    hoge [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( ( hoge [ i ] + t ) > hoge [ i + 1 ] ) ans += hoge [ i + 1 ] - hoge [ i ] ;
    else ans += t ;
  }
  ans += t ;
  return ans ;
}
