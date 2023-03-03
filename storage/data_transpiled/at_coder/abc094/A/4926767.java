public static int a , int b , int x ;
int a = Integer . parseInt ( input . nextLine ( ) ) ;
int b = Integer . parseInt ( input . nextLine ( ) ) ;
int x = Integer . parseInt ( input . nextLine ( ) ) ;
if ( ( a > x ) || ( a + b < x ) ) {
  System . out . println ( "NO" ) ;
}
else {
  System . out . println ( "YES" ) ;
}
return a ;
}
