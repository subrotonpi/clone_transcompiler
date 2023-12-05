public static void input ( Scanner scanner ) {
  int sum = 0 ;
  for ( String n : scanner . nextLine ( ) . split ( " " ) ) {
    sum += Integer . parseInt ( n ) ;
  }
  if ( Integer . parseInt ( scanner . nextLine ( ) ) % sum == 0 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
