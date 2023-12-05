public static double [ ] [ ] getPoints ( int n , int kk ) {
  List < List < Integer >> p = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    p . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  Set < Integer > xSet = new HashSet < > ( ) ;
  for ( List < Integer > i : p ) {
    xSet . add ( i . get ( 1 ) ) ;
  }
  Set < Integer > ySet = new HashSet < > ( ) ;
  for ( List < Integer > i : p ) {
    ySet . add ( i . get ( 0 ) ) ;
  }
  Map < Integer , Integer > dX = new HashMap < > ( ) ;
  Map < Integer , Integer > dY = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < xSet . size ( ) ;
  i ++ ) {
    dX . put ( i . get ( 0 ) , i ) ;
  }
  for ( int i = 0 ;
  i < ySet . size ( ) ;
  i ++ ) {
    dY . put ( i . get ( 1 ) , i ) ;
  }
  Map < Integer , Integer > gX = new HashMap < > ( ) ;
  Map < Integer , Integer > gY = new HashMap < > ( ) ;
  int w = dX . size ( ) ;
  int h = dY . size ( ) ;
  int [ ] [ ] board = new int [ h + 1 ] [ w + 1 ] ;
  int [ ] tmp = new int [ w ] ;
  for ( int i = 0 ;
  i < w ;
  i ++ ) {
    board [ i ] [ 0 ] = 0 ;
    for ( int j = 0 ;
    j < h ;
    j ++ ) {
      board [ i ] [ j ] = 0 ;
    }
    for ( int y = 0 ;
    y < p . size ( ) ;
    y ++ ) {
      int x = p . get ( y ) ;
      int ys = dY . get ( y ) ;
      int xs = dX . get ( x ) ;
      gX . put ( xs , x ) ;
      gY . put ( ys , y ) ;
      tmp [ ys ] [ xs ] ++ ;
    }
    for ( int i = 0 ;
    i < h ;
    i ++ ) {
      for ( int j = 0 ;
      j < w ;
      j ++ ) {
        board [ i + 1 ] [ j + 1 ] = board