@ MoreObjects . requireNonNull ( "Input" ) public static void main ( String [ ] args ) {
  final List < String > s = Lists . newArrayList ( ) ;
  for ( String s : input ) {
    s . add ( s . substring ( 0 , s . length ( ) - 1 ) ) ;
  }
  int maxS = 0 ;
  int from = 0 ;
  int to = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == 'A' ) {
      from = i ;
      break ;
    }
  }
  s = s . toArray ( new String [ s . size ( ) ] ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == 'Z' ) {
      to = i ;
      break ;
    }
  }
  System . out . println ( ( s . size ( ) - to ) - from ) ;
}
