public static String S = input ( ) {
  S = S . substring ( 0 , S . length ( ) - 1 ) ;
  S = S . replace ( "resare" , "" ) ;
  S = S . replace ( "esare" , "" ) ;
  S = S . replace ( "remaerd" , "" ) ;
  S = S . replace ( "maerd" , "" ) ;
  if ( S . length ( ) > 0 ) {
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
  }
  return S ;
}
