public static void main ( String [ ] args ) {
  String s = input . nextLine ( ) . trim ( ) ;
  if ( s . length ( ) == 2 ) {
    return ( s . charAt ( 0 ) == s . charAt ( 1 ) ) ? "1 2" : "-1 -1" ;
  }
  for ( int i = 0 ;
  i < s . length ( ) - 2 ;
  i ++ ) {
    if ( new HashSet < > ( Arrays . asList ( s . substring ( i , i + 3 ) ) ) . size ( ) <= 2 ) {
      return new HashSet < > ( Arrays . asList ( s . substring ( i + 1 , i + 3 ) ) ) ;
    }
  }
  return "-1 -1" ;
}
