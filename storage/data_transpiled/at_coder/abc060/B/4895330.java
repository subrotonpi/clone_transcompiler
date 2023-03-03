public static void main ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  int aModB = a % b ;
  boolean flg = false ;
  while ( aModB > 0 ) {
    aModB = ( aModB + a ) % b ;
    if ( aModB == c ) {
      flg = true ;
      break ;
    }
  }
  if ( flg ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
