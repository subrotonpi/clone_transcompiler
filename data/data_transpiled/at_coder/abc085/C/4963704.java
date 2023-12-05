public static void print ( String NY ) {
  NY = input . split ( " " ) ;
  int [ ] N_Y = new int [ NY . length ] ;
  for ( String s : NY ) {
    N_Y [ 0 ] = Integer . parseInt ( s ) ;
  }
  int counterY = 0 ;
  int counter = 0 ;
  int [ ] listx = new int [ 3 ] ;
  for ( int i = 0 ;
  i < N_Y [ 0 ] + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < N_Y [ 0 ] + 1 ;
    j ++ ) {
      int k = N_Y [ 0 ] - i - j ;
      counterY = 10000 * i + 5000 * j + 1000 * k ;
      if ( counterY == N_Y [ 1 ] && k >= 0 ) {
        listx = new int [ ] {
          i , j , k }
          ;
          counter ++ ;
        }
      }
    }
    if ( counter == 0 ) {
      System . out . println ( "-1 -1 -1" ) ;
    }
    else {
      System . out . println ( listx [ 0 ] + " " + listx [ 1 ] + " " + listx [ 2 ] ) ;
    }
  }
  