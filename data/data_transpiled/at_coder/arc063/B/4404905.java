public static void input ( int n , int t ) {
  int [ ] ax = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] sell = new int [ ax . length ] ;
  for ( int i = ax . length - 1 ;
  i >= 0 ;
  i -- ) {
    int a = ax [ i ] ;
    if ( sell . length == 0 ) {
      sell [ i ] = new int [ ] {
        a , 1 }
        ;
        continue ;
      }
      if ( a > sell [ sell . length - 1 ] [ 0 ] ) {
        sell [ i ] = new int [ ] {
          a , 1 }
          ;
        }
        else if ( a == sell [ sell . length - 1 ] [ 0 ] ) {
          sell [ i ] = new int [ ] {
            a , sell [ sell . length - 1 ] [ 1 ] + 1 }
            ;
          }
          else {
            sell [ i ] = sell [ sell . length - 1 ] ;
          }
        }
        sell = sell . clone ( ) ;
        Map < Integer , Integer > ans = new HashMap < > ( ) ;
        for ( int i = 0 ;
        i < n - 1 ;
        i ++ ) {
          int sell_p = sell [ i ] ;
          int cnt = cnt > 0 ? 1 : sell [ i ] ;
          ans . put ( sell_p - ax [ i ] , ans . getOrDefault ( sell_p - ax [ i ] , 0 ) + 1 ) ;
        }
        System . out . println ( ans . get ( Collections . max ( ans . keySet ( ) ) ) ) ;
      }
      