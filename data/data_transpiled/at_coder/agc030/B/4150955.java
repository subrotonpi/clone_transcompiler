, L = ( int ) Math . ceil ( L ) , n = ( int ) Math . ceil ( L ) ) ;
int [ ] x = new int [ n ] ;
for ( int i = 0 ;
i < n ;
i ++ ) x [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
int [ ] t = {
  0 }
  , t2 = {
    0 }
    , y = {
      0 }
      , a = 0 ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        t [ i ] = t [ t . length - 1 ] + x [ i ] ;
        t2 [ i ] = L + t2 [ t . length - 1 ] - x [ n - i - 1 ] ;
        y [ i ] = L - x [ n - i - 1 ] ;
      }
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        if ( ( n - i - 1 ) % 2 != 0 ) a = Math . max ( a , y [ ( n - i - 1 ) / 2 ] + 2 * ( t [ i + ( n - i - 1 ) / 2 + 1 ] - t [ i ] + t2 [ ( n - i - 1 ) / 2 ] ) ) ;
        else a = Math . max ( a , 2 * ( t [ i + ( n - i - 1 ) / 2 + 1 ] - t [ i ] + t2 [ ( n - i - 1 ) / 2 ] ) - x [ i + ( n - i - 1 ) / 2 ] ) ;
      }
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        if ( ( n - i - 1 ) % 2 != 0 ) a = Math . max ( a , x [ ( n - i - 1 ) / 2 ] + 2 * ( t2 [ i + ( n - i - 1 ) / 2 + 1 ] - t2 [ i ] + t [ ( n - i - 1 ) / 2 ] ) ) ;
        else a = Math . max ( a , 2 * ( t2 [ i + ( n - i - 1 ) / 2 + 1 ] - t2 [ i ] + t [ ( n - i - 1 ) / 2 ] ) - y [ i + ( n - i - 1 ) / 2 ] ) ;
      }
      System . out . println ( a ) ;
    }
    