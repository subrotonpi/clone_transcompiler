@ VisibleForTesting static int [ ] binarySearch ( ) {
  final int [ ] S = new int [ 10 ] ;
  final int MX = 10 * 14 ;
  {
    String str = String . valueOf ( x ) ;
  }
  {
    boolean palind = String . valueOf ( x ) . equals ( "" ) ;
  }
  {
    int x = Integer . parseInt ( x ) ;
    if ( ( ! palind ) || ( ! palind ) ) return false ;
    if ( ( ! palind ) && ( x * x > MX ) ) return false ;
    S [ 0 ] = x * x ;
    return true ;
  }
  {
    int x ;
  }
  {
    for ( int i = 1 ;
    i < 10 * 9 ;
    i ++ ) {
      String A = String . valueOf ( i ) ;
      String B = String . valueOf ( A ) ;
      String X = A + B ;
      String Y = A + B . substring ( 1 ) ;
      check ( X ) ;
      check ( Y ) ;
      if ( ( Integer . parseInt ( Y ) * Y > MX ) && ( Integer . parseInt ( Y ) * Y > MX ) ) break ;
    }
    Arrays . sort ( S ) ;
  }
  preprocess ( ) ;
  int t = input . nextInt ( ) ;
  {
    int count = bisect_right ( S , x ) ;
    int solve ( A , B ) ;
    return count - count - ( B - 1 ) ;
  }
  for ( int testc = 1 ;
  testc <= t ;
  testc ++ ) {
    System . out . format ( "Case #%d:" , testc ) ;
    int A = Integer . parseInt ( input . nextLine ( ) ) ;
    int B = Integer . parseInt ( input . nextLine ( ) ) ;
    solve ( A , B ) ;
  }
}
