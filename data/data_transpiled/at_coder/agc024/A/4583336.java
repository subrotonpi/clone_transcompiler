public static int a , int b , final int k ;
int i ;
i = 0 ;
a = Integer . parseInt ( input . nextLine ( ) ) ;
b = Integer . parseInt ( input . nextLine ( ) ) ;
final int k = Integer . parseInt ( input . nextLine ( ) ) ;
if ( k % 2 != 0 ) {
  System . out . println ( b - a ) ;
}
else {
  System . out . println ( a - b ) ;
}
return i ;
}
