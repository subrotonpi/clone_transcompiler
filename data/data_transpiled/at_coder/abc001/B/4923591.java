public static int n ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( n < 100 ) && ( n < 1000 ) ) {
    System . out . println ( "00" ) ;
  }
  else if ( ( n < 1000 ) && ( n < 6000 ) ) {
    System . out . print ( "0" ) ;
    System . out . println ( n / 100 ) ;
  }
  else if ( ( n < 6000 ) && ( n < 30000 ) ) {
    System . out . println ( n / 100 ) ;
  }
  else if ( ( n <= 70000 ) && ( n < 70000 ) ) {
    System . out . println ( ( int ) ( 50 + n / 1000 ) ) ;
  }
  else if ( ( n <= 70000 ) && ( n < 70000 ) ) {
    System . out . println ( ( int ) ( 80 + ( - 30 + n / 1000 ) / 5 ) ) ;
  }
  else {
    System . out . println ( "89" ) ;
  }
  return n ;
}
