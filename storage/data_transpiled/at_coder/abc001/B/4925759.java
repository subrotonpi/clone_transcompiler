public static void print ( int m ) {
  m = Integer . parseInt ( input . nextLine ( ) ) ;
  double km = m / 1000 ;
  if ( km < 0.1 ) {
    System . out . println ( "00" ) ;
  }
  else if ( km <= 5 ) {
    System . out . println ( ( int ) ( km * 10 ) + " " ) ;
  }
  else if ( km <= 30 ) {
    System . out . println ( ( int ) ( km + 50 ) + " " ) ;
  }
  else if ( km <= 70 ) {
    System . out . println ( ( int ) ( ( km - 30 ) / 5 + 80 ) + " " ) ;
  }
  else {
    System . out . println ( "89" ) ;
  }
}
