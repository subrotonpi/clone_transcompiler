public static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int lenN = String . valueOf ( n ) . length ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < lenN ;
  i ++ ) {
    ans += ( n / ( 10 * ( i + 1 ) ) ) * ( 10 * ( i ) ) ;
    if ( Integer . parseInt ( String . valueOf ( n ) . substring ( n - ( i + 1 ) ) ) > 1 ) {
      ans += 10 * i ;
    }
    else if ( Integer . parseInt ( String . valueOf ( n ) . substring ( n - ( i + 1 ) ) ) == 1 ) {
      ans += n % ( 10 * i ) + 1 ;
    }
  }
  System . out . println ( ans ) ;
}
