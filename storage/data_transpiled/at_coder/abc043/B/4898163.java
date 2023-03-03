static void print ( String s ) {
  s = list ( input ( ) ) ;
  String t = "" ;
  for ( String s_ : s ) {
    if ( s_ != "B" ) {
      t += s_ ;
    }
    else {
      t = t . substring ( 0 , t . length ( ) - 1 ) ;
    }
  }
  System . out . println ( t ) ;
}
