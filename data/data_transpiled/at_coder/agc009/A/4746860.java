public static int [ ] getN ( ) {
  int [ ] A = new int [ N ] ;
  int [ ] B = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    A [ i ] = a ;
    B [ i ] = b ;
  }
  return A ;
}
