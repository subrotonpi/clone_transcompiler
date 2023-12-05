static void print ( String [ ] ss ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  Map < Integer , Boolean > dpx = Maps . newHashMap ( ) ;
  Map < Integer , Boolean > dpy = Maps . newHashMap ( ) ;
  dpx . put ( 0 + ss [ 0 ] . length ( ) , true ) ;
  dpy . put ( 0 , true ) ;
  int direct = 1 ;
  for ( int i = 1 ;
  i < ss . length ;
  i ++ ) {
    String [ ] s = ss [ i ] . split ( "T" ) ;
    if ( direct % 2 == 0 ) {
      Map < Integer , Boolean > tmp = Maps . newHashMap ( ) ;
      int n = s . length ;
      for ( Map . Entry < Integer , Boolean > e : dpx . entrySet ( ) ) {
        tmp . put ( e . getKey ( ) + n , true ) ;
        tmp . put ( e . getValue ( ) - n , true ) ;
      }
      direct ++ ;
      dpx = tmp ;
    }
    else {
      Map < Integer , Boolean > tmp = Maps . newHashMap ( ) ;
      int n = s . length ;
      for ( Map . Entry < Integer , Boolean > e : dpy . entrySet ( ) ) {
        tmp . put ( e . getKey ( ) + n , true ) ;
        tmp . put ( e . getValue ( ) - n , true ) ;
      }
      direct ++ ;
      dpy = tmp ;
    }
  }
  if ( dpx . containsKey ( x ) && dpy . containsKey ( y ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
