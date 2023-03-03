static final private int F ( String s ) {
  int re = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) re += ( ( s . charAt ( i ) - '0' ) << i ) ;
  return re ;
}
