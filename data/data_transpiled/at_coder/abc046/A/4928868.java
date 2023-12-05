public static int a , int b , int c ;
int i ;
i = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) ;
a = a + 1 ;
b = b + 1 ;
c = c + 1 ;
if ( a == b && b == c ) {
  System . out . println ( 1 ) ;
}
else if ( a == b || b == c || a == c ) {
  System . out . println ( 2 ) ;
}
else {
  System . out . println ( 3 ) ;
}
return i ;
}
