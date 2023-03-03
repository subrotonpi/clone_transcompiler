public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  if ( n == 3 ) {
    System . out . println ( "2 5 63" ) ;
  }
  else if ( n == 4 ) {
    System . out . println ( "2 5 20 63" ) ;
  }
  else if ( n == 5 ) {
    System . out . println ( "3 4 6 8 9" ) ;
  }
  else if ( n == 6 ) {
    System . out . println ( "2 3 4 8 9 10" ) ;
  }
  else if ( n == 7 ) {
    System . out . println ( "2 3 4 6 8 9 10" ) ;
  }
  else {
    int [ ] ans = new int [ n / 8 ] ;
    for ( int i = 0 ;
    i < n / 8 ;
    i ++ ) {
      ans [ i ] = 12 * i + 2 ;
      ans [ i ] = 12 * i + 3 ;
      ans [ i ] = 12 * i + 4 ;
      ans [ i ] = 12 * i + 6 ;
      ans [ i ] = 12 * i + 8 ;
      ans [ i ] = 12 * i + 9 ;
      ans [ i ] = 12 * i + 10 ;
    }
    switch ( n % 8 ) {
      case 1 : ans [ n / 8 ] = ans [ n / 8 ] + 6 ;
      break ;
      case 2 : ans [ n / 8 ] = ans [ n / 8 ] + 4 ;
      break ;
      case 3 : ans [ n / 8 ] = ans [ n / 8 ] + 6 ;
      break ;
      case 4 : ans [ n / 8 ] = ans [ n / 8 ] + 2 ;
      break ;
      case 5 : ans [ n / 8 ] = ans [ n / 8 ] + 4 ;
      break ;
      case 6 : ans [ n / 8 ] = ans [ n / 8 ] + 9 ;
      break ;
      case 7 : ans [ n / 8 ] = ans [ n / 8 ] + 2 ;
      break ;
      case 8 : ans [ n / 8 ] = ans [ n / 8 ] + 3 ;
      break ;
    }
    System . out . println ( Arrays . toString ( ans ) ) ;
  }
}
