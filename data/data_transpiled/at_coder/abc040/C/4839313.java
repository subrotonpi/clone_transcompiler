public static int [ ] getdp ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Arrays . stream ( input . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int [ ] dp = new int [ N ] ;
  dp [ 0 ] = 0 ;
  dp [ 1 ] = Math . abs ( a [ 1 ] - a [ 0 ] ) ;
  for ( int i = 2 ;
  i < N ;
  i ++ ) {
    dp [ i ] = Math . abs ( a [ i ] - a [ i ] ) ;
  }
  return dp ;
}
