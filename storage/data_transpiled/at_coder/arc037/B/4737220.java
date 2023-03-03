static public boolean match ( int x , int y , int [ ] par , int [ ] rank ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final int n = Integer . parseInt ( input ) ;
  final int m = Integer . parseInt ( input ) ;
  final int [ ] par = new int [ n ] ;
  final int [ ] rank = new int [ n ] ;
  final boolean [ ] judge = new boolean [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) par [ i ] = i ;
  /* find the first element in the list */
  if ( par [ x ] == x ) {
    return true ;
  }
  else {
    /* unite the first element in the list */
    int x = find ( x , par ) ;
    int y = find ( y , par ) ;
    if ( x == y ) judge [ x ] = false ;
    if ( x != y ) {
      if ( rank [ x ] < rank [ y ] ) {
        if ( ! judge [ x ] ) judge [ y ] = false ;
        par [ x ] = y ;
        judge [ x ] = false ;
      }
      else {
        if ( ! judge [ y ] ) judge [ x ] = false ;
        par [ y ] = x ;
        judge [ y ] = false ;
        if ( rank [ x ] == rank [ y ] ) rank [ x ] ++ ;
      }
    }
  }
  /* same the first element in the list */
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int u = Integer . parseInt ( input ) ;
    int v = Integer . parseInt ( input ) ;
    u = u - 1 ;
    v = v - 1 ;
    unite ( u , v , par , rank ) ;
  }
  int res = 0 ;
  for ( boolean e : judge ) {
    if ( e ) res ++ ;
  }
  System . out . println ( res ) ;
  return res ;
}
