static final int [ ] [ ] getDiamondLength ( ) {
  int Y = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] a = new int [ Y ] [ X ] ;
  for ( int i = 0 ;
  i < Y ;
  i ++ ) {
    a [ i ] = new int [ X ] ;
    for ( char c : input . toCharArray ( ) ) {
      a [ i ] [ c ] = c == 'x' ? 0 : 1 ;
    }
  }
  for ( int x = 0 ;
  x < X ;
  x ++ ) {
    int fr = 0 ;
    for ( int y = 0 ;
    y < Y + 1 ;
    y ++ ) {
      if ( y == Y || a [ y ] [ x ] == 0 ) {
        for ( int i = 0 ;
        i < Math . ceil ( ( y - fr ) / 2 ) ;
        i ++ ) {
          a [ fr + i ] [ x ] = i + 1 ;
          a [ y - i - 1 ] [ x ] = i + 1 ;
        }
        fr = y + 1 ;
      }
    }
  }
  int result = 0 ;
  int diamondLength = ( K - 1 ) * 2 + 1 ;
  int diamondRadius = K ;
  for ( int y = K - 1 ;
  y <= Y - K ;
  y ++ ) {
    int start = 0 ;
    int cnt = a [ y ] . length ;
    for ( int i = 0 ;
    i < cnt + 1 ;
    i ++ ) {
      int end = i < cnt ? a [ y ] [ 0 ] : X - 1 ;
      int rangeLength = end - start + 1 ;
      if ( rangeLength < diamondLength ) {
        start = end + 1 ;
        continue ;
      }
      int checked = 0 ;
      for ( int j = 0 ;
      j < rangeLength - diamondLength + 1 ;
      j ++ ) {
        checked = Math . max ( 0 , checked - 1 ) ;
        int _start = start + j ;
        boolean isCreatable = true ;
        boolean flag = true ;
        for ( int k = checked ;
        k < diamondLength ;
        k ++ ) {
          int req = k < diamondRadius ? k + 1 : 2 * diamondRadius - k - 1 ;
          int now = a [ y ] [ _start + k ] ;
          if ( now < req ) {
            isCreatable = false ;
            break