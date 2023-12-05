public static int run ( int L , int N , int [ ] X ) {
  int [ ] lSum = new int [ N + 1 ] ;
  int [ ] rSum = new int [ N + 1 ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) lSum [ i ] = lSum [ i - 1 ] + X [ i - 1 ] ;
  for ( int i = N ;
  i > 0 ;
  i -- ) rSum [ i ] = rSum [ i + 1 ] + L - X [ i - 1 ] ;
  int ret = 0 ;
  for ( int s = 1 ;
  s <= N ;
  s ++ ) {
    int nodes = ( N - s + 1 ) ;
    int f = ( int ) ( s + ( nodes - ( nodes % 2 ) ) / 2 ) ;
    boolean lastDirL ;
    if ( nodes % 2 == 1 ) {
      lastDirL = true ;
    }
    else {
      lastDirL = false ;
    }
    if ( lastDirL ) {
      int tmp = 2 * ( lSum [ f ] - lSum [ s - 1 ] ) + 2 * ( rSum [ f + 1 ] ) - X [ f - 1 ] ;
      if ( lastDirL ) {
        tmp = 2 * ( lSum [ f ] - lSum [ s - 1 ] ) + 2 * ( rSum [ f ] ) - ( L - X [ f - 1 ] ) ;
      }
      ret = Math . max ( ret , tmp ) ;
    }
    for ( int s = 1 ;
    s <= N ;
    s ++ ) {
      int nodes = s ;
      int f = ( int ) ( ( nodes + ( nodes % 2 ) ) / 2 ) ;
      if ( nodes % 2 == 1 ) {
        lastDirR = true ;
      }
      else {
        lastDirR = false ;
      }
      if ( lastDirR ) {
        int tmp = 2 * ( lSum [ f - 1 ] ) + 2 * ( rSum [ f ] - rSum [ s + 1 ] ) - ( L - X [ f - 1 ] ) ;
        if ( lastDirR ) {
          tmp = 2 * ( lSum [ f ] ) + 2 * ( rSum [ f + 1 ] - rSum [ s + 1 ] ) - X [ f - 1 ] ;
        }
        ret = Math . max ( ret , tmp ) ;
      }
    }
  }
  if ( className . equals ( "main" ) ) {
    main ( ) ;
  }
  else {
    main ( ) ;
  }
  return