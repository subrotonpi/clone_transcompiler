@ Nullable public static double minBribe ( int start , int end ) {
  if ( ( ( start = Integer . parseInt ( input ) ) >= end ) && ( ( end = Integer . parseInt ( input ) ) >= start ) ) {
    return mem . get ( new Integer ( start ) ) ;
  }
  double min = P * Q ;
  if ( start + 1 >= end ) {
    min = 0 ;
  }
  else {
    for ( int c = start + 1 ;
    c < end ;
    c ++ ) {
      double bribe = ( cells [ end ] - cells [ start ] - 2 ) + minBribe ( start , c ) + minBribe ( c , end ) ;
      if ( bribe < min ) {
        min = bribe ;
      }
    }
  }
  mem . put ( new Integer ( start ) , min ) ;
  return min ;
}
String s = scanner . nextLine ( ) ;
int cases = Integer . parseInt ( s ) ;
for ( int testCase = 0 ;
testCase < cases ;
testCase ++ ) {
  s = scanner . nextLine ( ) ;
  String [ ] n = s . split ( "\\s+" ) ;
  P = Integer . parseInt ( n [ 0 ] ) ;
  Q = Integer . parseInt ( n [ 1 ] ) ;
  s = scanner . nextLine ( ) ;
  n = s . split ( "\\s+" ) ;
  cells = new int [ 2 ] ;
  cells [ 0 ] = Integer . parseInt ( n [ 0 ] ) ;
  cells [ 1 ] = P + 1 ;
  mem . clear ( ) ;
  System . out . println ( "Case #" + ( testCase + 1 ) + ": " + minBribe ( 0 , cells . length - 1 ) ) ;
}
