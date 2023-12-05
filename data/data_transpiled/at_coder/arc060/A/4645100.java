public static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] x = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) x [ i ] -= A ;
  int [ ] [ ] L = new int [ 10002 ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) L [ i ] [ 5001 + x [ i ] ] = 1 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 10002 ;
    j ++ ) {
      if ( L [ i ] [ j ] != 0 ) {
        L [ i + 1 ] [ j ] += L [ i ] [ j ] ;
        L [ i + 1 ] [ j + x [ i + 1 ] ] += L [ i ] [ j ] ;
      }
    }
  }
  System . out . println ( L [ N - 1 ] [ 5001 ] ) ;
  return 0 ;
}
