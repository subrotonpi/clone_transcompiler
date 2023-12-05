static final int getMonth ( ) {
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int d = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = 365 * 2014 + Math . floor ( 2014 / 4 ) - Math . floor ( 2014 / 100 ) + Math . floor ( 2014 / 400 ) + Math . floor ( 306 * 6 / 10 ) + 17 - 429 ;
  int B ;
  if ( m == 1 || m == 2 ) {
    y -- ;
    m += 12 ;
    B = 365 * y + Math . floor ( y / 4 ) - Math . floor ( y / 100 ) + Math . floor ( y / 400 ) + Math . floor ( 306 * ( m + 1 ) / 10 ) + d - 429 ;
  }
  else {
    B = 365 * y + Math . floor ( y / 4 ) - Math . floor ( y / 100 ) + Math . floor ( y / 400 ) + Math . floor ( 306 * ( m + 1 ) / 10 ) + d - 429 ;
  }
  System . out . println ( A - B ) ;
  return y ;
}
