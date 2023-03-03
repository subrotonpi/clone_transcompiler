public static int A , int B , int C , int D ;
int i ;
i = Integer . parseInt ( input . nextLine ( ) ) ;
if ( B / A > D / C ) {
  System . out . println ( "TAKAHASHI" ) ;
}
else if ( D / C > B / A ) {
  System . out . println ( "AOKI" ) ;
}
else {
  System . out . println ( "DRAW" ) ;
}
return i ;
}
