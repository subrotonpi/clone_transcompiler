public static void print ( String N ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  String binN = format ( N , "b" ) . replaceAll ( " " , "" ) ;
  int mod = 7 + 10 * 9 ;
  int [ ] [ ] DP = new int [ 60 ] [ 3 ] ;
  for ( int i = 0 ;
  i < 60 ;
  i ++ ) {
    DP [ i ] [ 0 ] = 0 ;
    DP [ i ] [ 1 ] = 0 ;
    DP [ i ] [ 2 ] = 1 ;
  }
  for ( int i = 1 ;
  i < 60 ;
  i ++ ) {
    if ( binN . charAt ( i ) == '0' ) {
      DP [ i ] [ 0 ] = ( DP [ i - 1 ] [ 0 ] + DP [ i - 1 ] [ 1 ] ) % mod ;
      DP [ i ] [ 1 ] = DP [ i - 1 ] [ 1 ] ;
      DP [ i ] [ 2 ] = ( DP [ i - 1 ] [ 2 ] * 3 + DP [ i - 1 ] [ 1 ] * 2 ) % mod ;
    }
    else {
      DP [ i ] [ 0 ] = DP [ i - 1 ] [ 0 ] ;
      DP [ i ] [ 1 ] = ( DP [ i - 1 ] [ 0 ] + DP [ i - 1 ] [ 1 ] ) % mod ;
      DP [ i ] [ 2 ] = ( DP [ i - 1 ] [ 2 ] * 3 + DP [ i - 1 ] [ 1 ] * 2 ) % mod ;
    }
  }
  System . out . println ( Arrays . toString ( DP ) % mod ) ;
}
