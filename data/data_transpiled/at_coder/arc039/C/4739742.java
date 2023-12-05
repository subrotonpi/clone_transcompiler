private static void solve ( int k , String s ) {
  int x = 0 ;
  int y = 0 ;
  Map < Integer , Integer > m = new HashMap < Integer , Integer > ( ) ;
  m . put ( new Integer ( 0 ) , new Integer ( 0 ) ) ;
  m . put ( new Integer ( 0 ) , new Integer ( 0 ) ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    char si = s . charAt ( i ) ;
    int ox = x ;
    int oy = y ;
    int l = m . get ( new Integer ( ox ) ) ;
    int r = m . get ( new Integer ( r ) ) ;
    int u = m . get ( new Integer ( u ) ) ;
    int d = m . get ( new Integer ( d ) ) ;
    switch ( si ) {
      case 'L' : x -= ( l + 1 ) ;
      while ( ( ox = m . get ( new Integer ( ox ) ) ) != 0 ) {
        int nl = m . get ( new Integer ( ox ) ) . intValue ( ) + 1 ;
        x -= nl ;
      }
      m . put ( new Integer ( ox ) , new Integer ( oy ) ) ;
      break ;
      case 'R' : x += ( r + 1 ) ;
      while ( ( ox = m . get ( new Integer ( ox ) ) ) != 0 ) {
        int nr = m . get ( new Integer ( ox ) ) . intValue ( ) + 1 ;
        x += nr ;
      }
      m . put ( new Integer ( ox ) , new Integer ( oy ) ) ;
      break ;
      case 'U' : y += ( u + 1 ) ;
      while ( ( ox = m . get ( new Integer ( oy ) ) ) != 0 ) {
        int nu = m . get ( new Integer ( ox ) ) . intValue ( ) + 1 ;
        y += nu ;
      }
      m . put ( new Integer ( ox ) , new Integer ( oy ) ) ;
      break ;
      case 'D' : y -= ( d + 1 ) ;
      while ( ( oy = m . get ( new Integer ( oy ) ) ) != 0 ) {
        int nd = m . get ( new Integer ( ox ) ) . intValue ( ) + 1 ;
        y -= nd ;
      }
      m . put ( new Integer ( ox ) , new Integer ( oy ) ) ;
      break ;
    }
  }
  System . out . println ( x + " " + y ) ;
}
