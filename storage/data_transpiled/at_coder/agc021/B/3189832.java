public static final double [ ] [ ] getPoints ( ) {
  final Scanner stdin = new Scanner ( System . in ) ;
  int [ ] [ ] angles ;
  int [ ] [ ] bsc ;
  if ( stdin . hasNextInt ( ) ) {
    angles = new int [ ] [ ] {
      1 , 1 }
      ;
    }
    else {
      angles = new int [ stdin . nextInt ( ) ] [ ] ;
      for ( int i = 0 ;
      i < angles . length ;
      i ++ ) {
        angles [ i ] = angles [ i ] [ 0 ] ;
      }
      int [ ] [ ] ans = new int [ n ] [ ] ;
      for ( int i = 0 ;
      i < ans . length ;
      i ++ ) {
        ans [ i ] = i ;
      }
      for ( int i = 0 ;
      i < ans . length ;
      i ++ ) {
        ans [ i ] = angles [ i ] [ 0 ] ;
      }
      int [ ] [ ] ans = new int [ n ] [ ] ;
      for ( int i = 0 ;
      i < ans . length ;
      i ++ ) {
        ans [ i ] = angles [ i ] [ 1 ] ;
      }
      int [ ] [ ] ans = new int [ n ] ;
      for ( int i = 0 ;
      i < ans . length ;
      i ++ ) {
        ans [ i ] = angles [ i ] [ 0 ] ;
      }
      int [ ] [ ] ans = new int [ n ] ;
      for ( int i = 0 ;
      i < ans . length ;
      i ++ ) {
        ans [ i ] = angles [ i ] [ 1 ] ;
      }
      int [ ] [ ] ans = new int [ n ] ;
      for ( int i = 0 ;
      i < ans . length ;
      i ++ ) ans [ i ] = angles [ i ] [ 0 ] ;
      int [ ] [ ] ans = new int [ n ] ;
      for ( int i = 0 ;
      i < ans . length ;
      i ++ ) {
        ans [ i ] = angles [ i ] [ 0 ] ;
      }
      int [ ] [ ] ans = new int [ n ] ;
      for ( int i = 0 ;
      i < ans . length ;
      i ++ ) ans [ i ] = angles [ i ] [ 1 ] ;
      for ( int i = 0 ;
      i < ans . length ;
      i ++ ) ans [ i ] = ans [ i ] [ 0 ] ;
    }
    return bsc ;
  }
  