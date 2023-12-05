public static int x , int y ;
int x = Integer . parseInt ( input . nextLine ( ) ) ;
int y = Integer . parseInt ( input . nextLine ( ) ) ;
if ( Math . abs ( x - y ) < 2 ) {
  System . out . println ( "Brown" ) ;
}
else {
  System . out . println ( "Alice" ) ;
}
return x ;
}
