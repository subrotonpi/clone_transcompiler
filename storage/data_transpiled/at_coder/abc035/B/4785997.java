public static void input ( Scanner s ) {
  int t = Integer . parseInt ( s . nextLine ( ) ) ;
  long l = s . nextLong ( ) ;
  long r = s . nextLong ( ) ;
  long u = s . nextLong ( ) ;
  long d = s . nextLong ( ) ;
  long x = s . nextLong ( ) ;
  long res = Math . abs ( l - r ) + Math . abs ( u - d ) ;
  if ( t == 1 ) {
    System . out . println ( res + x ) ;
  }
  else {
    if ( res - x < 0 ) {
      if ( ( x - res ) % 2 == 1 ) {
        System . out . println ( 1 ) ;
      }
      else {
        System . out . println ( 0 ) ;
      }
    }
    else {
      System . out . println ( res - x ) ;
    }
  }
}
