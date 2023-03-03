public static boolean isNumeric ( ) {
  boolean flag = true ;
  if ( S . indexOf ( "W" ) == 0 && S . indexOf ( "E" ) == 0 ) {
    if ( S . indexOf ( "N" ) == 0 || S . indexOf ( "S" ) == 0 ) flag = false ;
    else flag = true ;
  }
  else if ( S . indexOf ( "W" ) == 0 || S . indexOf ( "E" ) == 0 ) flag = false ;
  else if ( S . indexOf ( "N" ) == 0 && S . indexOf ( "S" ) == 0 ) flag = true ;
  else if ( S . indexOf ( "N" ) == 0 || S . indexOf ( "S" ) == 0 ) flag = false ;
  else flag = true ;
  if ( flag == true ) System . out . println ( "Yes" ) ;
  else System . out . println ( "No" ) ;
  return flag ;
}
