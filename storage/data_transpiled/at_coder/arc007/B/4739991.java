public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Integer > nLs = new ArrayList < > ( N + 1 ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) nLs . add ( i ) ;
  int liscd = 0 ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int cd = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( nLs . contains ( cd ) ) {
      int case = nLs . indexOf ( cd ) ;
      nLs . set ( case , liscd ) ;
      liscd = cd ;
    }
  }
  for ( int c : nLs ) {
    System . out . println ( c ) ;
  }
  return nLs . toArray ( new Integer [ nLs . size ( ) ] ) ;
}
