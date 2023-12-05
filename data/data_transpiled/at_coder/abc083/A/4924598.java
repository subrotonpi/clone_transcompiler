public static int a , int b , int c , int d ;
int l ;
int r ;
int a = Integer . parseInt ( input . readLine ( ) ) ;
a = Integer . parseInt ( input . readLine ( ) ) ;
b = Integer . parseInt ( input . readLine ( ) ) ;
c = Integer . parseInt ( input . readLine ( ) ) ;
d = Integer . parseInt ( input . readLine ( ) ) ;
l = a + b ;
r = c + d ;
if ( l > r ) {
  System . out . println ( "Left" ) ;
}
else if ( l == r ) {
  System . out . println ( "Balanced" ) ;
}
else {
  System . out . println ( "Right" ) ;
}
return l ;
}
