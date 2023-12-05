public static boolean dfs ( int numq , int value ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] tNK = new int [ N ] [ K ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    tNK [ i ] = new int [ N ] ;
    for ( int j = 0 ;
    j < K ;
    j ++ ) {
      tNK [ i ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
  }
  /* if(numq == N) return value == 0 ? true : false ;
  for(int i = 0; i < K; i++) {
  if(dfs(numq+1, value^tNK[numq][i])) return true;
  }
  return false;
  */
  if ( dfs ( 0 , 0 ) ) {
    System . out . println ( "Found" ) ;
  }
  else {
    System . out . println ( "Nothing" ) ;
  }
  return true ;
}
