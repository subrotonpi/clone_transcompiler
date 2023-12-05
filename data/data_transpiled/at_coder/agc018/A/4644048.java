public static String print ( int N , int K ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  String pos = "POSSIBLE" ;
  String imp = "IMPOSSIBLE" ;
  if ( max ( A ) < K ) {
    System . out . println ( imp ) ;
    exit ( ) ;
  }
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    int a = A [ i - 1 ] ;
    int b = A [ i ] ;
    while ( a != b ) {
      if ( a < b ) {
        b -= ( b / a ) * a ;
        if ( b == 0 ) b = a ;
      }
      else {
        a -= ( a / b ) * b ;
        if ( a == 0 ) a = b ;
      }
    }
    A [ i - 1 ] = a ;
    A [ i ] = b ;
  }
  if ( K % A [ N - 1 ] == 0 ) {
    System . out . println ( pos ) ;
  }
  else {
    System . out . println ( imp ) ;
  }
  return pos ;
}
