public static int x = Integer . parseInt ( input ) {
  final int huga = ( int ) ( ( - 1 + Math . sqrt ( 1 + 8 * x ) ) / 2 ) ;
  if ( huga * ( huga + 1 ) == 2 * x ) {
    System . out . println ( huga ) ;
  }
  else {
    System . out . println ( huga + 1 ) ;
  }
  return huga ;
}
