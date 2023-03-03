public static int [ ] getTimes ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int l = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] c = new int [ n ] ;
  int [ ] t = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String [ ] p = input . nextLine ( ) . split ( " " ) ;
    c [ i ] = Integer . parseInt ( p [ 0 ] ) ;
    t [ i ] = Integer . parseInt ( p [ 1 ] ) ;
  }
  return c ;
}
