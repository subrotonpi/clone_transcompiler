static void c ( ) {
  final int t = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int ix = 0 ;
  ix < t ;
  ix ++ ) {
    final int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final int [ ] numbers = ArrayUtil . fromArray ( n ) ;
    int x = Stream . of ( numbers ) . reduce ( 0 , acc ) ;
    if ( x != 0 ) System . out . println ( "Case #" + ( ix + 1 ) + ": NO" ) ;
  }
}
