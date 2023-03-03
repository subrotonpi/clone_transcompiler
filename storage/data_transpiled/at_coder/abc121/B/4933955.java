public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int [ ] A = new int [ M ] ;
    int sum = 0 ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      sum += A [ j ] * B [ j ] ;
    }
    if ( sum + C > 0 ) {
      ans ++ ;
    }
  }
  return ans ;
}
