public static void input ( ) {
  s = input ( ) ;
  k = Integer . parseInt ( input ( ) ) ;
  List < String > l = new ArrayList < String > ( ) ;
  for ( int i = 1 ;
  i <= k ;
  i ++ ) {
    for ( int t = 0 ;
    t < s . length ( ) - i + 1 ;
    t ++ ) {
      l . add ( s . substring ( t , t + i ) ) ;
    }
  }
  System . out . println ( new TreeSet < String > ( l ) . get ( k - 1 ) ) ;
}
