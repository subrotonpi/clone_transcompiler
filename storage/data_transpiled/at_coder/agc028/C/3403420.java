@ VisibleForTesting static int [ ] [ ] heapSort ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] values = new int [ 2 * N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int A = Integer . parseInt ( input ( ) ) ;
    int B = Integer . parseInt ( input ( ) ) ;
    values [ i ] = A ;
    values [ i + N ] = B ;
  }
  {
    int N = R_arr . length ;
    int [ ] R_args = new int [ N ] ;
    int [ ] R_vars = new int [ N ] ;
    int [ ] h = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      heapSort ( h , ( R_arr [ i ] ) -> {
      }
      ) ;
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int a = heapSort ( h , ( R_arr [ i ] ) -> {
      }
      ) ;
      int b = heapSort ( h , ( R_arr [ i ] ) -> {
      }
      ) ;
      R_args [ i ] = b ;
      R_vars [ i ] = a ;
    }
    return R_vars ;
  }
  {
    int [ ] valuesSorted = Arrays . copyOf ( values , values . length ) ;
    int [ ] args = new int [ N ] ;
    Arrays . sort ( args ) ;
    int [ ] picked = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) picked [ args [ i ] % N ] = 1 ;
    if ( Arrays . binarySearch ( picked , N ) == N ) {
      int res1 ;
      int res2 ;
      res2 = Arrays . binarySearch ( values , 0 , N + 1 ) - valuesSorted [ N - 2 ] ;
      res = Math . min ( res1 , res2 ) ;
    }
    else {
      res = Arrays . binarySearch ( values , 0 , N ) ;
    }
    int res3 = Arrays . binarySearch ( values , N , N ) ;
    int res4 = Arrays . binarySearch ( values , N , N ) ;
    res = Math . min ( res , res3 , res4 ) ;
  }
  System . out . println ( res ) ;
  return values ;
}
