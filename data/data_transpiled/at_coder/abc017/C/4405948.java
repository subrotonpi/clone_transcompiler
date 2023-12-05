public static int [ ] [ ] parse ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  List < List < Integer >> L = new ArrayList < > ( ) ;
  int S = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) L . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  int [ ] [ ] P = new int [ M + 1 ] [ N ] ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    P [ L . get ( j ) . get ( 0 ) - 1 ] += L [ j ] . get ( 2 ) ;
  }
  for ( int k = 0 ;
  k < M ;
  k ++ ) P [ k ] [ 0 ] = P [ k ] [ 1 ] ;
  for ( int l = 0 ;
  l < N ;
  l ++ ) S += L [ l ] [ 2 ] ;
  Arrays . sort ( P ) ;
  System . out . println ( S - P [ 1 ] ) ;
  return P ;
}
