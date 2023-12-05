public static void print ( String s ) {
  s = list ( input ( ) ) ;
  String str = "" ;
  for ( String s : s ) {
    if ( s . length ( ) != 0 ) {
      str += s . charAt ( 0 ) ;
    }
    else {
      str = str . substring ( 0 , str . length ( ) - 1 ) ;
    }
  }
  System . out . println ( str ) ;
}
