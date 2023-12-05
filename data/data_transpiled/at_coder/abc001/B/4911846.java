public static int m ( ) {
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( m < 100 ) {
    System . out . println ( "00" ) ;
  }
  else if ( 100 <= m && m <= 5000 ) {
    if ( m / 100 < 10 ) {
      System . out . println ( "0" + Integer . toString ( m / 100 ) ) ;
    }
    else {
      System . out . println ( Integer . toString ( m / 100 ) ) ;
    }
  }
  else if ( 6000 <= m && m <= 30000 ) {
    System . out . println ( Integer . toString ( m / 1000 + 50 ) ) ;
  }
  else if ( 35000 <= m && m <= 70000 ) {
    System . out . println ( Integer . toString ( ( m / 1000 - 30 ) / 5 + 80 ) ) ;
  }
  else {
    System . out . println ( 89 ) ;
  }
  return m ;
}
