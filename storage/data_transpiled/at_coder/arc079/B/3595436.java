public static int [ ] [ ] a ( ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = 50 ;
  System . out . println ( n ) ;
  int [ ] [ ] l = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int [ ] tmp = new int [ n + 1 - i ] ;
    tmp [ i ] = i + 1 ;
    l [ i ] = tmp ;
  }
  l [ i ] = l [ i ] ;
  return l ;
}
