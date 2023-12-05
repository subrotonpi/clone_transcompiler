static final int [ ] [ ] solve ( int n ) {
  int h = ( Integer ) input . nextInt ( ) ;
  int w = ( Integer ) input . nextInt ( ) ;
  int t = ( Integer ) input . nextInt ( ) ;
  char [ ] [ ] maze = new char [ h ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    char [ ] s = maze [ i ] ;
    for ( int j = 0 ;
    j < s . length ;
    j ++ ) {
      char ss = s [ j ] ;
      if ( ss == 'S' ) {
        start = new Point ( i , j ) ;
      }
      else if ( ss == 'G' ) {
        goal = new Point ( i , j ) ;
      }
    }
  }
  return new int [ ] [ ] {
    {
      n }
    }
    ;
  }
  