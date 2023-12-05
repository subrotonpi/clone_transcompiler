public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = Lists . newArrayList ( ) ;
  int [ ] B = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    B [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] candy = new int [ N ] ;
  return candy ;
}
