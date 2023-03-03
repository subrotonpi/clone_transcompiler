public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] [ ] a = new int [ n ] [ n ] ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    a [ j ] = Integer . parseInt ( input ) ;
  }
  int [ ] b = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    b [ i ] = a [ i ] [ 0 ] + a [ i ] [ 1 ] + a [ i ] [ 2 ] + a [ i ] [ 3 ] + ( a [ i ] [ 4 ] * 110 ) / 900 ;
  }
  System . out . println ( max ( b ) ) ;
}
