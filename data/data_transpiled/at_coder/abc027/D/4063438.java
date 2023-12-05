public static void input ( Scanner s ) {
  int p_count = s . nextInt ( ) ;
  int m_count = s . nextInt ( ) ;
  int m = s . nextInt ( ) ;
  int prev_m = 0 ;
  int prev_p = 0 ;
  int [ ] pm_count = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    pm_count [ i ] = 0 ;
  }
  int j = 0 ;
  for ( int i = 0 ;
  i < s . nextInt ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == '+' ) {
      prev_p ++ ;
      continue ;
    }
    if ( s . charAt ( i ) == '-' ) {
      prev_m ++ ;
      continue ;
    }
    pm_count [ j ] = ( p_count - prev_p ) - ( m_count - prev_m ) ;
    j ++ ;
  }
  Arrays . sort ( pm_count ) ;
  System . out . println ( Arrays . toString ( pm_count , m / 2 ) - Arrays . toString ( pm_count , 0 , m / 2 ) ) ;
}
