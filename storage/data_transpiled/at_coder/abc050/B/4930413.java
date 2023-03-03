public static int n = Integer . parseInt ( input ) {
  int [ ] T = new int [ n ] ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int p = Integer . parseInt ( input . nextLine ( ) ) ;
    int k = Integer . parseInt ( input . nextLine ( ) ) ;
    int tmp = T [ p - 1 ] ;
    T [ p - 1 ] = k ;
    System . out . println ( Arrays . toString ( T ) ) ;
    T [ p - 1 ] = tmp ;
  }
  return T [ m ] ;
}
