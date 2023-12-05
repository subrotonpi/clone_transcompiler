@ Sys public static int [ ] [ ] solve ( ) throws Exception {
  System . setIn ( new BufferedReader ( new InputStreamReader ( System . in ) ) ) ;
  String tt = in . readLine ( ) ;
  tt = eval ( tt ) ;
  int [ ] [ ] edge = new int [ 2 ] [ ] ;
  Set < Integer > visit = new HashSet < Integer > ( ) ;
  {
    int [ ] ret ;
    int sum0 = 0 ;
    int sum1 = 1 ;
    int [ ] be = new int [ 2 ] ;
    for ( int i = 0 ;
    i < edge [ 0 ] . length ;
    i ++ ) {
      int h = edge [ i ] [ 0 ] ;
      if ( ! h == 0 ) {
        ret = dfs ( h ) ;
        sum0 += ret [ 1 ] ;
        sum1 += ret [ 1 ] ;
        be [ i ] = ret [ 1 ] - ret [ 0 ] ;
      }
    }
    Arrays . sort ( be ) ;
    if ( be . length == 0 ) {
      return new int [ ] [ ] {
        0 , 1 }
        ;
      }
      else if ( be . length == 1 ) {
        return new int [ ] [ ] {
          sum1 - 1 , sum1 }
          ;
        }
        else {
          int ll = be . length ;
          return new int [ ] [ ] {
            sum0 - be [ ll - 1 ] - be [ ll - 2 ] , sum1 }
            ;
          }
        }
        for ( int cc = 1 ;
        cc <= tt ;
        cc ++ ) {
          String tmp = in . readLine ( ) ;
          int n = eval ( tmp ) ;
          edge = new int [ n + 1 ] [ ] ;
          for ( int i = 0 ;
          i <= n ;
          i ++ ) {
            edge [ i ] = new int [ 2 ] ;
          }
          for ( int i = 1 ;
          i <= n ;
          i ++ ) {
            tmp = in . readLine ( ) ;
            tmp = tmp . split ( " " ) ;
            int j = eval ( tmp ) ;
            int k = eval ( tmp ) ;
            edge [ j ] [ 0 ] = k ;
            edge [ k ] [ 1 ] = j ;
          }
          int res = n ;
          for ( int i = 1 ;
          i <= n ;
          i ++ ) {
            visit . clear ( ) ;
            int [ ] tmp = dfs ( i ) ;
            if ( tmp [ 0 ] < res ) {
              res = tmp [ 0 ] ;
            }
          }
          System . out . println ( "Case #" + cc + ": " + res ) ;
        }
        return edge ;
      }
      