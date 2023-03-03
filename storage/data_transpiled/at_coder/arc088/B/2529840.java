public static int input ( ) {
  int N = S . length ( ) ;
  if ( new HashSet < Integer > ( S ) . size ( ) == 1 ) {
    System . out . println ( N ) ;
    exit ( ) ;
  }
  int ans = N / 2 ;
  int l = 0 ;
  int r = N / 2 ;
  if ( N % 2 == 0 ) l -- ;
  int inside = 0 ;
  while ( l >= 0 ) {
    if ( inside == 0 ) {
      if ( N % 2 != 0 ) {
        if ( S . get ( l ) == 1 ) {
          System . out . println ( N / 2 + 1 ) ;
          exit ( ) ;
        }
      }
      else {
        if ( S . get ( l ) != S . get ( r ) ) {
          System . out . println ( N / 2 ) ;
          exit ( ) ;
        }
      }
      inside = S . get ( l ) ;
      continue ;
    }
    if ( S . get ( l ) != inside || S . get ( r ) != inside ) break ;
    inside = S . get ( l ) ;
    l -- ;
    r ++ ;
    ans ++ ;
  }
  return ans ;
}
