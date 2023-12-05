static final Scanner scanner = new Scanner ( System . in ) {
  @ Override public String nextLine ( ) {
    final int t = Integer . parseInt ( nextLine ( ) ) ;
    for ( int i = 0 ;
    i < t ;
    i ++ ) {
      final int [ ] line = ArrayUtil . split ( nextLine ( ) . split ( " " ) ) ;
      final int n = line [ 0 ] ;
      final int [ ] s = line [ 1 ] ;
      final int x = Ints . fromArray ( s ) ;
      final double r = ( double ) x * 2 / n ;
      System . out . println ( "Case #" + ( i + 1 ) + ":" + "," ) ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        for ( int y = 0 ;
        y < x + 1 ;
        y ++ ) {
          final int sum1 = Ints . fromArray ( s ) . get ( Math . max ( 0 , s [ j ] + y - x ) ) ;
          if ( ( sum1 >= x ) && ( y > 0 ) ) {
            int nums = 1 ;
            if ( ( ( sum1 > x ) && ( y > 0 ) ) ) {
              nums = Stream . of ( s ) . filter ( x -> ( s [ j ] + y > x ) ) . count ( ) ;
            }
            System . out . println ( String . valueOf ( Math . max ( 0 , ( ( double ) y - ( ( double ) sum1 - x ) / nums ) * 100 / x ) ) ) ;
            break ;
          }
        }
      }
    }
    System . out . println ( "" ) ;
  }
}
