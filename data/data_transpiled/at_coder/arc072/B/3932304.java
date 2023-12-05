public static int x , y ;
x = Integer . parseInt ( input . readLine ( ) ) ;
y = Integer . parseInt ( input . readLine ( ) ) ;
if ( Math . abs ( x - y ) >= 2 ) {
  System . out . println ( "Alice" ) ;
}
else {
  System . out . println ( "Brown" ) ;
}
return x ;
}
