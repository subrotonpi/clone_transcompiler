public static void print ( String [ ] m ) {
  m = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < m . length ;
  i ++ ) {
    m [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int a = m [ 0 ] ;
  int b = m [ 1 ] ;
  int c = m [ 2 ] ;
  if ( ( b >= a * c ) && ( b >= a * c ) ) {
    System . out . println ( c ) ;
  }
  else {
    System . out . println ( b / a ) ;
  }
}
