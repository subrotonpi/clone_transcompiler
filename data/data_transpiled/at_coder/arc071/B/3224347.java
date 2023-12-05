@ ai public static void ai ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int m = Integer . parseInt ( input ( ) ) ;
  int [ ] x = ai ( ) ;
  int [ ] y = ai ( ) ;
  int mod = 10 * 9 + 7 ;
  int ans = 0 ;
  int [ ] sx = {
    x [ 0 ] }
    , ssx = {
      x [ x . length - 1 ] }
      , sy = {
        y [ 0 ] }
        , ssy = {
          y [ y . length - 1 ] }
          ;
          for ( int i = 1 ;
          i < n ;
          i ++ ) {
            sx [ i ] = sx [ i - 1 ] + x [ i ] ;
            ssx [ i ] = ssx [ i - 1 ] + x [ x . length - i - 1 ] ;
          }
          for ( int i = 1 ;
          i < m ;
          i ++ ) {
            sy [ i ] = sy [ i - 1 ] + y [ i ] ;
            ssy [ i ] = ssy [ i - 1 ] + y [ y . length - i - 1 ] ;
          }
          int a = Integer . valueOf ( ssx [ i ] - sx [ i ] ) % mod ;
          int b = Integer . valueOf ( ssy [ i ] - sy [ i ] ) % mod ;
          ans = a * b % mod ;
          System . out . println ( ans ) ;
        }
        