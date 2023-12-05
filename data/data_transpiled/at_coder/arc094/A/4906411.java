public static int A , int B , int C ;
int M ;
M = Math . max ( A , B ) ;
M = Math . max ( B , C ) ;
if ( ( 3 * M ) % 2 == ( A + B + C ) % 2 ) {
  System . out . println ( ( 3 * M - A - B - C ) / 2 ) ;
}
else {
  System . out . println ( ( 3 * ( M + 1 ) - A - B - C ) / 2 ) ;
}
return M ;
}
