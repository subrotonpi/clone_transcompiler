public static int N = Integer . parseInt ( input ) {
  String n = input . substring ( 0 , N ) ;
  String k = input . substring ( N , M ) ;
  char [ ] A = {
    'A' , 'B' , 'C' , 'D' , 'E' , 'F' , 'G' , 'H' , 'I' , 'J' , 'K' , 'L' , 'M' , 'N' , 'O' , 'P' , 'Q' , 'R' , 'S' , 'T' , 'U' , 'V' , 'W' , 'X' , 'Y' , 'Z' }
    ;
    int [ ] a = new int [ 26 ] ;
    for ( int i = 0 ;
    i < a . length ;
    i ++ ) {
      a [ i ] = 0 ;
    }
    for ( int i = 0 ;
    i < b . length ;
    i ++ ) {
      for ( int l = 0 ;
      l < k . length ;
      l ++ ) {
        for ( int m = 0 ;
        m < b . length ;
        m ++ ) {
          if ( k [ l ] == A [ m ] ) {
            b [ m ] ++ ;
          }
        }
      }
    }
    for ( int x = 1 ;
    x <= 51 ;
    x ++ ) {
      int cnt = 0 ;
      for ( int y = 0 ;
      y < 26 ;
      y ++ ) {
        if ( a [ y ] <= b [ y ] * x ) {
          cnt ++ ;
        }
        else {
          break ;
        }
      }
      if ( cnt == 26 ) {
        System . out . println ( x ) ;
        exit ( ) ;
      }
    }
    System . out . println ( - 1 ) ;
    return - 1 ;
  }
  