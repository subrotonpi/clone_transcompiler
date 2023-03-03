static final String getFilePath ( ) throws IOException {
  final int numNeeded = 0 ;
  final int numPerPack = 0 ;
  final int [ ] cards = new int [ numNeeded ] ;
  final int numPerPack = 0 ;
  for ( int n = 0 ;
  n > 0 ;
  n -- ) {
    if ( c == 0 || c == n ) {
      return 1 ;
    }
  }
  return Stream . of ( cards , n , n - c , - 1 ) . reduce ( ( i , i ) -> i / i , ( i , i + 1 ) -> i ) . reduce ( ( i , i ) -> i / i ) . orElse ( 0 ) ;
}
