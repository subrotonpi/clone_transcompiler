static final int [ ] [ ] getNegativeInstances ( ) {
  System . setIn ( new InputReader ( ) ) ;
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] a = new int [ n ] [ n ] ;
  int [ ] [ ] g = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int x = Integer . parseInt ( input . readLine ( ) ) ;
    int y = Integer . parseInt ( input . readLine ( ) ) ;
    x -- ;
    y -- ;
    g [ x ] [ y ] = y ;
    g [ y ] [ x ] = x ;
  }
  int [ ] used = new int [ n ] ;
  int [ ] ue = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( g [ i ] . length == 1 ) {
      ne = i ;
      break ;
    }
  }
  int [ ] [ ] huka = new int [ n ] [ n ] ;
  {
    int [ ] [ ] huka = new int [ n ] [ n ] ;
    {
      int [ ] [ ] {
        int [ ] {
          0 }
          , int [ ] {
            1 }
            , int [ ] {
              2 }
            }
            ;
          }
        }
        {
          if ( used [ i ] != 0 ) return 0 ;
          used [ i ] = 1 ;
          huka [ i ] = y ;
          ue [ i ] = z ;
          for ( int ix : g [ i ] ) {
            dfs ( ix , y + 1 , x ) ;
          }
        }
        {
          dfs ( ne , 0 , - 1 ) ;
          for ( int i = 0 ;
          i < n ;
          i ++ ) huka [ i ] = new int [ n ] [ ] ;
          huka [ i ] [ 0 ] = huka [ i ] [ 1 ] ;
          huka [ i ] [ 1 ] = i ;
        }
        Arrays . sort ( huka , new Comparator < int [ ] > ( ) {
          int [ ] [ ] hen = new int [ n ] ;
          for ( int i = 0 ;
          i < n - 1 ;
          i ++ ) {
            int x = huka [ i ] [ 1 ] ;
            if ( g [ i ] . length == 1 ) {
              hen [ x ] = a [ x ] ;
              hen [ ue [ x ] ] += hen [ x ] ;
              if ( hen [ x ] > a [ ue [ x ] ] ) {
                System . out . println ( " NO