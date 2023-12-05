public static void print ( String input ) {
  int h = Integer . parseInt ( input . substring ( 0 , input . length ( ) ) ) ;
  int w = Integer . parseInt ( input . substring ( input . length ( ) , input . length ( ) ) ) ;
  int [ ] [ ] arr = new int [ h ] [ w ] ;
  int [ ] exist = new int [ h ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    String s = "" ;
    int [ ] a = new int [ w ] ;
    int f = 0 ;
    for ( int j = 0 ;
    j < w ;
    j ++ ) {
      if ( s . charAt ( j ) == '#' ) {
        a [ j ] = 1 ;
        f = 1 ;
      }
      else {
        a [ j ] = 0 ;
      }
    }
    arr [ i ] = a ;
    if ( f == 1 ) {
      exist [ i ] = 1 ;
    }
    else {
      exist [ i ] = 0 ;
    }
  }
  int [ ] [ ] red = new int [ w ] [ h ] ;
  int [ ] [ ] blue = new int [ w ] [ h ] ;
  int flag = 0 ;
  int preNonExist = 0 ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    if ( i == 0 ) {
      for ( int j = 0 ;
      j < w ;
      j ++ ) {
        red [ i ] [ j ] = 1 ;
      }
      flag = 1 ;
    }
    else if ( exist [ i ] == 1 && flag == 1 ) {
      preNonExist = 0 ;
      for ( int j = 0 ;
      j < w ;
      j ++ ) {
        blue [ i ] [ j ] = 1 ;
        if ( arr [ i ] [ j ] == 1 ) {
          red [ i ] [ j ] = 1 ;
        }
      }
      flag = 0 ;
    }
    else if ( exist [ i ] == 1 && flag == 0 ) {
      preNonExist = 0 ;
      for ( int j = 0 ;
      j < w ;
      j ++ ) {
        red [ i ] [ j ] = 1 ;
        if ( arr [ i ] [ j ] == 1 ) {
          blue [ i ] [ j ] = 1 ;
        }
      }
      flag = 1 ;
    }
    else {
      if ( preNonExist == 0 ) {
        flag = ( flag + 1 ) % 2 ;
      }
      preNonExist = 1 ;
      if ( flag == 0 ) {
        for ( int j = 0 ;
        j < w ;
        j ++ ) {
          if ( j == 0 || j