static final int [ ] getStdOut ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int * A [ ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int G [ ] [ ] = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    G [ a - 1 ] [ b ] = b - 1 ;
    G [ b - 1 ] [ a ] = a - 1 ;
  }
  /* calc the result */
  if ( S == null ) return 0 ;
  Arrays . sort ( S , Collections . reverseOrder ( ) ) ;
  if ( S [ 0 ] > Integer . MAX_VALUE ) return Integer . MAX_VALUE ;
  /* calc the result */
  int ok = 1 ;
  /* dfs the v */
  int c = A [ v ] ;
  int S [ ] = new int [ S . length ] ;
  for ( int w : G [ v ] ) {
    if ( w == p ) continue ;
    S [ w ] = dfs ( w , v ) ;
  }
  /* calc the result */
  if ( S == null ) return c ;
  int d = calc ( S ) ;
  int s = Integer . parseInt ( S [ 0 ] ) ;
  int k = s - c ;
  if ( ! 0 <= k && k <= d ) ok = 0 ;
  /* calc the result */
  final int [ ] r = new int [ 2 ] ;
  for ( int i = 0 ;
  i < r . length ;
  i ++ ) r [ i ] = r [ i ] ;
  Collections . shuffle ( r ) ;
  d = new int [ 2 ] ;
  for ( int i = 0 ;
  i < r . length ;
  i ++ ) {
    dfs ( r [ i ] , - 1 ) ;
  }
  if ( ok ) System . out . println ( "YES" ) ;
  else System . out . println ( "NO" ) ;
  return r ;
}
