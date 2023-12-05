public static int N = Integer . parseInt ( input ) {
  int Y = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < N - i + 1 ;
    j ++ ) {
      int k = N - ( i + j ) ;
      if ( i * 10000 + j * 5000 + k * 1000 == Y && ( i + j + k ) == N ) {
        System . out . println ( i + " " + j + " " + k ) ;
        exit ( ) ;
      }
    }
  }
  return Y ;
}
