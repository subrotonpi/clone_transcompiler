public static void print ( int n ) {
  int [ ] [ ] ab = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ab [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] ans = new int [ 1000002 ] ;
  for ( int i : ab ) {
    ans [ i ] ++ ;
    ans [ i ] = 1 ;
  }
  int tmp = 0 ;
  int [ ] Cnum = new int [ 1000001 ] ;
  for ( int i = 0 ;
  i < 1000001 ;
  i ++ ) {
    tmp += ans [ i ] ;
    Cnum [ i ] = tmp ;
  }
  System . out . println ( max ( Cnum ) ) ;
}
