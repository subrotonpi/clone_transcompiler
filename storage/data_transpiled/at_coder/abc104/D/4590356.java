public static void input ( Scanner in ) {
  String S = in . nextLine ( ) ;
  int [ ] [ ] dp = new int [ 4 ] [ S . length ( ) ] ;
  dp [ 0 ] [ 0 ] = 0 ;
  dp [ 1 ] [ 0 ] = 1 ;
  String nextStr [ ] = {
    "A" , "B" , "C" }
    ;
    int MOD = 10 * 9 + 7 ;
    for ( int i = 0 ;
    i < S . length ( ) ;
    i ++ ) {
      String s = in . nextLine ( ) ;
      int len = S . length ( ) - i - 1 ;
      for ( int j = 0 ;
      j < 4 ;
      j ++ ) {
        if ( j == 3 ) {
          if ( s . equals ( "?" ) ) {
            dp [ i ] [ j ] = ( 3 * dp [ i + 1 ] [ j ] ) % MOD ;
          }
          else {
            dp [ i ] [ j ] = dp [ i + 1 ] [ j ] ;
          }
        }
      }
    }
    System . out . println ( dp [ 0 ] [ 0 ] ) ;
  }
  