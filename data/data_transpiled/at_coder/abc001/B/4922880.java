public static int range ( ) {
  int range = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( range <= 5000 ) {
    System . out . println ( range / 100 + "" ) ;
  }
  else if ( range <= 30000 ) {
    System . out . println ( range / 1000 + 50 + "" ) ;
  }
  else if ( range <= 70000 ) {
    System . out . println ( ( range / 1000 - 30 ) / 5 + 80 + "" ) ;
  }
  else {
    System . out . println ( 89 ) ;
  }
  return range ;
}
