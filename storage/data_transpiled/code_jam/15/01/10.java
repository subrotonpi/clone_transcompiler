static final int solve ( String string ) throws IOException {
  final int s = 0 ;
  int t = 0 ;
  for ( int i = 0 ;
  i < string . length ( ) ;
  i ++ ) {
    t = t + 1 - Integer . parseInt ( string . substring ( i , i + 1 ) ) ;
    s = Math . max ( s , t ) ;
  }
  return ( s ) ;
}
