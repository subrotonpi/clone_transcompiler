public static int x , y ;
int x = Integer . parseInt ( input ) ;
int y = Integer . parseInt ( input ) ;
if ( ( 0 <= x ) && ( x < y ) || ( x < y ) && ( y <= 0 ) ) {
  System . out . println ( Math . abs ( x - y ) ) ;
}
else if ( ( 0 < y ) && ( y < x ) || ( y < x ) && ( x < y ) ) {
  System . out . println ( Math . abs ( x - y ) + 2 ) ;
}
else {
  System . out . println ( Math . abs ( Math . abs ( x ) - Math . abs ( y ) ) + 1 ) ;
}
return x ;
}
