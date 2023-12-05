static final int [ ] [ ] getValidValidChars ( ) {
  String [ ] temp = input . nextLine ( ) . split ( " " ) ;
  int H = Integer . parseInt ( temp [ 0 ] ) ;
  int W = Integer . parseInt ( temp [ 1 ] ) ;
  int K = Integer . parseInt ( temp [ 2 ] ) ;
  char [ ] [ ] A = new char [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    A [ i ] [ 0 ] = input . charAt ( i ) ;
  }
  int [ ] [ ] place = new int [ W ] [ W + 2 ] ;
  int ans = 0 ;
  int si = 0 ;
  int sj = 0 ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( A [ i ] [ j ] == 'S' ) {
        si = i ;
        sj = j ;
        A [ i ] [ j ] = '.' ;
        break ;
      }
      else continue ;
      break ;
    }
  }
  int [ ] [ ] now = new int [ 2 ] [ ] ;
  now [ 0 ] = {
    si , sj }
    ;
    place [ si ] [ sj ] = 0 ;
    int [ ] [ ] next = new int [ K ] [ ] ;
    for ( int i = 0 ;
    i < K ;
    i ++ ) {
      for ( int room = 0 ;
      room < now . length ;
      room ++ ) {
        if ( A [ room - 1 ] [ room ] == '.' && place [ room - 1 ] [ room ] == K + 2 ) {
          place [ room - 1 ] [ room ] = i ;
          next [ room - 1 ] [ room ] = i ;
          if ( room - 1 == 0 ) ans = - 1 ;
        }
        if ( A [ room + 1 ] [ room ] == '.' && place [ room + 1 ] [ room ] == K + 2 ) {
          place [ room + 1 ] [ room ] = i ;
          next [ room + 1 ] [ room ] = i ;
          if ( room + 1 == H - 1 ) ans = - 1 ;
        }
        if ( A [ room ] [ room - 1 ] == '.' && place [ room - 1 ] [ room ] == K + 2 ) {
          place [ room - 1 ] [ room ] = i ;
          next [ room - 1 ] [ room ] = i ;
          if (