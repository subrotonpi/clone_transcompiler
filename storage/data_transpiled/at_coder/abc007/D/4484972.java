@ Parameters public static int [ ] whiteDigits ( ) {
  return new int [ ] {
    0 , 1 , 2 , 3 , 4 , 4 , 5 , 6 , 7 , 8 , 8 }
    ;
    /* count n */
    int c = 0 ;
    int flow = 1 ;
    for ( int digit : map ( String . valueOf ( n + 1 ) ) ) {
      c *= whiteDigits [ 10 ] ;
      c += whiteDigits [ digit ] * flow ;
      flow = ( whiteDigits [ digit + 1 ] - whiteDigits [ digit ] ) ;
    }
    return c ;
  }
  