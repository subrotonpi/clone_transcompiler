public static int N = Integer . parseInt ( input ) {
  List < String > S = Collections . nCopies ( N , "" ) ;
  int kind = new HashSet < > ( S ) . size ( ) ;
  switch ( kind ) {
    case 3 : System . out . println ( "Three" ) ;
    break ;
    case 4 : System . out . println ( "Four" ) ;
    break ;
  }
  return S . get ( 0 ) . length ( ) ;
}
