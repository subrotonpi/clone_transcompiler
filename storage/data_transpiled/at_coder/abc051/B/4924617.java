public static List < Integer > solve ( ) {
  A = list ( map ( Integer :: parseInt , input ( ) ) ) ;
  int K = A . get ( 0 ) ;
  int S = A . get ( 1 ) ;
  int count = 0 ;
  for ( int a = 0 ;
  a < K + 1 ;
  a ++ ) {
    for ( int b = 0 ;
    b < K + 1 ;
    b ++ ) {
      int c = S - a - b ;
      if ( 0 <= c && c <= K ) {
        count ++ ;
      }
      else {
        continue ;
      }
    }
  }
  return count ;
}
