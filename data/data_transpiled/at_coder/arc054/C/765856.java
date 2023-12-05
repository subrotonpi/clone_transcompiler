public static void printmat ( int [ ] [ ] matrix ) {
  for ( int x : matrix ) {
    System . out . println ( Arrays . toString ( matrix ) ) ;
  }
  System . out . println ( ) ;
  /* det = matrix.length */
  int N = matrix . length ;
  int a = 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( matrix [ i ] [ i ] == 0 ) {
      int [ ] index = new int [ N ] ;
      for ( int k = i + 1 ;
      k < N ;
      k ++ ) {
        if ( matrix [ k ] [ i ] != 0 ) {
          index [ k ] = k ;
        }
      }
      if ( index . length == 0 ) {
        return ;
      }
      else {
        int k = index [ 0 ] ;
        a *= - 1 ;
        matrix [ i ] = matrix [ k ] ;
      }
    }
  }
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
  }
}
