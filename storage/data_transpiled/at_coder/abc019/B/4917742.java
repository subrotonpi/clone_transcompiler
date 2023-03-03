public static String input ( ) {
  String s = input ( ) ;
  List < String > x = new LinkedList < String > ( ) ;
  int [ ] y = new int [ s . length ( ) ] ;
  x . add ( s . substring ( 0 , 1 ) ) ;
  y [ 0 ] = 1 ;
  int yk = 0 ;
  for ( int i = 1 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == s . charAt ( i - 1 ) ) {
      y [ yk ] ++ ;
    }
    else {
      x . add ( s . substring ( i ) ) ;
      yk ++ ;
      y [ yk ] ++ ;
    }
  }
  String ans = "" ;
  for ( int i = 0 ;
  i < x . size ( ) ;
  i ++ ) {
    ans += String . valueOf ( x . get ( i ) ) + String . valueOf ( y . get ( i ) ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
