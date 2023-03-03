public static int getPrime ( ) {
  int [ ] prime = {
    2 , 3 , 5 , 7 , 11 , 13 , 17 , 19 , 23 , 29 , 31 , 37 , 41 , 43 , 47 }
    ;
    HashMap < Integer , Integer > ps = new HashMap < Integer , Integer > ( ) ;
    {
      int x = 1 ;
      int k = 1 ;
      int cnt = 0 ;
      for ( int i = 1 ;
      i <= x ;
      i ++ ) {
        while ( i % k == 0 ) {
          cnt ++ ;
          i = i / k ;
        }
      }
      return cnt ;
    }
    for ( int i : prime ) {
      ps . put ( i , primes ( n , i ) ) ;
    }
    int sevfo = 0 ;
    int twefo = 0 ;
    int fot = 0 ;
    int four = 0 ;
    int two = 0 ;
    for ( int value : ps . values ( ) ) {
      if ( value >= 74 ) {
        sevfo ++ ;
        twefo ++ ;
        fot ++ ;
        four ++ ;
        two ++ ;
      }
      else if ( value >= 24 ) {
        twefo ++ ;
        fot ++ ;
        four ++ ;
        two ++ ;
      }
      else if ( value >= 14 ) {
        fot ++ ;
        four ++ ;
        two ++ ;
      }
      else if ( value >= 4 ) {
        four ++ ;
        two ++ ;
      }
      else if ( value >= 2 ) {
        two ++ ;
      }
    }
    if ( ( four >= 2 && two >= 3 ) || sevfo >= 1 || ( twefo >= 1 && two >= 2 ) || ( fot >= 1 && four >= 2 ) ) {
      int a = ( int ) ( ( ( four - 1 ) * four / 2 ) * ( two - 2 ) ) ;
      int b = fot * ( four - 1 ) ;
      int c = twefo * ( two - 1 ) ;
      int d = sevfo ;
      System . out . println ( a + b + c + d ) ;
    }
    else {
      System . out . println ( 0 ) ;
    }
    return 0 ;
  }
  