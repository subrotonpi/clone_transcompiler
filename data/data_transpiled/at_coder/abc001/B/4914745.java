public static void print ( String input ) {
  int m = Integer . parseInt ( input ) ;
  if ( m < 100 ) {
    System . out . println ( "00" ) ;
  }
  else if ( m <= 5000 ) {
    m /= 100 ;
    StringBuilder sb = new StringBuilder ( String . valueOf ( m + 100 ) ) ;
    System . out . println ( sb . toString ( ) ) ;
  }
  else if ( m <= 30000 ) {
    m /= 1000 ;
    m += 50 ;
    System . out . println ( m ) ;
  }
  else if ( m <= 70000 ) {
    m = ( m - 30000 ) / 5 + 80000 ;
    System . out . println ( m / 1000 ) ;
  }
  else {
    System . out . println ( 89 ) ;
  }
}
