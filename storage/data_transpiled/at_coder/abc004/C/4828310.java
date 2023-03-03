static void card = new LinkedList < Integer > ( ) {
  for ( int i = 1 ;
  i <= 7 ;
  i ++ ) {
  }
  int N = Integer . parseInt ( input . nextLine ( ) ) % 30 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int tmp = card [ i % 5 ] ;
    card [ i % 5 ] = card [ ( i % 5 ) + 1 ] ;
    card [ ( i % 5 ) + 1 ] = tmp ;
  }
  for ( int i = 0 ;
  i < 6 ;
  i ++ ) {
    System . out . print ( card [ i ] + "," ) ;
  }
}
