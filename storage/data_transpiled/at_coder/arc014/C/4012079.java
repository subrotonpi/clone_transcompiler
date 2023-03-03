public static int N = Integer . parseInt ( input ) {
  String S = input . nextLine ( ) ;
  StringBuffer res = new StringBuffer ( ) ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    String s = S . substring ( i , i + 1 ) ;
    if ( res . length ( ) == 0 ) {
      res . append ( s ) ;
    }
    else if ( res . length ( ) == 1 ) {
      res . append ( s ) ;
    }
    else {
      res . append ( s ) ;
    }
  }
  System . out . println ( res . length ( ) ) ;
  return N ;
}
