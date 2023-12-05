@ VisibleForTesting static Iterable < Integer > accumulate ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > rh = Arrays . asList ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int [ ] acm = new int [ 10 * 5 + 1 ] ;
  int [ ] [ ] vec = new int [ 10 * 5 + 1 ] [ 3 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int num = rh . get ( i ) . intValue ( ) ;
    acm [ num ] ++ ;
    switch ( rh . get ( i ) . intValue ( ) ) {
      case 1 : vec [ num ] [ 0 ] ++ ;
      break ;
      case 2 : vec [ num ] [ 1 ] ++ ;
      break ;
      case 3 : vec [ num ] [ 2 ] ++ ;
      break ;
    }
  }
  List < Integer > lacm = Lists . < Integer > newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int num = rh . get ( i ) . intValue ( ) ;
    int K = lacm . get ( num - 1 ) ;
    int A = vec [ num ] [ 0 ] ;
    int B = vec [ num ] [ 1 ] ;
    int C = vec [ num ] [ 2 ] ;
    switch ( rh . get ( i ) . intValue ( ) ) {
      case 1 : System . out . println ( K + B + " " + ( n - K - A - B ) + " " + A - 1 ) ;
      break ;
      case 2 : System . out . println ( K + C + " " + ( n - K - B - C ) + " " + B - 1 ) ;
      break ;
      case 3 : System . out . println ( K + A + " " + ( n - K - C - A ) + " " + C - 1 ) ;
      break ;
    }
  }
  return lacm ;
}
