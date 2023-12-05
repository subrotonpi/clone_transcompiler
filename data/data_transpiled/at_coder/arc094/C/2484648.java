public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] , B = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    A [ i ] = a ;
    B [ i ] = b ;
  }
  int M = Integer . parseInt ( A [ N ] ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( A [ i ] <= B [ i ] ) {
      B [ i ] -= A [ i ] ;
      A [ i ] = 0 ;
    }
  }
  int ne = M ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( A [ i ] != 0 && B [ i ] < ne ) {
      ne = B [ i ] ;
    }
  }
  return A ;
}
