@ VisibleForTesting static int from ( String input ) {
  int n = Integer . parseInt ( input ) ;
  String s = Lists . newArrayList ( String . valueOf ( input ) ) ;
  int [ ] lis = new int [ 3 ] ;
  String [ ] li = {
    "R" , "G" , "B" }
    ;
    for ( int i = 0 ;
    i < 3 ;
    i ++ ) {
      lis [ i ] = ( s . indexOf ( li [ i ] ) ) % 2 ;
    }
    return n ;
  }
  