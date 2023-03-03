public static String S = input ( ) {
  String S = S . substring ( 0 , S . length ( ) - 1 ) ;
  do {
    switch ( S . substring ( 0 , 5 ) ) {
      case "maerd" : S = S . substring ( 5 ) ;
      break ;
      case "remaerd" : S = S . substring ( 7 ) ;
      break ;
      case "esare" : S = S . substring ( 5 ) ;
      break ;
      case "resare" : S = S . substring ( 6 ) ;
      break ;
      default : break ;
    }
  }
  while ( S . length ( ) == 0 ) ;
  if ( S . length ( ) == 0 ) System . out . println ( "YES" ) ;
  else System . out . println ( "NO" ) ;
  return S ;
}
