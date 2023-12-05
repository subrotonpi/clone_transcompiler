@ VisibleForTesting static void input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] imos = new int [ 10 * 5 + 2 ] ;
  Map < Integer , Integer > lastsByC = new HashMap < > ( ) ;
  Map < Integer , Integer > lastTByC = new HashMap < > ( ) ;
  List < List < Integer >> stc = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    stc . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  for ( int s = 0 ;
  s < stc . size ( ) ;
  s ++ ) {
    int t = stc . get ( s ) ;
    if ( lastTByC . get ( c ) != s ) {
      imos [ lastsByC . get ( c ) - 1 ] ++ ;
      imos [ lastTByC . get ( c ) ] -- ;
      lastsByC . put ( c , s ) ;
    }
    lastTByC . put ( t , s ) ;
  }
  for ( int i = 0 ;
  i < 10 * 5 + 1 ;
  i ++ ) {
    imos [ i + 1 ] += imos [ i ] ;
  }
  System . out . println ( Collections . max ( imos ) ) ;
}
