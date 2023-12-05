static int k = Integer . parseInt ( input ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] v = new String [ n ] , w = new String [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    v [ i ] = input . nextLine ( ) ;
    w [ i ] = input . nextLine ( ) ;
    v [ i ] = Lists . newArrayList ( Integer . parseInt ( v [ i ] ) - 1 ) ;
  }
  return n ;
}
