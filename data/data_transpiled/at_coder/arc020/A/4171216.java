public static void print ( int a , int b ) {
  if ( Math . abs ( a ) < Math . abs ( b ) ) {
    System . out . println ( "Ant" ) ;
  }
  else if ( Math . abs ( a ) > Math . abs ( b ) ) {
    System . out . println ( "Bug" ) ;
  }
  else {
    System . out . println ( "Draw" ) ;
  }
}
