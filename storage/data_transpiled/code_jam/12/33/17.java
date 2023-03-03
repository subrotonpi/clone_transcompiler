public static int opti ( int n , int qn , int m , int qm ) {
  if ( ( n == N ) && ( m == M ) ) return dp . get ( n , qn , m , qm ) ;
  if ( n == N || m == M ) return 0 ;
  if ( qn == 0 ) return opti ( n + 1 , n + 1 != N ? boxes [ n + 1 ] [ 0 ] : null , m , qm ) ;
  if ( qm == 0 ) return opti ( n , qn , m + 1 , m + 1 != M ? toys [ m + 1 ] [ 0 ] : null ) ;
  if ( boxes [ n ] [ 1 ] == toys [ m ] [ 1 ] ) {
    dp . put ( n , qn , m , qm ) ;
    dp . put ( n , qn , m , qm ) ;
  }
  else {
    dp . put ( n , qn , m , qm ) ;
    dp . put ( n , qn , m , qm ) ;
  }
  int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    N = Integer . parseInt ( readLine ( ) ) ;
    M = Integer . parseInt ( readLine ( ) ) ;
    int [ ] l1 = Integer . parseInt ( readLine ( ) ) ;
    int [ ] l2 = Integer . parseInt ( readLine ( ) ) ;
    boxes = new int [ N ] ;
    toys = new int [ M ] ;
    dp . clear ( ) ;
    for ( int i = 0 ;
    i < 2 * N ;
    i += 2 ) {
      boxes [ i ] = ( l1 [ i ] == 0 ? 0 : 1 ) ;
    }
    for ( int i = 0 ;
    i < 2 * M ;
    i += 2 ) {
      toys [ i ] = ( l2 [ i ] == 0 ? 0 : 1 ) ;
    }
    System . out . println ( "Case #" + t + ": " + opti ( 0 , boxes [ 0 ] [ 0 ] , 0 , toys [ 0 ] [ 0 ] ) ) ;
  }
  return 0 ;
}
