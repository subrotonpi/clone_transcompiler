public static int [ ] [ ] [ ] input ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] ab = new int [ N ] [ M ] ;
  int [ ] [ ] cd = new int [ M ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    ab [ i ] [ 0 ] = a ;
    ab [ i ] [ 1 ] = b ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int c = Integer . parseInt ( input . readLine ( ) ) ;
    int d = Integer . parseInt ( input . readLine ( ) ) ;
    cd [ i ] [ 0 ] = c ;
    cd [ i ] [ 1 ] = d ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int m_min = 100000000000 ;
    int iMin = - 1 ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      int m = Math . abs ( ab [ i ] [ 0 ] - cd [ j ] [ 0 ] ) + Math . abs ( ab [ i ] [ 1 ] - cd [ j ] [ 1 ] ) ;
      if ( m < m_min ) {
        m_min = m ;
        iMin = j ;
      }
    }
    System . out . println ( iMin + 1 ) ;
  }
  return ab ;
}
