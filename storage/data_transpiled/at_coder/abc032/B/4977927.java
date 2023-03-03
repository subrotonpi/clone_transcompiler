public static void input ( ) {
  int k = Integer . parseInt ( input ( ) ) ;
  List list = new ArrayList ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) - k + 1 ;
  i ++ ) {
    list . add ( s . substring ( i , i + k ) ) ;
  }
  System . out . println ( new HashSet ( list ) . size ( ) ) ;
}
