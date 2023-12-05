public static int yy = Integer . parseInt ( input ) ;
int mm = Integer . parseInt ( input ) ;
int dd = Integer . parseInt ( input ) ;
int y = 2014 ;
int m = 5 ;
int d = 17 ;
int day1 = 365 * y + y / 4 - y / 100 + y / 400 + 306 * ( m + 1 ) / 10 + d - 429 ;
if ( mm == 1 || mm == 2 ) {
  mm += 12 ;
  yy -- ;
}
int day2 = 365 * yy + yy / 4 - yy / 100 + yy / 400 + 306 * ( mm + 1 ) / 10 + dd - 429 ;
return yy ;
}
