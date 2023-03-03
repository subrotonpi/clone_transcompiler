public static void input ( ) {
  String x = input ( ) ;
  s = list ( input ( ) ) ;
  List < String > l = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) != x ) {
      l . add ( s . charAt ( i ) ) ;
    }
  }
  System . out . println ( l . toString ( ) ) ;
}
