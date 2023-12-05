public static int a , b ;
a = Integer . parseInt ( input . readLine ( ) ) ;
b = Integer . parseInt ( input . readLine ( ) ) ;
if ( ( a > b ) && ( a < b ) ) {
  System . out . println ( "GREATER" ) ;
}
else if ( ( a < b ) && ( b < a ) ) {
  System . out . println ( "LESS" ) ;
}
else {
  System . out . println ( "EQUAL" ) ;
}
return a ;
}
