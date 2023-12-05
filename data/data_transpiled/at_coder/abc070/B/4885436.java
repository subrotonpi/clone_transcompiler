public static int a , int b , int c , int d ;
int time ;
time = Math . min ( b , d ) - Math . max ( a , c ) ;
if ( time >= 0 ) {
  System . out . println ( time ) ;
}
else {
  System . out . println ( "0" ) ;
}
return time ;
}
