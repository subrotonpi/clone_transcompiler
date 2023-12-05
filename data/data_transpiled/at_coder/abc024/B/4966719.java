public static int n ( ) {
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < a . length - 1 ;
  i ++ ) {
    if ( a [ i ] + t > a [ i + 1 ] ) {
      ans += a [ i + 1 ] - a [ i ] ;
    }
    else {
      ans += t ;
    }
  }
  ans += t ;
  System . out . println ( ans ) ;
  return ans ;
}
