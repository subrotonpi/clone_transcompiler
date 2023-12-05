static String compute ( String S ) {
  if ( S . isEmpty ( ) ) {
    return "" ;
  }
  int x = max ( S ) ;
  int p = S . indexOf ( x ) ;
  String y = compute ( S . substring ( 0 , p ) ) ;
  String z = Stream . of ( S . substring ( p ) ) . filter ( c -> c != x ) . collect ( Collectors . joining ( ) ) ;
  return ( x * ( S . length ( ) - p - z . length ( ) ) ) + y + z ;
}
