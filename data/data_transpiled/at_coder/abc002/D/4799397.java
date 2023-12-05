@ Sys public static int [ ] [ ] findKyokudai ( ) {
  String input = System . getProperty ( "input" ) ;
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int [ ] [ ] xy = new int [ M ] [ ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    xy [ i ] = Integer . parseInt ( input ) ;
  }
  Set < Integer > set = new HashSet < Integer > ( ) ;
  set . addAll ( xy ) ;
  /* Is connected */
  int [ ] [ ] edge = new int [ N + 1 ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    edge [ i ] = xy [ i ] [ i ] ;
  }
  /* Find kyokudai */
  List < Integer > ok = new ArrayList < Integer > ( ) ;
  List < Integer > notSearched = new ArrayList < Integer > ( ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    ok . add ( i ) ;
  }
  int [ ] [ ] ans = new int [ N + 1 ] [ ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    ans [ i ] = findKyokudai ( i ) ;
  }
  System . out . println ( Collections . max ( ans ) ) ;
  return ans ;
}
