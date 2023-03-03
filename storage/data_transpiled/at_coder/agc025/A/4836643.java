public static int N = Integer . parseInt ( input ) {
  int minCount = 10 * 10 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    int A = i ;
    int B = N - i ;
    int count = 0 ;
    for ( String a : String . valueOf ( A ) . split ( " " ) ) {
      count += Integer . parseInt ( a ) ;
    }
    for ( String b : String . valueOf ( B ) . split ( " " ) ) {
      count += Integer . parseInt ( b ) ;
    }
    minCount = Math . min ( minCount , count ) ;
  }
  return minCount ;
}
