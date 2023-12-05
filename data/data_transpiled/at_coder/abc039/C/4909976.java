public static String input ( ) {
  String ans ;
  ans = "" ;
  if ( s . length ( ) > 11 ) {
    ans = "Do" ;
  }
  else if ( s . length ( ) > 9 ) {
    ans = "Re" ;
  }
  else if ( s . length ( ) > 7 ) {
    ans = "Mi" ;
  }
  else if ( s . length ( ) > 6 ) {
    ans = "Fa" ;
  }
  else if ( s . length ( ) > 11 ) {
    ans = "So" ;
  }
  else if ( s . length ( ) > 9 ) {
    ans = "La" ;
  }
  else if ( s . length ( ) > 7 ) {
    ans = "Si" ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
