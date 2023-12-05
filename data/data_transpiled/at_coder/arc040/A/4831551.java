public static void print ( String s ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int R = 0 ;
  int B = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    Scanner scanner = new Scanner ( s ) ;
    R += scanner . nextInt ( ) ;
    B += scanner . nextInt ( ) ;
  }
  if ( R > B ) {
    System . out . println ( "TAKAHASHI" ) ;
  }
  else if ( R == B ) {
    System . out . println ( "DRAW" ) ;
  }
  else {
    System . out . println ( "AOKI" ) ;
  }
}
