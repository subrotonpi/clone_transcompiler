@ org . python . Method ( __doc__ = "division #1\n" + "Case #2: 2.5000000\n" ) public static void main ( String [ ] args ) {
  /* Test cases */
  double [ ] p = new double [ c ] ;
  for ( int i = 0 ;
  i < c ;
  i ++ ) {
    p [ i ] = 1.0 ;
  }
  /* Test cases */
  assert TEST_DATA [ 0 ] == args [ 1 ] ;
  String [ ] p3_ = new String [ c + 1 ] ;
  int nn = 0 ;
  double cumul = 0 ;
  double remaining = 1.0 ;
  double oldremaining = 0 ;
  for ( int i = 0 ;
  i < c ;
  i ++ ) {
    double [ ] p3 = new double [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      double [ ] p4 = new double [ n + 1 ] ;
      for ( int k = 0 ;
      k < n ;
      k ++ ) {
        p3k = p3 [ k ] ;
        if ( p3k == 0 ) continue ;
        double ppp = ( i + k - j ) / ( c - j ) ;
        p4 [ k ] += p3k * ppp ;
        p4 [ k + 1 ] += p3k * ( 1 - ppp ) ;
      }
      p3 = p4 ;
    }
    p3_ [ i ] = p3 ;
  }
  while ( remaining > 1e-10 || oldremaining == remaining ) {
    oldremaining = remaining ;
    double [ ] p2 = new double [ c + 1 ] ;
    for ( int i = 0 ;
    i < c ;
    i ++ ) {
      double pi = p [ i ] ;
      p3 [ i ] = p3_ [ i ] ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        if ( i + j > c ) {
          if ( p3 [ j ] != 0 ) debugger ( ) ;
          assert p3 [ j ] == 0 ;
          continue ;
        }
        p2 [ i + j ] += pi * p3 [ j ] ;
      }
    }
    p = p2 ;
    nn ++ ;
    cumul += nn * p [ c ] ;
    remaining -= p [ c ] ;
    p [ c ] = 0 ;
  }
  /* Test cases */
  assert ( p == null ) ;
  /* Test cases */
  assert ( p == null ) ;
  /* Test cases */
  assert ( p == null ) ;
  /* Test cases */
  assert ( p == null ) ;
}
