public static byte [ ] toByteArray ( String input ) {
  byte ans ;
  a = input . charAt ( 0 ) ;
  if ( a . equals ( 'a' ) ) {
    ans = - 1 ;
    System . out . println ( ans ) ;
  }
  else if ( a . length ( ) == 1 ) {
    int tmp = ( a . charAt ( 0 ) - 1 ) ;
    ans = ( byte ) tmp ;
    System . out . println ( ans ) ;
  }
  else if ( a . length ( ) >= 2 ) {
    ans = a . substring ( 0 , a . length ( ) - 1 ) ;
    System . out . println ( ans ) ;
  }
  return ans ;
}
