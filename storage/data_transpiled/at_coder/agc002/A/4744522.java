public static int getInt ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) , b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a * b <= 0 ) System . out . println ( "Zero" ) ;
  else if ( 0 < a ) System . out . println ( "Positive" ) ;
  else {
    if ( ( b - a ) % 2 == 1 ) System . out . println ( "Positive" ) ;
    else System . out . println ( "Negative" ) ;
  }
  return a ;
}
