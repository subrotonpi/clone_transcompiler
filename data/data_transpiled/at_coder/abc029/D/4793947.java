static final void main ( String [ ] args ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  Scanner input = new Scanner ( System . in ) ;
  String N = input . nextLine ( ) . substring ( 0 , input . nextLine ( ) . length ( ) - 1 ) ;
  int [ ] [ ] [ ] dp = new int [ N . length ( ) + 1 ] [ N . length ( ) + 1 ] [ N . length ( ) + 1 ] ;
  dp [ 0 ] [ 0 ] [ 0 ] = 1 ;
  for ( int i = 0 ;
  i < N . length ( ) ;
  i ++ ) {
    for ( int j = 0 ;
    j < 2 ;
    j ++ ) {
      for ( int k = 0 ;
      k < N . length ( ) ;
      k ++ ) {
        if ( dp [ i ] [ j ] [ k ] == 0 ) {
          continue ;
        }
        else if ( j == 1 ) {
          dp [ i + 1 ] [ 1 ] [ k + 1 ] += dp [ i ] [ j ] [ k ] ;
          dp [ i + 1 ] [ 1 ] [ k ] += dp [ i ] [ j ] [ k ] * 9 ;
        }
        else {
          if ( N . charAt ( i ) == '1' ) {
            dp [ i + 1 ] [ 0 ] [ k + 1 ] += dp [ i ] [ j ] [ k ] ;
            dp [ i + 1 ] [ 1 ] [ k ] += dp [ i ] [ j ] [ k ] ;
          }
          else if ( N . charAt ( i ) == '0' ) {
            dp [ i + 1 ] [ 0 ] [ k ] += dp [ i ] [ j ] [ k ] ;
          }
          else {
            dp [ i + 1 ] [ 0 ] [ k ] = dp [ i ] [ j ] [ k ] ;
            dp [ i + 1 ] [ 1 ] [ k ] = dp [ i ] [ j ] [ k ] * ( Integer . parseInt ( N . charAt ( i ) ) - 1 ) ;
            dp [ i + 1 ] [ 1 ] [ k + 1 ] += dp [ i ] [ j ] [ k ] ;
          }
        }
      }
    }
  }
  int ans = 0 ;
  for ( int j = 0 ;
  j < 2 ;
  j ++ ) {
    for ( int k = 0 ;
    k < N . length ( ) + 1 ;
    k ++ ) {
      if ( dp [ N . length ( ) ] [ j ] [ k ] != 0 ) {
        ans += k * dp