public static void input ( String s ) {
  int K = Integer . parseInt ( input ( ) ) ;
  Set < String > S = new HashSet < > ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    S . add ( s . charAt ( i ) ) ;
    S . add ( s . substring ( i , i + 2 ) ) ;
    S . add ( s . substring ( i , i + 3 ) ) ;
  }
  Arrays . sort ( S ) ;
  System . out . println ( S . get ( K - 1 ) ) ;
}
