public static int [ ] inpl ( ) {
  return Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = inpl ( ) ;
  int [ ] ans = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans [ i ] = 0 ;
  }
  if ( n % 2 != 0 ) {
    for ( int i = 0 ;
    i < a . length ;
    i ++ ) {
      int ai = a [ i ] ;
      if ( i % 2 != 0 ) {
        ans [ n / 2 - ( i + 1 ) / 2 ] = ai ;
      }
      else {
        ans [ n / 2 + ( i + 1 ) / 2 ] = ai ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
