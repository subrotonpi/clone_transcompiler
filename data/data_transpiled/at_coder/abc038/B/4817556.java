public static int h1 ( int h1 , int w1 ) {
  int h2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int w2 = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( h1 == h2 || h1 == w2 || w1 == h2 || w1 == w2 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return h1 ;
}
