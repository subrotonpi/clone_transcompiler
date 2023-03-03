public static void print ( int h , int w ) {
  int [ ] [ ] a = new int [ h ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  boolean [ ] [ ] aOdd = new boolean [ h ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    for ( int j = 0 ;
    j < w ;
    j ++ ) {
      aOdd [ i ] [ j ] = i % 2 == 0 ? false : true ;
    }
  }
  int [ ] [ ] link = new int [ h ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    for ( int j = 0 ;
    j < w ;
    j ++ ) {
      link [ i ] [ j ] = i % 2 == 0 ? true : false ;
    }
  }
  int [ ] [ ] route = new int [ h ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    for ( int j = 0 ;
    j < w ;
    j ++ ) {
      for ( int j = 0 ;
      j < h ;
      j ++ ) {
        for ( int j = 0 ;
        j < w ;
        j ++ ) {
          for ( int j = 0 ;
          j < h ;
          j ++ ) {
            for ( int k = 0 ;
            k < w ;
            k ++ ) {
              if ( aOdd [ i ] [ j ] && ! ( linking ) ) {
                linking = true ;
              }
              else if ( aOdd [ i ] [ j ] && linking ) {
                linking = false ;
                link [ i ] [ j ] = prev ;
                cnt += tmp + 1 ;
                tmp = 0 ;
                validN = k ;
              }
              else if ( ! ( aOdd [ i ] [ j ] ) && linking ) {
                link [ i ] [ j ] = prev ;
                tmp ++ ;
              }
              else {
              }
            }
            prev = new int [ ] {
              i , j }
              ;
            }
          }
        }
      }
    }
    System . out . println ( cnt ) ;
    for ( int n = 0 ;
    n < h ;
    n ++ ) {
      for ( int j = 0 ;
      j < w ;
      j ++ ) {
        if ( link [ i ] [ j ] && n <= validN ) {
          System . out . println ( link [ i ] [ j ] [ 0 ] + 1 + ",link[i][j][1]+1+"