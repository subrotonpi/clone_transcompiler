public static List < Integer > A = list ( map ( input -> Integer . parseInt ( input . nextLine ( ) ) ) ) ;
List < Integer > x = new ArrayList < > ( A ) ;
Collections . sort ( x ) ;
if ( x . get ( 0 ) + x . get ( 1 ) == x . get ( 2 ) ) {
  System . out . println ( "Yes" ) ;
}
else {
  System . out . println ( "No" ) ;
}
return x ;
}
