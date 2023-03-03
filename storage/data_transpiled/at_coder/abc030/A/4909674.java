public static int A , int B , int C , int D ;
int TWin = Integer . parseInt ( input . nextLine ( ) ) ;
int AWin = Integer . parseInt ( input . nextLine ( ) ) ;
if ( TWin > AWin ) {
  System . out . println ( "TAKAHASHI" ) ;
}
else if ( TWin < AWin ) {
  System . out . println ( "AOKI" ) ;
}
else {
  System . out . println ( "DRAW" ) ;
}
return TWin ;
}
