public static boolean solvable ( int A , int [ ] motes , int adds ) {
  for ( int m : motes ) {
    while ( m >= A && adds > 0 ) {
      A += A - 1 ;
      adds -- ;
    }
    if ( m >= A ) {
      return false ;
    }
    A += m ;
  }
  {
    int A = Integer . parseInt ( readLine ( ) ) ;
    int N = Integer . parseInt ( readLine ( ) ) ;
    Arrays . sort ( motes ) ;
    int best = 1000000000 ;
    for ( int adds : xrange ( N + 1 ) ) {
      for ( int removes : xrange ( N + 1 ) ) {
        if ( solvable ( A , motes , 0 , N - removes , adds ) ) {
          best = Math . min ( best , adds + removes ) ;
        }
      }
    }
    System . out . println ( "Case #" + A + ": " + best ) ;
  }
  for ( int test_case = xrange ( 1 , Integer . parseInt ( readLine ( ) ) + 1 ) ;
  test_case <= xrange ( 1 , Integer . parseInt ( readLine ( ) ) ) ;
  test_case ++ ) {
    solveCase ( test_case ) ;
  }
  return true ;
}
