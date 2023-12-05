static final void main ( String [ ] args ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  Scanner input = new Scanner ( System . in ) ;
  String N = input . nextLine ( ) . substring ( 0 , N . length ( ) - 1 ) ;
  int L = N . length ( ) ;
  int [ ] [ ] [ ] dp = new int [ L + 1 ] [ L + 1 ] [ L + 1 ] ;
  dp [ 0 ] [ 0 ] [ 0 ] = 1 ;
  for ( int dig = 0 ;
  dig < N . length ;
  dig ++ ) {
    for ( int less = 0 ;
    less < 2 ;
    less ++ ) {
      for ( int num = 0 ;
      num < N . length ;
      num ++ ) {
        if ( dp [ dig ] [ less ] [ num ] == 0 ) {
          continue ;
        }
        else if ( less == 1 ) {
          dp [ dig + 1 ] [ 1 ] [ num + 1 ] += dp [ dig ] [ less ] [ num ] ;
          dp [ dig + 1 ] [ 1 ] [ num ] += dp [ dig ] [ less ] [ num ] * 9 ;
        }
        else {
          if ( N . charAt ( dig ) == '1' ) {
            dp [ dig + 1 ] [ 0 ] [ num + 1 ] += dp [ dig ] [ less ] [ num ] ;
            dp [ dig + 1 ] [ 1 ] [ num ] += dp [ dig ] [ less ] [ num ] ;
          }
          else if ( N . charAt ( dig ) == '0' ) {
            dp [ dig + 1 ] [ 0 ] [ num ] += dp [ dig ] [ less ] [ num ] ;
          }
          else {
            dp [ dig + 1 ] [ 0 ] [ num ] = dp [ dig ] [ less ] [ num ] ;
            dp [ dig + 1 ] [ 1 ] [ num ] = dp [ dig ] [ less ] [ num ] * ( Integer . parseInt ( N . charAt ( dig ) ) - 1 ) ;
            dp [ dig + 1 ] [ 1 ] [ num + 1 ] += dp [ dig ] [ less ] [ num ] ;
          }
        }
      }
    }
  }
  int ans = 0 ;
  for ( int less = 0 ;
  less < 2 ;
  less ++ ) {
    for ( int num = 0 ;
    num < N . length ( ) + 1 ;
    num ++ ) {
      if ( dp [ N . length ] [ less ] [ num ] > 0 ) {
        ans += num * dp [ N . length ] [ less ] [ num ] ;
      }
      