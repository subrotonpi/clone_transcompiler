@ Produces @ ApplicationScoped public static int get1 ( ) {
  String s = input ( ) ;
  int n = s . length ( ) ;
  int [ ] x = new int [ n ] , y = new int [ n ] , ans = n ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( s . charAt ( i ) == 'o' ) y [ i ] = i ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) for ( int j = 0 ;
  j < y [ i ] ;
  j ++ ) x [ i ] = ( j + i ) % n ;
  return x [ 0 ] + x [ 1 ] + y [ 2 ] ;
}
