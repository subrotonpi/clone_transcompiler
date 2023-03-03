public static int a , int b , int x ;
int a = Integer . parseInt ( input . nextLine ( ) ) ;
int b = Integer . parseInt ( input . nextLine ( ) ) ;
int x = Integer . parseInt ( input . nextLine ( ) ) ;
if ( a % x == 0 ) {
  System . out . println ( b / x - a / x + 1 ) ;
}
else {
  System . out . println ( b / x - a / x ) ;
}
return b ;
}
