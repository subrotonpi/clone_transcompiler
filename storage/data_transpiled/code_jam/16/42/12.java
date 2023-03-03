@ VisibleForTesting static int [ ] solve ( int [ ] p ) {
  /* Compute the maximum of the cases */
  Map < Integer , Double > prob = new HashMap < > ( ) ;
  int k = p . length ;
  assert k % 2 == 0 ;
  for ( int j = 0 ;
  j < k / 2 + 1 ;
  j ++ ) {
    prob . put ( new Integer ( 0 ) , j ) ;
  }
  prob . put ( new Integer ( 0 ) , 1 ) ;
  int i = 0 ;
  for ( Double pp : p ) {
    i ++ ;
    for ( int j = 0 ;
    j < k / 2 + 1 ;
    j ++ ) {
      Double res = prob . get ( new Integer ( i - 1 ) , j ) * ( 1 - pp ) ;
      if ( j > 0 ) {
        res = res + prob . get ( new Integer ( i - 1 ) , j - 1 ) * pp ;
      }
      prob . put ( new Integer ( i ) , res ) ;
    }
  }
  /* Solve the test cases */
  int n = p . length ;
  int k = p . length ;
  Arrays . sort ( p ) ;
  double ans = - 1 ;
  for ( int i = 0 ;
  i < k + 1 ;
  i ++ ) {
    int left = i ;
    int right = k - i ;
    Double pp = p [ left ] + p [ n - right ] ;
    assert pp . length == k ;
    Double prob = calcProbability ( pp ) ;
    if ( prob > ans ) ans = prob ;
  }
  System . err . print ( '.' ) ;
  /* Solve the test cases */
  int tests = Integer . parseInt ( input ( ) ) ;
  List < Entry < Integer , Double >> list = new ArrayList < > ( ) ;
  for ( int test = 0 ;
  test < tests ;
  test ++ ) {
    System . err . print ( Integer . toString ( test ) ) ;
    n = Integer . parseInt ( input ( ) ) ;
    k = Integer . parseInt ( input ( ) ) ;
    p = Collections . singletonList ( new Double ( p . get ( left ) ) ) ;
    list . add ( new Entry < > ( n , k , p ) ) ;
  }
  try {
    for ( int test = 0 ;
    test < tests ;
    test ++ ) {
      System . err . println ( "Case #" + ( test + 1 ) + ": " + res . get ( test ) ) ;
    }
  }
  catch ( Exception