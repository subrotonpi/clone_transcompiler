@ GwtIncompatible ( "java.io.BufferedReader" ) public static void floyd ( String [ ] [ ] w ) {
  int [ ] [ ] dist = new int [ w . length ] [ w [ 0 ] . length ] ;
  int n = w . length ;
  float inf = Float . POSITIVE_INFINITY ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( i == j ) {
        dist [ i ] [ j ] = 0 ;
      }
      else if ( dist [ i ] [ j ] == - 1 ) {
        dist [ i ] [ j ] = inf ;
      }
    }
  }
  for ( int k = 0 ;
  k < n ;
  k ++ ) {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        dist [ i ] [ j ] = Math . min ( dist [ i ] [ j ] , dist [ i ] [ k ] + dist [ k ] [ j ] ) ;
      }
    }
  }
  try {
    BufferedReader in = new BufferedReader ( new FileReader ( "C-large.in" ) ) ;
    PrintWriter fout = new PrintWriter ( new BufferedWriter ( new FileWriter ( "out.txt" ) ) ) ;
    System . out . println ( "Input file:" + in . readLine ( ) ) ;
    int t = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
    for ( int case = 1 ;
    case <= t ;
    case ++ ) {
      n = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
      int q = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
      int [ ] e = new int [ n ] ;
      int [ ] s = new int [ n ] ;
      for ( ;
      ;
      ) {
        int ei = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
        int si = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
        e [ i ] = ei ;
        s [ i ] = si ;
      }
      int [ ] w = new int [ n ] ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        int [ ] d = new int [ n ] ;
        for ( ;
        ;
        ) {
          w [ i ] = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
        }
        w [ i ] = d ;
      }
      d = floyd ( w