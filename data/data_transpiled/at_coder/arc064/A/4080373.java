public static void main ( int n , int x ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( a [ i - 1 ] > x ) {
      ans += a [ i - 1 ] - x + a [ i ] ;
      a [ i - 1 ] = x ;
      a [ i ] = 0 ;
    }
    else if ( a [ i - 1 ] + a [ i ] > x ) {
      ans += a [ i - 1 ] + a [ i ] - x ;
      a [ i ] = x - a [ i - 1 ] ;
    }
  }
  System . out . println ( ans ) ;
}
