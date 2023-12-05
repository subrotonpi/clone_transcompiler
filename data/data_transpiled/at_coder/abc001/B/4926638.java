public static final double getSumOfDigits ( ) {
  final int m = Integer . parseInt ( input . nextLine ( ) ) / 1000 ;
  if ( m < 0.1 ) {
    System . out . println ( "00" ) ;
  }
  else if ( m >= 0.1 && m <= 5 ) {
    if ( m >= 1.0 ) {
      System . out . println ( Math . floor ( m * 10 ) ) ;
    }
    else {
      System . out . println ( "0" + Math . floor ( m * 10 ) ) ;
    }
  }
  else if ( m >= 6 && m <= 30 ) {
    System . out . println ( Math . floor ( m + 50 ) ) ;
  }
  else if ( m >= 35 && m <= 70 ) {
    System . out . println ( Math . floor ( ( m - 30 ) / 5 + 80 ) ) ;
  }
  else {
    System . out . println ( 89 ) ;
  }
  return m ;
}
