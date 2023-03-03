public static int a , int b , String a , String b ;
a = Integer . parseInt ( input . nextLine ( ) ) ;
b = Integer . parseInt ( input . nextLine ( ) ) ;
if ( a == b ) {
  System . out . println ( "Draw" ) ;
}
else if ( a == 1 ) {
  System . out . println ( "Alice" ) ;
}
else if ( b == 1 ) {
  System . out . println ( "Bob" ) ;
}
else {
  System . out . println ( a < b ? "Bob" : "Alice" ) ;
}
return a ;
}
