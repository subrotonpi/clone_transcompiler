public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < k - 1 ;
  i ++ ) {
    a [ i ] = a [ i ] * ( k - 1 - i ) ;
  }
  for ( int j = 0 ;
  j < k - 1 ;
  j ++ ) {
    a [ j ] = a [ j ] * ( k - 1 - j ) ;
  }
  System . out . println ( ans ) ;
}
