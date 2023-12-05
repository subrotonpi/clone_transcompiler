public static int [ ] solve ( ) {
  int A , B = map ( Integer . parseInt , input ( ) . split ( ) ) ;
  return new int [ ] {
    "Possible" , "Impossible" }
    [ bool ( A * B * ( A + B ) % 3 ) ] ;
  }
  