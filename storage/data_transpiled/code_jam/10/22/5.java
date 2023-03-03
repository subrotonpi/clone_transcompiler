input ;
C = input . readInt ( ) ;
for ( int c = 0 ;
c < C ;
c ++ ) {
  N = Integer . parseInt ( readLine ( ) ) ;
  K = Integer . parseInt ( readLine ( ) ) ;
  B = Integer . parseInt ( readLine ( ) ) ;
  T = Integer . parseInt ( readLine ( ) ) ;
  X = Integer . parseInt ( readLine ( ) ) ;
  V = Integer . parseInt ( readLine ( ) ) ;
  int swich = 0 ;
  int done = 0 ;
  int skip = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( done == K ) break ;
    if ( ( V . intValue ( ) - i - 1 ) * T >= B - X . intValue ( ) ) {
      done ++ ;
      swich += skip ;
    }
    else skip ++ ;
  }
  if ( ( done == K ) && ( swich == B ) ) System . out . println ( "Case #" + ( c + 1 ) + ": " + swich ) ;
  else System . out . println ( "Case #" + ( c + 1 ) + ": IMPOSSIBLE" ) ;
}
