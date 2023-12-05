public static int [ ] getSums ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  Map < Integer , Integer > sum = new HashMap < > ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    Integer K = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int j = 1 ;
    j <= K ;
    j ++ ) {
      if ( ! sum . containsKey ( K ) ) {
        sum . put ( K , j ) ;
      }
      else {
        sum . put ( K , j ) ;
      }
    }
  }
  for ( int k : sum . keySet ( ) ) {
    if ( sum . get ( k ) == N ) {
      ans ++ ;
    }
  }
  return ans ;
}
