public static void print ( String s ) {
  s = new LinkedList < String > ( ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < 5 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 5 ;
    j ++ ) {
      n -- ;
      if ( n == 0 ) {
        System . out . println ( Arrays . toString ( s . substring ( i , j ) ) ) ;
      }
    }
  }
}
