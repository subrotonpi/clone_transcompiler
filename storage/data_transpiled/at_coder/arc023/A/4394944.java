public static int y = Integer . parseInt ( input ) ;
int m = Integer . parseInt ( input ) ;
int d = Integer . parseInt ( input ) ;
if ( m == 1 ) {
  m = 13 ;
  y = y - 1 ;
}
if ( m == 2 ) {
  m = 14 ;
  y = y - 1 ;
}
int day1 = 365 * y + ( int ) ( y / 4 ) - ( int ) ( y / 100 ) + ( int ) ( y / 400 ) + ( int ) ( 306 * ( m + 1 ) / 10 ) + d - 429 ;
return day2 - day1 ;
}
