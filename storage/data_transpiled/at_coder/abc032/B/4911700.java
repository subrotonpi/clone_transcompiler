public static void input ( ) {
  String s = input ( ) ;
  int k = Integer . parseInt ( input ( ) ) ;
  List < String > l = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) - k + 1 ;
  i ++ ) {
    l . add ( s . substring ( i , i + k ) ) ;
  }
  System . out . println ( new HashSet < String > ( l ) . size ( ) ) ;
}
