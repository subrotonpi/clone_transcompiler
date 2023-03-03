public static int a = Integer . parseInt ( input ) ;
int b = Integer . parseInt ( input ) ;
if ( a % b == 0 ) {
  System . out . println ( 0 ) ;
}
else {
  System . out . println ( b - ( a % b ) ) ;
}
return b ;
}
