public static int [ ] [ ] a ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] a = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( a ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i % 2 == 1 && ( a [ i ] [ 1 ] - i ) % 2 == 1 ) ans ++ ;
  }
  System . out . println ( ans ) ;
  return a ;
}
