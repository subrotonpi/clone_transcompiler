public static int T = Integer . parseInt ( input ) {
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    int R = Integer . parseInt ( input . nextLine ( ) ) ;
    int C = Integer . parseInt ( input . nextLine ( ) ) ;
    int a1 [ ] = {
      1 , 1 , 0 , 1 , 1 }
      ;
      int a3 [ ] = {
        0 , 0 , 1 , 0 , 1 }
        ;
        int a4 [ ] = {
          0 , 0 , 0 , 1 , 0 }
          ;
          int a6 [ ] = {
            0 , 0 , 1 , 0 , 1 }
            ;
            int a12 [ ] = {
              0 , 0 , 0 , 0 , 0 }
              ;
              for ( int n = 5 ;
              n <= R ;
              n ++ ) {
                a1 [ n ] = a1 [ n - 3 ] ;
                a3 [ n ] = a3 [ n - 3 ] + a1 [ n - 4 ] + 3 * a3 [ n - 4 ] ;
                a4 [ n ] = a4 [ n - 3 ] + a1 [ n - 5 ] + 4 * a4 [ n - 5 ] ;
                a6 [ n ] = a6 [ n - 3 ] + 9 * a6 [ n - 4 ] + a1 [ n - 4 ] + 3 * a3 [ n - 4 ] ;
                a12 [ n ] = a12 [ n - 3 ] + 3 * a4 [ n - 4 ] + 10 * a12 [ n - 4 ] + a1 [ n - 5 ] + 3 * a3 [ n - 5 ] + 4 * a4 [ n - 5 ] + 6 * a6 [ n - 5 ] + 12 * a12 [ n - 5 ] ;
              }
              int ans = a1 [ R ] + a1 [ R - 2 ] ;
              if ( C % 3 == 0 ) ans += a3 [ R ] + a3 [ R - 2 ] ;
              if ( C % 4 == 0 ) ans += a4 [ R ] + a4 [ R - 2 ] ;
              if ( C % 6 == 0 ) ans += a6 [ R ] + a6 [ R - 2 ] ;
              if ( C % 12 == 0 ) ans += a12 [ R ] + a12 [ R - 2 ] ;
              ans %= 1000000007 ;
              System . out . println ( "Case #" + testCase + ": " + ans ) ;
            }
            return T ;
          }
          