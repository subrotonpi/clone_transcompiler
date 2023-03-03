public static int A , int B , int C , int D ;
int i ;
i = Integer . parseInt ( input . nextLine ( ) ) ;
if ( B / A > D / C ) {
  System . out . println ( "TAKAHASHI" ) ;
}
else if ( B / A == D / C ) {
  System . out . println ( "DRAW" ) ;
}
else {
  System . out . println ( "AOKI" ) ;
}
return i ;
}
