public static void n ( ) {
  int ans = 0 ;
  int [ ] m = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    m [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  for ( int i : m ) {
    if ( i < 80 ) {
      ans += 80 - i ;
    }
  }
  System . out . println ( ans ) ;
}
