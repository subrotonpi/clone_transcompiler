public static void main ( String [ ] args ) {
  A = new LinkedList < Integer > ( Arrays . asList ( input . split ( " " ) ) ) ;
  int s = 0 ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    s += A [ i - 1 ] * A [ i ] ;
  }
  System . out . println ( s * 2 ) ;
}
