public static void print ( int n = Integer . parseInt ( input ) ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  HashMap < Integer , Integer > map = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    int ai = Integer . parseInt ( input . nextLine ( ) ) ;
    map . put ( ai , i ) ;
  }
  for ( int ai : a ) {
    System . out . println ( map . get ( ai ) ) ;
  }
}
