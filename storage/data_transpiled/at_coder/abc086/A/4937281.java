public static int matmul ( int a , int b ) {
  int c = a * b ;
  return c ;
}
int a = Integer . parseInt ( input . nextLine ( ) ) ;
int b = Integer . parseInt ( input . nextLine ( ) ) ;
c = matmul ( a , b ) ;
if ( c % 2 == 0 ) {
  System . out . println ( "Even" ) ;
}
else {
  System . out . println ( "Odd" ) ;
}
return c ;
}
