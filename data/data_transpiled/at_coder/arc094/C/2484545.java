public static int N = Integer . parseInt ( input ) {
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
      A [ i ] = 0 ;
      B [ i ] -= A [ i ] ;
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
  System . out . println ( M - ne ) ;
  return ne ;
}
