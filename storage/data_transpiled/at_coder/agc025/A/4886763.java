public static int N = Integer . parseInt ( input ) {
  int minimum = 10 * 5 ;
  for ( int i = 1 ;
  i <= - ( - N / 2 ) ;
  i ++ ) {
    int A = i ;
    int B = N - i ;
    int total = 0 ;
    for ( ;
    total < 6 ;
    total ++ ) {
      total += A % 10 + B % 10 ;
      A /= 10 ;
      B /= 10 ;
    }
    if ( total < minimum ) {
      minimum = total ;
    }
  }
  System . out . println ( minimum ) ;
  return minimum ;
}
