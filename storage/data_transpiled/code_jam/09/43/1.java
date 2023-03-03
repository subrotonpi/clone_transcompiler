static void L [ ] [ ] R [ ] , G [ ] [ ] U [ ] ;
/* linked A to B */
boolean [ ] [ ] linked = new boolean [ N ] [ N ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  if ( Arrays . binarySearch ( A [ i ] , B [ i ] ) < 0 ) return ;
}
/* match N */
if ( U [ n ] ) return ;
U [ n ] = true ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  if ( R [ i ] == - 1 || match ( R [ i ] ) ) {
    L [ n ] = R [ i ] = i ;
    return ;
  }
}
/* main program */
int T = Integer . parseInt ( readLine ( ) ) ;
for ( int t = 1 ;
t <= T ;
t ++ ) {
  System . out . println ( "Case #" + t + ":" ) ;
  int N = Integer . parseInt ( readLine ( ) ) ;
  int K = Integer . parseInt ( readLine ( ) ) ;
  int [ ] [ ] A = new int [ N ] [ K ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) A [ i ] = map ( Integer . parseInt ( readLine ( ) ) ) ;
  G = new int [ N ] [ K ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int [ ] links = new int [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( linked [ A [ i ] ] [ j ] ) links [ j ] = i ;
    }
    G [ i ] = links ;
  }
  L = new int [ N ] ;
  R = new int [ N ] ;
  int result = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( L [ i ] != - 1 ) continue ;
    U = new boolean [ N ] ;
    result += match ( i ) ;
  }
  System . out . println ( N - result ) ;
}
}
