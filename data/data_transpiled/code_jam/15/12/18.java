static final void ReadIn ( ) {
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int c = 1 ;
  c <= t ;
  c ++ ) {
    int m = Integer . parseInt ( input . nextLine ( ) ) ;
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] a = new int [ m ] ;
    for ( int i = 0 ;
    i < a . length ;
    i ++ ) {
      a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    ReadIn ( c , n , a ) ;
  }
  {
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] a = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    ReadIn ( c , n , a ) ;
  }
  {
    int [ ] a = new int [ n ] ;
    int [ ] ret ;
    int lower = 0 ;
    int upper = max ( a ) * n ;
    while ( lower < upper ) {
      int guess = ( lower + upper + 1 ) / 2 ;
      if ( OK ( n , a , guess ) ) upper = guess - 1 ;
      else lower = guess ;
      guess = lower ;
      heap = new int [ n ] ;
      int remain = n ;
      for ( int i = 0 ;
      i < a . length ;
      i ++ ) {
        int num = guess / a [ i ] + 1 ;
        remain -= num ;
        heapAppend ( heap , new int [ ] {
          num * a [ i ] - guess , i }
          ) ;
        }
        ret = heap [ 0 ] [ 1 ] ;
        for ( int r = 0 ;
        r < remain ;
        r ++ ) {
          t = heapAppend ( heap , t , i ) ;
          int i = i ;
          heapAppend ( heap , new int [ ] {
            t + a [ i ] , i }
            ) ;
            ret = i ;
          }
        }
        ReadIn ( c , n , a ) ;
      }
    }
    