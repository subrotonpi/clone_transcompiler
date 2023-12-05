static final String getDisplay ( ) {
  final String [ ] ss = input . split ( "T" ) ;
  final int x = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  final int y = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  final Map < Integer , Boolean > dpx = Maps . newHashMap ( ) ;
  final Map < Integer , Boolean > dpy = Maps . newHashMap ( ) ;
  dpx . put ( 0 + ss [ 0 ] . length ( ) , true ) ;
  dpy . put ( 0 , true ) ;
  int direct = 1 ;
  for ( int i = 1 ;
  i < ss . length ;
  i ++ ) {
    final String s = ss [ i ] ;
    if ( s . length ( ) > 0 ) {
      System . out . println ( "[" + s + "] " + " " + " " + " " + " " + " " + " " + " " + " " + " " + i ) ;
    }
  }
  if ( x == 0 && y == 0 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return "" ;
}
