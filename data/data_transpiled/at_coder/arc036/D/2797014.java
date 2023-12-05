public static void main ( String input , int n , int q ) {
  int [ ] ws = new int [ q ] ;
  for ( int i = 0 ;
  i < ws . length ;
  i ++ ) {
    ws [ i ] = Integer . parseInt ( input . substring ( 0 , i ) ) ;
  }
  Map < Integer , Integer > union = new HashMap < > ( ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int z = 0 ;
    z < "oe" . length ;
    z ++ ) {
      if ( union . get ( i ) == n ) {
        return ;
      }
      union . put ( i , root ( union . get ( i ) ) ) ;
    }
  }
  for ( int w = 0 ;
  w < ws . length ;
  w ++ ) {
    int x = ws [ w ] ;
    int y = ws [ w ] ;
    int z = ws [ w ] ;
    if ( w == 2 ) {
      System . out . println ( root ( ( x = "e" ) ) . equals ( root ( ( y = "e" ) ) ) ? "YES" : "NO" ) ;
    }
    else if ( z % 2 == 0 ) {
      Set < Integer > rex = new TreeSet < > ( ) ;
      Set < Integer > rey = new TreeSet < > ( ) ;
      for ( int i = 0 ;
      i < w ;
      i ++ ) {
        rex . add ( root ( ( x = "e" ) ) ) ;
        rey . add ( root ( ( y = "e" ) ) ) ;
      }
      union . put ( rex , rey ) ;
      Set < Integer > rox = new TreeSet < > ( ) ;
      for ( int i = 0 ;
      i < w ;
      i ++ ) {
        rox . add ( root ( ( x = "o" ) ) ) ;
      }
      Set < Integer > roy = new TreeSet < > ( ) ;
      for ( int i = 0 ;
      i < w ;
      i ++ ) {
        roy . add ( root ( ( y = "o" ) ) ) ;
      }
      union . put ( rox , roy ) ;
    }
    else {
      Set < Integer > reox = new TreeSet < > ( ) ;
      Set < Integer > reoy = new TreeSet < > ( ) ;
      for ( int i = 0 ;
      i < w ;
      i ++ ) {
        reox . add ( root ( ( x = "e" ) ) ) ;
      }
      union . put ( reox , reoy ) ;
      Set <