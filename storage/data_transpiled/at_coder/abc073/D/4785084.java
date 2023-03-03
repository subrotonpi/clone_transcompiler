static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] X = list ( N ) ;
  @ SuppressWarnings ( "unchecked" ) Map < Integer , Set < Integer >> branch = new HashMap < > ( ) ;
  for ( int m = 0 ;
  m < M ;
  m ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    branch . put ( a , new HashSet < > ( ) ) ;
    branch . put ( b , new HashSet < > ( ) ) ;
    branch . put ( b , new HashSet < > ( ) ) ;
  }
  return X [ M ] ;
  /* make dist */
  double [ ] dist = new double [ N + 1 ] ;
  dist [ N ] = 0 ;
  Set < Integer > check = new THashSet < > ( ) ;
  while ( check . size ( ) > 0 ) {
    int now = check . iterator ( ) . next ( ) ;
    for ( Integer b : branch . get ( now ) ) {
      if ( dist [ now ] + b . intValue ( ) < dist [ b . intValue ( ) ] ) {
        dist [ b . intValue ( ) ] = dist [ now ] + b . intValue ( ) ;
        check . add ( b . intValue ( ) ) ;
      }
    }
  }
  Map < Integer , Double > data = new HashMap < > ( ) ;
  for ( int x : X ) {
    data . put ( x , makedist ( x ) ) ;
  }
  /* roop(now,D,notvisit,ans) */
  if ( notvisit . size ( ) == 0 ) {
    return Math . min ( D , ans ) ;
  }
  for ( int nex : notvisit ) {
    ans = roop ( nex , D + data . get ( now ) . get ( nex ) , notvisit - new Integer ( nex ) , ans ) ;
  }
  System . out . println ( ans ) ;
}
