public static int a , int b , int c , int k ;
int i ;
a = Integer . parseInt ( input . readLine ( ) ) ;
b = Integer . parseInt ( input . readLine ( ) ) ;
c = Integer . parseInt ( input . readLine ( ) ) ;
k = Integer . parseInt ( input . readLine ( ) ) ;
if ( Math . abs ( a - b ) > 1000000000000000000 ) {
  System . out . println ( "Unfair" ) ;
}
else if ( k % 2 == 0 ) {
  System . out . println ( a - b ) ;
}
else {
  System . out . println ( b - a ) ;
}
return i ;
}
