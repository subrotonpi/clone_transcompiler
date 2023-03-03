public static int A , int B , int C ;
boolean ApB = A + B == C ;
boolean AmB = A - B == C ;
if ( ApB && AmB ) {
  System . out . println ( "?" ) ;
}
else if ( ApB ) {
  System . out . println ( "+" ) ;
}
else if ( AmB ) {
  System . out . println ( "-" ) ;
}
else {
  System . out . println ( "!" ) ;
}
return A ;
}
