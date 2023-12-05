@ VisibleForTesting static int [ ] [ ] getFramingDigits ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > [ ] A = new List [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    A [ i ] = Lists . newArrayList ( ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    A [ i ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = A [ i ] [ 0 ] ;
    int b = A [ i ] [ 1 ] ;
    int c = A [ i ] [ 2 ] ;
    int d = A [ i ] [ 3 ] ;
    int g = gcd ( b , d ) ;
    if ( a < b || b > d || b - g + ( a % g ) > c ) {
      System . out . println ( "No" ) ;
    }
    else {
      System . out . println ( "Yes" ) ;
    }
  }
  return A ;
}
