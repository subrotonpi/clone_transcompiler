public static void input ( ) {
  String s = input ( ) ;
  int k = Integer . parseInt ( input ( ) ) ;
  char [ ] c = new char [ k ] ;
  Set < String > c_set = new HashSet < String > ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) - 1 ;
  i ++ ) {
    if ( s . substring ( i , i + k ) . length ( ) == k ) {
      c_set . add ( s . substring ( i , i + k ) ) ;
    }
  }
  System . out . println ( c_set . size ( ) ) ;
}
