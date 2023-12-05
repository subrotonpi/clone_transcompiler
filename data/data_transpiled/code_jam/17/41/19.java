@ Sys . This public static void main ( String [ ] args ) throws Exception {
  int tn = Integer . parseInt ( args [ 0 ] ) ;
  for ( int ti = 0 ;
  ti < tn ;
  ti ++ ) {
    int n = Integer . parseInt ( args [ ti ] ) ;
    int p = Integer . parseInt ( args [ ti ] ) ;
    int g = Integer . parseInt ( args [ ti ] ) ;
    int m [ ] = new int [ p ] ;
    for ( int gi : g ) {
      m [ gi % p ] ++ ;
    }
    int r = m [ 0 ] ;
    if ( p == 2 ) {
      r += ( m [ 1 ] + 1 ) / 2 ;
    }
    else if ( p == 3 ) {
      int x = Math . min ( m [ 1 ] , m [ 2 ] ) ;
      r += x ;
      m [ 1 ] -= x ;
      m [ 2 ] -= x ;
      r += ( m [ 1 ] + 2 ) / 3 ;
      r += ( m [ 2 ] + 2 ) / 3 ;
    }
    else {
      r += m [ 2 ] / 2 ;
      m [ 2 ] = m [ 2 ] % 2 ;
      int x = Math . min ( m [ 1 ] , m [ 3 ] ) ;
      r += x ;
      m [ 1 ] -= x ;
      m [ 3 ] -= x ;
      r += ( m [ 1 ] + 3 ) / 4 ;
      r += ( m [ 3 ] + 3 ) / 4 ;
      if ( m [ 1 ] % 4 + m [ 3 ] % 4 == 0 ) {
        r += m [ 2 ] ;
      }
    }
    System . out . println ( "Case #" + ( ti + 1 ) + ":" + r ) ;
  }
}
