public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  boolean [ ] l1 = new boolean [ N + 1 ] ;
  boolean [ ] l2 = new boolean [ N + 1 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    if ( a == 1 ) l1 [ b ] = true ;
    else if ( b == N ) l2 [ a ] = true ;
  }
  boolean fl = false ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( l1 [ i ] && l2 [ i ] ) fl = true ;
  }
  if ( fl ) System . out . println ( "POSSIBLE" ) ;
  else System . out . println ( "IMPOSSIBLE" ) ;
}
