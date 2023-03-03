public static String input ( ) {
  Map mp = new HashMap ( ) ;
  mp . put ( 'O' , '0' ) ;
  mp . put ( 'D' , '0' ) ;
  mp . put ( 'I' , '1' ) ;
  mp . put ( 'Z' , '2' ) ;
  mp . put ( 'S' , '5' ) ;
  mp . put ( 'B' , '8' ) ;
  for ( Map . Entry j : mp . entrySet ( ) ) {
    S = S . replace ( j . getKey ( ) , j . getValue ( ) ) ;
  }
  System . out . println ( S ) ;
  return S ;
}
