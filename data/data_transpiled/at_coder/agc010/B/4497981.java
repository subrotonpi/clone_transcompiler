public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int sum_a = Arrays . stream ( a ) . sum ( ) ;
  int len_a = a . length ;
  int kaisu = sum_a / ( ( 1 / 2 ) * ( len_a ) * ( len_a + 1 ) ) ;
  if ( sum_a % ( ( 1 / 2 ) * ( len_a ) * ( len_a + 1 ) ) != 0 ) {
    System . out . println ( "NO" ) ;
    exit ( ) ;
  }
  int ans_kaisu = 0 ;
  a [ 0 ] = a [ 0 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int tmp = ( kaisu - ( a [ i + 1 ] - a [ i ] ) ) / len_a ;
    if ( ( kaisu - ( a [ i + 1 ] - a [ i ] ) ) % len_a != 0 || tmp < 0 ) {
      System . out . println ( "NO" ) ;
      exit ( ) ;
    }
    ans_kaisu += tmp ;
  }
  if ( ans_kaisu == kaisu ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
