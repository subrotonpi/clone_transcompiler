public static int x , y ;
x = Integer . parseInt ( input . nextLine ( ) ) ;
y = Integer . parseInt ( input . nextLine ( ) ) ;
if ( Math . abs ( x - y ) <= 1 ) {
  System . out . println ( "Brown" ) ;
}
else {
  System . out . println ( "Alice" ) ;
}
return x ;
}
