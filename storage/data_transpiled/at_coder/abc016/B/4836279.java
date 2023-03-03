public static int A , int B , int C ;
int p = Integer . parseInt ( input . nextLine ( ) ) ;
int m = A - B ;
if ( C == p == m ) {
  System . out . println ( "?" ) ;
}
else if ( C != p && C != m ) {
  System . out . println ( "!" ) ;
}
else if ( C == p ) {
  System . out . println ( "+" ) ;
}
else if ( C == m ) {
  System . out . println ( "-" ) ;
}
return p ;
}
