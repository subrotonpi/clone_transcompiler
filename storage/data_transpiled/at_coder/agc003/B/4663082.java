public static void main ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int pairs = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    pairs += a [ i ] / 2 ;
    a [ i ] %= 2 ;
    if ( a [ i ] != 0 ) {
      int syu = Math . min ( a [ i ] , a [ i + 1 ] ) ;
      a [ i + 1 ] -= syu ;
      pairs += syu ;
    }
  }
  pairs += a [ n - 1 ] / 2 ;
  System . out . println ( pairs ) ;
}
