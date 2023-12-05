public static int [ ] [ ] readInput ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int m = input . readInt ( ) ;
  int [ ] cry = new int [ m + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    cry [ i ] = 0 ;
  }
  int [ ] [ ] data = new int [ N ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int li = Integer . parseInt ( input . readLine ( ) ) ;
    int ri = Integer . parseInt ( input . readLine ( ) ) ;
    int si = Integer . parseInt ( input . readLine ( ) ) ;
    if ( ! ( li == 1 && ri == N ) ) {
      cry [ li - 1 ] ++ ;
      cry [ ri ] -- ;
      data [ i ] = new int [ ] {
        li , ri , si }
        ;
      }
    }
    int cur = 0 ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      cur += cry [ i ] ;
      cry [ i ] = cur ;
    }
    cry [ cry . length - 1 ] -- ;
    int [ ] [ ] res = new int [ N ] [ m ] ;
    int small = Math . min ( cry , cry ) ;
    if ( small == 0 ) {
      int count = 0 ;
      for ( int i = 0 ;
      i < data . length ;
      i ++ ) {
        count += data [ i ] [ 2 ] ;
      }
    }
    else {
      while ( small >= 0 ) {
        count = 0 ;
        int ind = cry . indexOf ( small ) ;
        for ( int i = 0 ;
        i < data . length ;
        i ++ ) {
          if ( ! ( data [ i ] [ 0 ] <= ind + 1 && data [ i ] [ 1 ] <= ind ) ) {
            count += data [ i ] [ 2 ] ;
          }
        }
        cry [ ind ] = 10 * 6 ;
        res [ i ] = count ;
      }
      count = Math . max ( res [ i ] , 0 ) ;
    }
    return res ;
  }
  