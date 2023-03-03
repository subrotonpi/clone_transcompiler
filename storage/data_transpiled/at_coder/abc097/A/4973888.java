public static int a , int b , int c , int d ;
int i ;
a = Integer . parseInt ( input . readLine ( ) ) ;
b = Integer . parseInt ( input . readLine ( ) ) ;
c = Integer . parseInt ( input . readLine ( ) ) ;
d = Integer . parseInt ( input . readLine ( ) ) ;
if ( Math . abs ( a - c ) <= d || ( Math . abs ( a - b ) <= d && Math . abs ( b - c ) <= d ) ) {
  System . out . println ( "Yes" ) ;
}
else {
  System . out . println ( "No" ) ;
}
return i ;
}
