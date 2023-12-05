public static void main ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  List < List < String >> G = new ArrayList < List < String >> ( ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    G . add ( Collections . singletonList ( input ) ) ;
  }
  List < String > ans = new ArrayList < String > ( ) ;
  for ( int h = 0 ;
  h < H ;
  h ++ ) {
    for ( int w = 0 ;
    w < W ;
    w ++ ) {
      if ( G . get ( h ) . get ( w ) . equals ( "." ) ) {
        for ( int i = - 1 ;
        i <= 2 ;
        i ++ ) {
          for ( int j = - 1 ;
          j <= 2 ;
          j ++ ) {
            if ( ( 0 <= h + i ) && ( 0 <= w + j ) && ( 0 <= w + j ) && ( 0 <= i ) ) {
              ans . set ( h + i , w + j , "." ) ;
            }
          }
        }
      }
    }
  }
  List < String > check = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    check . set ( i , "." ) ;
  }
  for ( int h = 0 ;
  h < H ;
  h ++ ) {
    for ( int w = 0 ;
    w < W ;
    w ++ ) {
      if ( ans . get ( h ) . get ( w ) . equals ( "#" ) ) {
        for ( int i = - 1 ;
        i <= 2 ;
        i ++ ) {
          for ( int j = - 1 ;
          j <= 2 ;
          j ++ ) {
            if ( ( 0 <= h + i ) && ( 0 <= w + j ) && ( 0 <= i ) && ( 0 <= i ) && ( 0 <= i ) && ( 0 <= i ) && ( 0 <= i ) && ( 0 <= i ) && ( 0 <= i ) && ( 0 <= i ) && ( 0 <= i ) && ( 0 <= i ) && ( 0 <= i ) && ( 0 <= i ) && ( 0 <= i ) && ( 0 <= i ) && ( 0 <= i ) && ( 0 <= i ) && ( 0 <= i ) && ( 0 <= i ) && ( 0 <= i ) ) {
              ans . set ( h + i , w + j , "#" ) ;
            }
          }
        }
      }
      