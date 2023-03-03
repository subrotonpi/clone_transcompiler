public static void input ( ) {
  a = input . nextInt ( ) ;
  b = new int [ 26 ] ;
  for ( char c : a ) {
    b [ ( c - 97 ) ] ++ ;
  }
  for ( int i : b ) {
    if ( i >= 2 ) {
      System . out . println ( "no" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "yes" ) ;
}
