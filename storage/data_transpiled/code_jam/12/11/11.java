public static void testCount ( Scanner in ) {
  int testCount = in . nextInt ( ) ;
  for ( int testIndex = 0 ;
  testIndex < testCount ;
  testIndex ++ ) {
    String ans = "Case #" + ( testIndex + 1 ) + ": " ;
    int n = in . nextInt ( ) , m = in . nextInt ( ) ;
    double [ ] p = in . nextDouble ( ) . split ( " " ) ;
    double minType = m + 1.0 ;
    double p1 = reduce ( 1.0 , p , 1.0 ) ;
    double type = ( m - n ) * p1 + ( m - n + 1 + m ) * ( 1 - p1 ) ;
    minType = Math . min ( type , minType ) ;
    p1 = 1.0 ;
    for ( int i = 1 ;
    i < n ;
    i ++ ) {
      p1 *= p [ i - 1 ] ;
      type = ( n - i + m - i ) * p1 + ( n - i + m - i + 1 + m ) * ( 1 - p1 ) ;
      minType = Math . min ( type , minType ) ;
    }
    System . out . println ( ans + ( minType + 1.0 ) ) ;
  }
}
