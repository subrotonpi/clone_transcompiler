public static int a , int b , int c , int d ;
int i ;
a = Integer . parseInt ( input . readLine ( ) ) ;
b = Integer . parseInt ( input . readLine ( ) ) ;
c = Integer . parseInt ( input . readLine ( ) ) ;
d = Integer . parseInt ( input . readLine ( ) ) ;
if ( a / b < c / d ) {
  System . out . println ( "TAKAHASHI" ) ;
}
else if ( a / b > c / d ) {
  System . out . println ( "AOKI" ) ;
}
else {
  System . out . println ( "DRAW" ) ;
}
return i ;
}
