static final int [ ] [ ] G ( int i ) {
  System . setSecurityManager ( new SecurityManager ( ) {
    @ Override public void checkExit ( int arg0 ) {
      System . out . println ( "Enter a value for this program" ) ;
    }
  }
  ) ;
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] G = new int [ N ] [ N ] ;
  for ( int j = 0 ;
  j < N - 1 ;
  j ++ ) {
    int A = Integer . parseInt ( input ( ) ) ;
    int B = Integer . parseInt ( input ( ) ) ;
    G [ A - 1 ] [ B ] = B - 1 ;
    G [ B - 1 ] [ A ] = A - 1 ;
  }
  Map < Integer , Integer > M = new HashMap < Integer , Integer > ( ) ;
  int K = Integer . parseInt ( input ( ) ) ;
  for ( int j = 0 ;
  j < K ;
  j ++ ) {
    int V = Integer . parseInt ( input ( ) ) ;
    int P = Integer . parseInt ( input ( ) ) ;
    M . put ( V - 1 , P ) ;
  }
  int [ ] memo = new int [ N ] ;
  {
    int x , y ;
    int x0 , y0 ;
    int c ;
    int x , y ;
    int x0 , y0 ;
    int x , y ;
    int x0 , y0 ;
    int x , y ;
    for ( int w = 0 ;
    w < G [ v ] . length ;
    w ++ ) {
      if ( p == w ) continue ;
      x = y = M . get ( w ) ;
      if ( c != ( M . get ( w ) % 2 ) ) return ;
      y = M . get ( w ) ;
      x0 = Math . max ( x , x0 ) ;
      y0 = Math . min ( y , y0 ) ;
      x = Math . max ( x , x0 ) ;
      y = Math . min ( y , y0 ) ;
      for ( int w = 0 ;
      w < G [ v ] . length ;
      w ++ ) {
        if ( p == w ) continue ;
        if ( ! dfs1 ( w , v , x - 1 , y + 1 , c ^ 1 ) ) return ;
      }
      memo [ v ] = x ;
      y = y ;
    }
  }
}
