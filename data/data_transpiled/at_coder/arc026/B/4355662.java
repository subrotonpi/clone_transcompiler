public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  BitSet s = new BitSet ( 0 ) ;
  for ( int i = 1 ;
  i <= ( int ) ( n * .5 ) ;
  i ++ ) {
    if ( n % i < 1 ) s . set ( i ) ;
  }
  s . clear ( ) ;
}
