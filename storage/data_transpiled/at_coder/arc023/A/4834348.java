public static int y = Integer . parseInt ( input ) ;
int m = Integer . parseInt ( input ) ;
int d = Integer . parseInt ( input ) ;
if ( m == 1 ) {
  y -- ;
  m = 13 ;
}
else if ( m == 2 ) {
  y -- ;
  m = 14 ;
}
int days = 365 * y + y / 4 - y / 100 + y / 400 + 306 * ( m + 1 ) / 10 + d - 429 ;
return days ;
}
