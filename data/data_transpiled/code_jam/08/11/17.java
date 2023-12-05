public static void main ( String [ ] args ) {
  final Scanner cin = new Scanner ( System . in ) ;
  for ( ;
  ;
  ) {
    final int n = cin . nextInt ( ) ;
    final int [ ] v1 = new int [ n ] ;
    final int [ ] v2 = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      v1 [ i ] = cin . nextInt ( ) ;
      v2 [ i ] = cin . nextInt ( ) ;
    }
    Arrays . sort ( v1 ) ;
    Arrays . sort ( v2 ) ;
    int h1 = 0 ;
    int h2 = 0 ;
    int t1 = 0 ;
    int t2 = n - 1 ;
    int val = 0 ;
    while ( h1 <= t1 && t2 >= h2 && v1 [ h1 ] <= 0 && v2 [ t2 ] >= 0 ) {
      val += v1 [ h1 ] * v2 [ t2 ] ;
      h1 ++ ;
      t2 -- ;
    }
    while ( h1 <= t1 && h2 <= t2 && v2 [ h2 ] <= 0 && v1 [ t1 ] >= 0 ) {
      val += v2 [ h2 ] * v1 [ t1 ] ;
      h2 ++ ;
      t1 -- ;
    }
    assert ( ( ! ( h1 <= t1 && h2 <= t2 ) ) || ( ( v1 [ t1 ] < 0 && v2 [ t2 ] < 0 ) || ( v1 [ h1 ] > 0 && v2 [ h2 ] > 0 ) ) ) ;
    while ( h1 <= t1 && h2 <= t2 ) {
      val += v1 [ h1 ] * v2 [ t2 ] ;
      h1 ++ ;
      t2 -- ;
    }
    System . out . printf ( "Case #%d:%n%n" , ( n + 1 ) + " " + val ) ;
  }
}
