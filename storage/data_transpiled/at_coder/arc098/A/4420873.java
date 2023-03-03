public static int N = Integer . parseInt ( input ) {
  String s = input ;
  int e = 0 ;
  int w = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( ( s . charAt ( i ) == 'W' ) && ( s . charAt ( i ) == 'E' ) ) {
      w ++ ;
    }
    else if ( ( s . charAt ( i ) == 'E' ) && ( s . charAt ( i ) == 'E' ) ) {
      e ++ ;
    }
  }
  int [ ] ans = {
    0 , 0 }
    ;
    int [ ] dp = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int tmp = ans [ 1 ] ;
      if ( ( s . charAt ( i ) == 'W' ) && ( s . charAt ( i ) == 'E' ) ) {
        ans [ 1 ] ++ ;
      }
      else {
        ans [ 0 ] ++ ;
      }
      dp [ i ] = tmp + ( e - ans [ 0 ] ) ;
    }
    System . out . println ( min ( dp ) ) ;
    return 0 ;
  }
  