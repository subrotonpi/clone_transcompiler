public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] x = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) x [ i ] = Integer . parseInt ( input ) ;
  boolean f = false ;
  if ( x [ 0 ] > 0 ) f = true ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( x [ i ] + 1 < x [ i + 1 ] ) f = true ;
  }
  final int ans = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( x [ i + 1 ] == x [ i ] + 1 ) ans ++ ;
    else ans += x [ i + 1 ] ;
  }
  System . out . println ( ans ) ;
}
