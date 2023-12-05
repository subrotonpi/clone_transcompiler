@ GwtIncompatible ( "java.util.Scanner" ) private static void main ( final String [ ] args ) {
  final double INF = Double . MAX_VALUE ;
  System . setProperty ( "java.awt.headless" , "true" ) ;
  final double [ ] dy = {
    0 , - 1 , 0 , 1 }
    ;
    final double [ ] dx = {
      1 , 0 , - 1 , 0 }
      ;
      final int N = Integer . parseInt ( input ( args [ 0 ] ) ) ;
      int ans = 0 ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        final int X = Integer . parseInt ( input ( args [ i ] ) ) ;
        final int Y = Integer . parseInt ( input ( args [ i ] ) ) ;
        final int Z = Integer . parseInt ( input ( args [ i ] ) ) ;
        final int M = Integer . parseInt ( input ( args [ i + 1 ] ) ) ;
        int a = X , b = X , c = Y , d = Y , e = Z , f = Z ;
        for ( int j = 0 ;
        j < M ;
        j ++ ) {
          final int x = Integer . parseInt ( input ( args [ j ] ) ) ;
          final int y = Integer . parseInt ( input ( args [ j + 1 ] ) ) ;
          final int z = Integer . parseInt ( input ( args [ j + 1 ] ) ) ;
          a = Math . min ( a , x ) ;
          b = Math . min ( b , X - x - 1 ) ;
          c = Math . min ( c , y ) ;
          d = Math . min ( d , Y - y - 1 ) ;
          e = Math . min ( e , z ) ;
          f = Math . min ( f , Z - z - 1 ) ;
        }
        ans ^= ( a ^ b ^ c ^ d ^ e ^ f ) ;
      }
      System . out . println ( ans != 0 ? "WIN" : "LOSE" ) ;
    }
    