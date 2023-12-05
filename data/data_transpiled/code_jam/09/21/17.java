static private String brak ( String str ) {
  final int s = 0 ;
  String ret = "" ;
  while ( ( s = str . indexOf ( null , s ) ) != - 1 ) {
    String token = str . substring ( s + 1 ) ;
    str = str . substring ( s + 1 ) ;
    if ( ( token . equals ( "(" ) ) && ( token . equals ( ")" ) ) s = s + 1 ;
    else if ( token . equals ( ")" ) ) s = s - 1 ;
    ret += token + " " ;
    if ( ( s == 0 ) ) break ;
  }
  return ret + " " + str ;
  /* prob */
  /* if ((token == " || ").indexOf(" ")) = -1 */
  if ( ( token . split ( " " ) . length == 3 ) && ( token . split ( " " ) . length > 3 ) ) return Double . parseDouble ( token . split ( " " ) [ 1 ] ) ;
  assert ( token . split ( " " ) . length > 3 ) ;
  String bleft = token . split ( null , 3 ) [ 0 ] ;
  String weight = token . split ( " " ) [ 1 ] ;
  String feature = token . split ( " " ) [ 2 ] ;
  String left = brak ( bleft ) ;
  String right = brak ( right ) ;
  if ( features . contains ( feature ) ) return prob ( features , left ) * Double . parseDouble ( weight ) ;
  else return prob ( features , right ) * Double . parseDouble ( weight ) ;
}
