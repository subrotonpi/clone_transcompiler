public static int initial = 735369 ;
int y = Integer . parseInt ( input ) ;
int m = Integer . parseInt ( input ) ;
int d = Integer . parseInt ( input ) ;
switch ( m ) {
  case 1 : m = 13 ;
  y -- ;
  break ;
  case 2 : m = 14 ;
  y -- ;
}
int days = 365 * y + y / 4 - y / 100 + y / 400 + 306 * ( m + 1 ) / 10 + d - 429 ;
return days ;
}
