public static void main ( int n , int x ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int ret = 0 ;
  if ( a [ 0 ] > x ) {
    ret += a [ 0 ] - x ;
    a [ 0 ] -= a [ 0 ] - x ;
  }
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( a [ i + 1 ] + a [ i ] > x ) {
      ret += a [ i + 1 ] + a [ i ] - x ;
      a [ i + 1 ] -= a [ i + 1 ] + a [ i ] - x ;
    }
  }
  System . out . println ( ret ) ;
}
