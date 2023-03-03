public static int n ( ) {
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] t = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    t [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( t ) ;
  int result = 1 ;
  int count = 0 ;
  int f = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( t [ i ] - t [ f ] ) > k || c == count ) {
      result ++ ;
      count = 1 ;
      f = i ;
    }
    else {
      count ++ ;
    }
  }
  System . out . println ( result ) ;
  return result ;
}
