public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int [ ] h = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) h [ i ] = Integer . parseInt ( input ) ;
  int r = 0 , l = 10 * 9 ;
  while ( r < l - 1 ) {
    int c = ( r + l + 1 ) / 2 ;
    int [ ] h2 = h [ i ] - b * c ;
    int count = 0 ;
    for ( int i = 0 ;
    i < h2 . length ;
    i ++ ) h2 [ i ] = h2 [ i ] - b * c ;
    count += - ( h2 [ i ] / ( a - b ) ) ;
    if ( count <= c ) l = c ;
    else r = c ;
  }
  System . out . println ( l ) ;
}
