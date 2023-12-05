public static void testCount ( Scanner in ) {
  for ( int testIndex = 0 ;
  testIndex < testCount ;
  testIndex ++ ) {
    String ans = "Case #" + ( testIndex + 1 ) + ": " ;
    int n = in . nextInt ( ) ;
    int [ ] see = new int [ n ] ;
    for ( String s : in . nextLine ( ) . split ( "\\s+" ) ) see [ 0 ] = Integer . parseInt ( s ) - 1 ;
    int [ ] m = new int [ n - 1 ] ;
    int cm = 0 ;
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      if ( i >= m [ cm ] ) {
        cm -- ;
      }
      if ( see [ i ] > m [ cm ] ) {
        ans += "Impossible" ;
        break ;
      }
      if ( see [ i ] < m [ cm ] ) {
        cm ++ ;
        m [ cm ] = see [ i ] ;
      }
    }
    else {
      int [ ] height = new int [ n ] ;
      int [ ] count = new int [ n ] ;
      for ( int i = 0 ;
      i < see . length ;
      i ++ ) count [ see [ i ] ] ++ ;
      int [ ] angle = new int [ n ] ;
      for ( int i = n - 2 ;
      i >= 0 ;
      i -- ) {
        angle [ i ] = count [ see [ i ] ] + angle [ see [ i ] ] ;
        count [ see [ i ] ] -- ;
        height [ i ] = ( see [ i ] - i ) * angle [ i ] + height [ see [ i ] ] ;
      }
      m = Math . max ( height , 0 ) ;
      for ( int i = 0 ;
      i < height . length ;
      i ++ ) {
        ans += ( m - i ) + " " ;
      }
    }
    System . out . println ( ans ) ;
  }
}
