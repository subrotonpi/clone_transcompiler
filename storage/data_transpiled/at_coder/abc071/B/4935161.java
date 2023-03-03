public static String alp ( ) {
  String alp = "abcdefghijklmnopqrstuvwxyz" ;
  for ( char c : list ( input ) ) {
    alp = alp . replace ( c , "" ) ;
  }
  return alp . length ( ) > 0 ? alp . substring ( 0 , 1 ) : "null" ;
}
