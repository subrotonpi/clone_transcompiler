public static int R = Integer . parseInt ( input ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  Predicate < Integer > f = k -> k <= ( R - k ) ? k <= ( x - 1 ) : k + ( B - k ) / ( y - 1 ) ;
  int l = 0 , r = Math . min ( R , B ) + 1 ;
  while ( r - l > 1 ) {
    int m = ( r + l ) / 2 ;
    if ( f . test ( m ) ) l = m ;
    else r = m ;
  }
  return l ;
}
