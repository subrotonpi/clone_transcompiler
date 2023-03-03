public static void main ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  int N = Integer . parseInt ( input ) ;
  int [ ] arr = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) arr [ i ] = 0 ;
  int [ ] [ ] c = new int [ H ] [ W ] ;
  int [ ] [ ] goto = {
    {
      0 , 1 }
      , {
        1 , 0 }
        , {
          0 , - 1 }
          , {
            - 1 , 0 }
          }
          ;
          int q = 1 ;
          int h = 0 ;
          int w = 0 ;
          int cnt = 0 ;
          int g = 0 ;
          int count = 0 ;
          /* judge */
          boolean ok = false ;
          for ( int i = 0 ;
          i < H * W ;
          i ++ ) {
            c [ h ] [ w ] = q ++ ;
            if ( cnt == arr [ q ] ) {
              q ++ ;
              cnt = 0 ;
            }
            int tmph = h + goto [ g ] [ 0 ] ;
            int tmpw = w + goto [ g ] [ 1 ] ;
            for ( int j = 0 ;
            j < 4 ;
            j ++ ) {
              if ( judge ( tmph , tmpw ) ) break ;
              g ++ ;
              g %= 4 ;
              tmph = h + goto [ g ] [ 0 ] ;
              tmpw = w + goto [ g ] [ 1 ] ;
            }
            h = tmph ;
            w = tmpw ;
          }
          for ( int i = 0 ;
          i < N ;
          i ++ ) {
            System . out . println ( ( int ) c [ i ] ) ;
          }
        }
        