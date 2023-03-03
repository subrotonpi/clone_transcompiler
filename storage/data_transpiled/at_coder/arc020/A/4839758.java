public static int a , int b ;
a = Integer . parseInt ( input . readLine ( ) ) ;
b = Integer . parseInt ( input . readLine ( ) ) ;
a = Math . abs ( a ) ;
b = Math . abs ( b ) ;
if ( a > b ) {
  System . out . println ( "Bug" ) ;
}
else if ( a < b ) {
  System . out . println ( "Ant" ) ;
}
else {
  System . out . println ( "Draw" ) ;
}
return a ;
}
