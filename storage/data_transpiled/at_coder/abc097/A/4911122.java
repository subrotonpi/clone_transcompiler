public static int a , int b , int c , int d ;
int a = Integer . parseInt ( input . readLine ( ) ) ;
int b = Integer . parseInt ( input . readLine ( ) ) ;
int c = Integer . parseInt ( input . readLine ( ) ) ;
int d = Integer . parseInt ( input . readLine ( ) ) ;
if ( ( Math . abs ( c - a ) <= d ) && ( Math . abs ( b - a ) <= d ) && ( Math . abs ( c - b ) <= d ) ) {
  System . out . println ( "Yes" ) ;
}
else if ( ( Math . abs ( b - a ) <= d ) && ( Math . abs ( c - b ) <= d ) ) {
  System . out . println ( "Yes" ) ;
}
else {
  System . out . println ( "No" ) ;
}
return a ;
}
