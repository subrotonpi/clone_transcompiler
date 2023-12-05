public static int [ ] getN ( ) {
  int [ ] A = new int [ N ] ;
  for ( String a : input . nextLine ( ) . split ( " " ) ) {
    A [ i ] = Integer . parseInt ( a ) ;
  }
  Arrays . sort ( A ) ;
  int mid = A [ A . length - 1 ] / 2 ;
  int Aj = 0 ;
  return A ;
}
