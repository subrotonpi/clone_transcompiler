public static int n = Integer . parseInt ( input ) {
  int [ ] t = new int [ n ] ;
  for ( int i = 0 ;
  i < t . length ;
  i ++ ) {
    t [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int p = Integer . parseInt ( input . nextLine ( ) ) ;
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    System . out . println ( Arrays . toString ( t ) - ( t [ p - 1 ] - x ) ) ;
  }
  return m ;
}
