public static int n = Integer . parseInt ( input ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] t = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    t [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  for ( int i = 2 ;
  i < n ;
  i ++ ) {
    int sleepTime = t [ i - 2 ] + t [ i - 1 ] + t [ i ] ;
    if ( sleepTime < k ) {
      System . out . println ( i + 1 ) ;
      break ;
    }
  }
  else {
    System . out . println ( - 1 ) ;
  }
  return n ;
}
