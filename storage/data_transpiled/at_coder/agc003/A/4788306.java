public static boolean input ( ) {
  s = input ;
  N = s . contains ( "N" ) ;
  S = s . contains ( "S" ) ;
  E = s . contains ( "E" ) ;
  W = s . contains ( "W" ) ;
  if ( N ^ S || E ^ W ) {
    System . out . println ( "No" ) ;
  }
  else {
    System . out . println ( "Yes" ) ;
  }
  return true ;
}
