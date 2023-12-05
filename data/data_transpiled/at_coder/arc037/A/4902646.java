public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] mm = new int [ n ] ;
  for ( int i = 0 ;
  i < mm . length ;
  i ++ ) {
    mm [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int res = 0 ;
  for ( int m : mm ) {
    if ( m < 80 ) {
      res += 80 - m ;
    }
  }
  System . out . println ( res ) ;
}
