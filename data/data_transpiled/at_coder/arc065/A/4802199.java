public static String S = input ( ) {
  S = S . replace ( "eraser" , "" ) ;
  S = S . replace ( "erase" , "" ) ;
  S = S . replace ( "dreamer" , "" ) ;
  S = S . replace ( "dream" , "" ) ;
  if ( S . equals ( "" ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return S ;
}
