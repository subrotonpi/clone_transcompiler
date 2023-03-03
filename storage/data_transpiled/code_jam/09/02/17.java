static int [ ] [ ] flowingCell ( int [ ] [ ] map , int r , int c ) throws IOException {
  if ( r < 0 || r >= map . length || c < 0 || c >= map [ 0 ] . length ) return null ;
  int [ ] heights = neighborHeight ( map , r , c ) ;
  int idx = heights . indexOf ( Math . min ( Arrays . asList ( map ) , heights ) ) ;
  if ( idx == 0 ) return new int [ ] [ ] {
    r - 1 , c }
    ;
    else if ( idx == 1 ) return new int [ ] [ ] {
      r , c - 1 }
      ;
      else if ( idx == 2 ) return new int [ ] [ ] {
        r , c + 1 }
        ;
        int [ ] [ ] solution = solve ( map ) ;
        PrintWriter out = new PrintWriter ( new BufferedWriter ( new FileWriter ( "resultB.txt" ) ) ) ;
        int N = Integer . parseInt ( out . readLine ( ) . trim ( ) ) ;
        for ( int i = 0 ;
        i < N ;
        i ++ ) {
          int [ ] line = new int [ 2 ] ;
          for ( int j = 0 ;
          j < line . length ;
          j ++ ) {
            line [ j ] = Integer . parseInt ( out . readLine ( ) . trim ( ) ) ;
          }
          int H = line [ 0 ] ;
          int W = line [ 1 ] ;
          map [ r ] = line [ 2 ] ;
          for ( int j = 0 ;
          j < H ;
          j ++ ) {
            map [ r ] [ j ] = Integer . parseInt ( out . readLine ( ) . trim ( ) ) ;
          }
        }
        int [ ] [ ] ret = new int [ N ] [ ] ;
        if ( r != 0 ) ret [ 0 ] = map [ r - 1 ] [ c ] ;
        else ret [ 0 ] = null ;
        if ( c != 0 ) ret [ 1 ] = map [ r ] [ c + 1 ] ;
        else ret [ 1 ] = null ;
        if ( r < map . length - 1 ) ret [ 2 ] = map [ r + 1 ] [ c ] ;
        else ret [ 2 ] = null ;
        return ret ;
      }
      