public static int x , y ;
int x = Integer . parseInt ( input ) ;
int y = Integer . parseInt ( input ) ;
if ( x == 4 || x == 6 || x == 9 || y == 11 ) {
  System . out . println ( "Yes" ) ;
}
else if ( x == 1 || x == 3 || x == 5 || x == 7 || y == 8 || y == 10 || y == 12 ) {
  System . out . println ( "Yes" ) ;
}
else {
  System . out . println ( "No" ) ;
}
return x ;
}
