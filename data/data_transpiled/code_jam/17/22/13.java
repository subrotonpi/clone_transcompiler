) public static String no = "IMPOSSIBLE" ;
String ch = "ROYGBV" ;
int [ ] [ ] mat = {
  {
    0 , 0 , 1 , 1 , 1 , 0 }
    , {
      0 , 0 , 0 , 0 , 1 , 0 }
      , {
        1 , 0 , 0 , 0 , 1 , 1 }
        , {
          1 , 0 , 0 , 0 , 0 , 0 }
          , {
            1 , 1 , 1 , 0 , 0 , 0 }
            , {
              0 , 0 , 1 , 0 , 0 , 0 }
            }
            ;
            IntFunction < Integer > cycle = new IntFunction < Integer > ( ) {
              private static final long serialVersionUID = 1L ;
              private int [ ] others = new IntStream ( ) . range ( 0 , x + 1 , x + 6 ) . toArray ( ) ;
              private int [ ] sol = new int [ ] {
              }
              ;
              private final List < Integer > c = new LinkedList < Integer > ( ) ;
              private int n = Integer . parseInt ( input ) ;
              @ Override public int max ( Integer [ ] c ) {
                if ( max ( c ) * 2 > n ) return no ;
                if ( max ( c ) * 2 == n ) {
                  int k = c . indexOf ( max ( c ) ) ;
                  StringBuffer sb = new StringBuffer ( ) ;
                  for ( int i : others ( k ) ) {
                    if ( c [ i ] == 0 || mat [ i ] [ k ] != 0 ) sb . append ( ( ch [ i ] + ch [ k ] ) * c [ i ] ) ;
                    else return no ;
                  }
                  return sb . toString ( ) ;
                }
              }
            }
            ;
            for ( int k = 1 ;
            k <= 3 ;
            k += 5 ) {
              if ( c [ k ] != 0 && c [ k ] >= c [ cycle . apply ( k + 3 ) ] ) return no ;
            }
            int [ ] d = {
              c [ 0 ] - c [ 3 ] , c [ 2 ] - c [ 5 ] , c [ 4 ] - c [ 1 ] }
              ;
              if ( max ( d ) * 2 > Integer . MAX_VALUE ) return no ;
              int x = 0 , y = 1 , z = 2 ;
              if ( d [ x ] < d [ y ] ) x = y = x = y = 0 ;
              if ( d [ x ] < d [ z ] ) x = z = x = 0 ;
              int w = d [ y ] + d [ z ] - d [ x ] ;
              int s