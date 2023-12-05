public static int N ( ) {
  int M , X ;
  int ans = 0 ;
  int m_min = 10000 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    m = Integer . parseInt ( input . nextLine ( ) ) ;
    X -= m ;
    ans ++ ;
    if ( m < m_min ) {
      m_min = m ;
    }
  }
  ans += X / m_min ;
  return ans ;
}
