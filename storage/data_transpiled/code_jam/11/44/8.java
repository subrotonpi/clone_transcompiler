@ Nullable private static HashSet < Integer > solve ( ) {
  final HashSet < Integer > S = new HashSet < Integer > ( ) ;
  int sol = 0 ;
  {
    int aux = 0 ;
    while ( x != 0 ) {
      aux ++ ;
      x &= x - 1 ;
    }
    return S ;
  }
  private void doit ( int i , int d , int mask , int used ) {
    if ( ( i & mask ) == 0 ) return ;
    S . add ( new Integer ( i ) ) ;
    for ( int j : xrange ( 2 , N ) ) {
      if ( A [ i ] [ j ] && H [ j ] == d - 1 ) {
        int u = used | ( 1 << j ) ;
        int m = mask | T [ j ] ;
        m ^= ( m & u ) ;
        doit ( j , d - 1 , m , u ) ;
      }
    }
    if ( A [ i ] [ 1 ] != 0 ) {
      int i ;
      int j ;
      int u ;
      int m ;
      if ( sol > 0 ) sol = count ( mask ) ;
    }
  }
  int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int noT : xrange ( 1 , T + 1 ) ) {
    N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    M = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    A = new int [ N ] ;
    T = new int [ N ] ;
    for ( i = 0 ;
    i < N ;
    i ++ ) {
      A [ i ] = new int [ M ] ;
    }
    for ( int i = 0 ;
    i < T ;
    i ++ ) {
      A [ i ] [ 0 ] = i ;
    }
    for ( String s : System . console ( ) . readLine ( ) . split ( "," ) ) {
      int x = Integer . parseInt ( s ) ;
      int y = Integer . parseInt ( s ) ;
      A [ x ] [ y ] = 1 ;
      A [ y ] [ x ] = 1 ;
      T [ x ] |= 1 << y ;
      T [ y ] |= 1 << x ;
    }
    int [ ] H = new int [ N ] ;
    H [ 1 ] = 0 ;
    Queue < Integer > Q = new LinkedList < Integer > ( ) ;
    Q . add ( 1 ) ;
    while ( ! Q . isEmpty ( ) ) {
      i = Q . poll ( ) ;
      for ( int j : xrange ( N ) ) {
        if ( A [ i ] [ j