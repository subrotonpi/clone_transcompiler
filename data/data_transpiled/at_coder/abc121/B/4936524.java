public static int [ ] getBinarySearch ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  int C = Integer . parseInt ( input . readLine ( ) ) ;
  int score = 0 ;
  for ( int n = 1 ;
  n <= N ;
  n ++ ) {
    int blue = Integer . parseInt ( input . readLine ( ) ) ;
    int linear = 0 ;
    for ( int m = 1 ;
    m <= M ;
    m ++ ) {
      linear += deep [ m - 1 ] * blue [ m - 1 ] ;
    }
    if ( linear + C > 0 ) {
      score ++ ;
    }
  }
  return score ;
}
