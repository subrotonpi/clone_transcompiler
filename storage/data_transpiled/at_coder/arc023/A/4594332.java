public static int y = Integer . parseInt ( input ) ;
int m = Integer . parseInt ( input ) ;
int d = Integer . parseInt ( input ) ;
if ( m < 3 ) {
  y -- ;
  m += 12 ;
}
/* 365*y+y/4-y/100+y/400+(306*(m+1))/10+d-429 */
return y ;
}
