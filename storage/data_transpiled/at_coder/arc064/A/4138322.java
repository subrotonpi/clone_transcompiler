public static void main ( int n , int x ) {
  int [ ] l = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int total = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int diff = l [ i ] + l [ i + 1 ] - x ;
    if ( diff > 0 ) {
      total += diff ;
      if ( diff > l [ i + 1 ] ) l [ i + 1 ] = 0 ;
      else l [ i + 1 ] -= diff ;
    }
  }
  System . out . println ( total ) ;
}
