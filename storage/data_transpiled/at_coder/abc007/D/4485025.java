@ Parameters public static int [ ] whiteDigits ( ) {
  return new int [ ] {
    0 , 1 , 2 , 3 , 4 , 4 , 5 , 6 , 7 , 8 , 8 }
    ;
    /* count the number of digits */
    int n = 1 ;
    int c = 0 ;
    int d = 1 ;
    while ( n > 0 ) {
      int digit = n % 10 ;
      c *= whiteDigits [ digit + 1 ] - whiteDigits [ digit ] ;
    }
    return c ;
  }
  