static final String getInput ( ) {
  final int [ ] abcd = new int [ 4 ] ;
  for ( int i = 0 ;
  i < abcd . length ;
  i ++ ) {
    abcd [ i ] = Integer . parseInt ( String . valueOf ( i ) ) ;
  }
  final char [ ] op = {
    '+' , '-' }
    ;
    for ( char i : op ) {
      for ( char j : op ) {
        for ( char k : op ) {
          int result = abcd [ 0 ] ;
          if ( i == '+' ) {
            result += abcd [ 1 ] ;
          }
          else {
            result -= abcd [ 1 ] ;
          }
          if ( j == '+' ) {
            result += abcd [ 2 ] ;
          }
          else {
            result -= abcd [ 2 ] ;
          }
          if ( k == '+' ) {
            result += abcd [ 3 ] ;
          }
          else {
            result -= abcd [ 3 ] ;
          }
          if ( result == 7 ) {
            System . out . print ( abcd [ 0 ] ) ;
            System . out . print ( i ) ;
            System . out . print ( j ) ;
            System . out . print ( k ) ;
            System . out . print ( "=7" ) ;
            System . exit ( 0 ) ;
          }
        }
      }
    }
    return null ;
  }
  