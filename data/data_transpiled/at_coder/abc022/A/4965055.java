public static void n ( ) {
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] w = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    w [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int c = 0 ;
  int p = 0 ;
  for ( int i = 0 ;
  i < w . length ;
  i ++ ) {
    p += w [ i ] ;
    if ( s <= p && p <= t ) c ++ ;
  }
  System . out . println ( c ) ;
}
