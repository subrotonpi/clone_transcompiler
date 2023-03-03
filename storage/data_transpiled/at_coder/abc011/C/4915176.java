public static void print ( String input ) {
  int i = Integer . parseInt ( input ) ;
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  int s = 0 ;
  boolean boo = true ;
  if ( i == a || i == b || i == c ) {
    System . out . println ( "NO" ) ;
  }
  else {
    while ( i > 0 && boo == true ) {
      if ( i - 3 == a || i - 3 == b || i - 3 == c ) {
        if ( i - 2 == a || i - 2 == b || i - 2 == c ) {
          if ( i - 1 == a || i - 1 == b || i - 1 == c ) {
            boo = false ;
            System . out . println ( "NO" ) ;
          }
          else {
            i -- ;
          }
        }
        else {
          i -= 2 ;
        }
      }
      else {
        i -= 3 ;
      }
      s ++ ;
    }
    if ( s <= 100 && boo ) {
      System . out . println ( "YES" ) ;
    }
    else if ( s > 100 && boo ) {
      System . out . println ( "NO" ) ;
    }
  }
}
