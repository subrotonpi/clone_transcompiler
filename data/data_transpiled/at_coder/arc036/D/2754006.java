static final int [ ] solve ( int x ) {
  System . setSecurityManager ( new SecurityManager ( ) {
    public void checkExit ( int answer ) {
      int [ ] table ;
      int [ ] rank ;
      {
        int x = Integer . parseInt ( input ) ;
        int y = Integer . parseInt ( input ) ;
        if ( table [ x ] == x ) {
          return ;
        }
        else {
          table [ x ] = find ( table [ x ] ) ;
          return ;
        }
      }
    }
  }
  ) ;
  /* We can find the first element in the table */
  int x = Integer . parseInt ( input ) ;
  int y = Integer . parseInt ( input ) ;
  if ( x == y ) {
    return ;
  }
  if ( rank [ x ] > rank [ y ] ) {
    table [ y ] = x ;
  }
  else {
    table [ x ] = y ;
    if ( rank [ x ] == rank [ y ] ) {
      rank [ y ] ++ ;
    }
  }
  /* We can check the first element in the table */
  int N = Integer . parseInt ( input ) ;
  int Q = Integer . parseInt ( input ) ;
  table = new int [ 2 * N ] ;
  rank = new int [ 2 * N ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int w = ( Integer . parseInt ( input ) ) ;
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    int z = Integer . parseInt ( input ) ;
    a -- ;
    b -- ;
    if ( w == 1 ) {
      if ( z % 2 == 1 ) {
        union ( a , b + N ) ;
        union ( a + N , b ) ;
      }
      else {
        union ( a , b ) ;
        union ( a + N , b + N ) ;
      }
    }
    else {
      if ( check ( a , b ) ) {
        System . out . println ( "YES" ) ;
      }
      else {
        System . out . println ( "NO" ) ;
      }
    }
  }
}
