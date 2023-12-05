public static int a , int b , int c ;
int a = Integer . parseInt ( input . nextLine ( ) ) ;
int b = Integer . parseInt ( input . nextLine ( ) ) ;
int c = Integer . parseInt ( input . nextLine ( ) ) ;
if ( a == b == c ) {
  System . out . println ( 1 ) ;
}
else if ( a == b || a == c || b == c ) {
  System . out . println ( 2 ) ;
}
else {
  System . out . println ( 3 ) ;
}
return a ;
}
