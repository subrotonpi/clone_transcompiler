public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int X [ ] = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i ] = X [ i ] - A ;
  }
  int [ ] L = new int [ 5001 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L [ 2500 ] = 1 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( x [ i ] >= 0 ) {
      for ( int j = 0 ;
      j < 5001 ;
      j ++ ) {
        if ( L [ j ] > 0 ) {
          L [ j + x [ i ] ] += L [ j ] ;
        }
      }
    }
  }
  System . out . println ( L [ 2500 ] - 1 ) ;
  return L ;
}
