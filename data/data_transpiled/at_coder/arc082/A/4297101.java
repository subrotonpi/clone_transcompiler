public static void N ( ) {
  int [ ] a = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] array = new int [ 10 * 5 + 10 ] ;
  for ( int i = - 1 ;
  i <= 10 * 5 ;
  i ++ ) {
    array [ i - 1 ] ++ ;
    array [ i ] ++ ;
    array [ i + 1 ] ++ ;
  }
  Arrays . sort ( array ) ;
  for ( int i : new ArrayList < > ( array ) ) {
    if ( ( ! i < 0 ) && ( ! i < N ) ) {
      System . out . println ( i ) ;
      exit ( ) ;
    }
  }
}
