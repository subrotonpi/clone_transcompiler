public static void clip ( ) throws IOException {
  int count = 0 ;
  int i , n ;
  int [ ] [ ] matrix = new int [ m ] [ n ] ;
  int test = 0 ;
  for ( i = 0 ;
  i < m ;
  i ++ ) {
    if ( matrix [ i ] [ n - 1 ] . value == - 1 ) {
      matrix [ i ] [ n - 1 ] . right = 0 ;
    }
    else {
      matrix [ i ] [ n - 1 ] . right = 1 ;
    }
    for ( i = 0 ;
    i < m ;
    i ++ ) {
      char [ ] data = new char [ n ] ;
      for ( i = 0 ;
      i < n ;
      i ++ ) {
        data [ i ] = new char [ n ] ;
      }
      matrix [ i ] [ n - 1 ] = new int [ n ] ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        int ans = countn ( matrix , size , m , n ) ;
        if ( ans != 0 ) {
          finalArray [ i ] [ j ] = new int [ n ] ;
          for ( int j = 0 ;
          j < n ;
          j ++ ) {
            int len = data [ j ] . length ;
            matrix [ i ] [ n - 1 ] [ j ] = new int [ len ] ;
            for ( int j = 0 ;
            j < len ;
            j ++ ) {
              matrix [ i ] [ j ] . value = clip ( ( int ) ( data [ j ] & 16 ) >> 3 ) ;
              matrix [ i ] [ j ] . value = clip ( ( int ) ( data [ j ] & 16 ) >> 2 ) ;
              matrix [ i ] [ j ] . value = 1 ;
            }
          }
        }
      }
    }
  }
  int j ;
  int i ;
  boolean flag = true ;
  for ( j = 0 ;
  j < n ;
  j ++ ) {
    if ( matrix [ i ] [ j ] . value == - 1 ) {
      matrix [ i ] [ j ] . down = 0 ;
      continue ;
    }
    else {
      matrix [ i ] [ j ] . down = 1 ;
    }
    for ( i = m - 2 ;
    i >= 0 ;
    i -- ) {
      if ( matrix [ i ] [ j ] . value == - 1 ) {
        matrix [ i ] [ j ] . down = 0 ;
        continue ;
      }
      if ( matrix [ i ] [ j ] . value == matrix [ i + 1 ] [ j ] . value ) {
        matrix [ i ] [ j ] . down = 1