public static int x , int y , int z ;
int i ;
i = Integer . parseInt ( input . nextLine ( ) ) ;
if ( z - y <= 0 ) {
  System . out . println ( "delicious" ) ;
}
else if ( z - y <= x ) {
  System . out . println ( "safe" ) ;
}
else {
  System . out . println ( "dangerous" ) ;
}
return i ;
}
