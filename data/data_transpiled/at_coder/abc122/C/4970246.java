private static void input ( int n , int q ) {
  String s = input . nextLine ( ) ;
  int [ ] t = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    t [ i + 1 ] = t [ i ] + ( s . substring ( i , i + 2 ) . equals ( "AC" ) ? 1 : 0 ) ;
  }
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    System . out . println ( t [ r - 1 ] - t [ l - 1 ] ) ;
  }
}
