public static void testCount ( Scanner in ) {
  int testCount = in . nextInt ( ) ;
  for ( int testIndex = 0 ;
  testIndex < testCount ;
  testIndex ++ ) {
    String ans = "Case #" + ( testIndex + 1 ) + ": " ;
    int n = in . nextInt ( ) ;
    int [ ] l = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) l [ i ] = in . nextInt ( ) ;
    double [ ] p = new double [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) p [ i ] = in . nextDouble ( ) ;
    double [ ] [ ] a = new double [ n ] [ 2 ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) a [ i ] [ 0 ] = i ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) a [ i ] [ 1 ] = 1.0 * p [ i ] / l [ i ] [ 0 ] ;
    Arrays . sort ( a , new Comparator < Double > ( ) {
      @ Override public int compare ( Double o1 , Double o2 ) {
        return - o1 . compareTo ( o2 ) ;
      }
    }
    ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) ans += a [ i ] [ 0 ] + " " ;
    System . out . println ( ans ) ;
  }
}
