public static int N = Integer . parseInt ( input ) {
  String C = input . nextLine ( ) ;
  String [ ] BUT = {
    "A" , "B" , "X" , "Y" }
    ;
    String [ ] SHORT = new String [ 4 ] ;
    for ( int i = 0 ;
    i < 4 ;
    i ++ ) {
      for ( int j = 0 ;
      j < 4 ;
      j ++ ) {
        SHORT [ i ] = BUT [ i ] + BUT [ j ] ;
      }
    }
    int ans = 0 ;
    for ( int i = 0 ;
    i < SHORT . length ;
    i ++ ) {
      for ( int j = 0 ;
      j < SHORT . length ;
      j ++ ) {
        String S = C . replace ( SHORT [ i ] , "L" ) ;
        S = S . replace ( SHORT [ j ] , "L" ) ;
        if ( ans < S . indexOf ( "L" ) ) {
          ans = S . indexOf ( "L" ) ;
        }
      }
    }
    System . out . println ( N - ans ) ;
    return ans ;
  }
  