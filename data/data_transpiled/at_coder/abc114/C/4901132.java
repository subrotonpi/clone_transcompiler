public static int dfs ( String s ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( Integer . parseInt ( s ) > N ) return 0 ;
  if ( Arrays . binarySearch ( '753' , s ) > 0 ) {
    int ret = 1 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) ret += dfs ( s + i ) ;
    return ret ;
  }
  return 0 ;
}
