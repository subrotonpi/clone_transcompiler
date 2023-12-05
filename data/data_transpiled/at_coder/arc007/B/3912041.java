public static int [ ] getM ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] L = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L [ i ] = i + 1 ;
  }
  int P = 0 ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int d = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( L [ j ] == d ) {
        P = L [ j ] ;
        break ;
      }
    }
  }
  for ( int i = 0 ;
  i < L . length ;
  i ++ ) {
    System . out . println ( L [ i ] ) ;
  }
  return L ;
}
