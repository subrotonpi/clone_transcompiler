public static void main ( String N ) {
  if ( N . substring ( 0 , 3 ) . indexOf ( N . substring ( 0 , 3 ) ) == 3 || N . substring ( 1 , 4 ) . indexOf ( N . substring ( 1 , 4 ) ) == 3 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
