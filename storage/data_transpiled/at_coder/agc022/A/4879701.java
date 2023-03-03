public static void input ( Scanner scanner ) {
  int N = scanner . nextInt ( ) ;
  int [ ] l = new int [ 26 ] ;
  for ( int i = 0 ;
  i < l . length ;
  i ++ ) {
    l [ i ] = 0 ;
  }
  if ( N < 26 ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      l [ ( int ) ( S . charAt ( i ) - 97 ) ] ++ ;
    }
    for ( int i = 0 ;
    i < 26 ;
    i ++ ) {
      if ( l [ i ] == 0 ) {
        System . out . println ( S + ( char ) ( i + 97 ) ) ;
        break ;
      }
    }
  }
  else if ( S . equals ( "zyxwvutsrqponmlkjihgfedcba" ) ) {
    System . out . println ( - 1 ) ;
  }
  else {
    int m = 0 ;
    for ( int i = 0 ;
    i < 26 ;
    i ++ ) {
      if ( m > ( int ) ( S . charAt ( i ) - 97 ) ) {
        id = i ;
        break ;
      }
      m = ( int ) ( S . charAt ( i ) - 97 ) ;
    }
    for ( int i = id ;
    i < 26 ;
    i ++ ) {
      l [ ( int ) ( S . charAt ( i ) - 97 ) ] ++ ;
    }
    for ( int i = 0 ;
    i < l . length ;
    i ++ ) {
      if ( l [ i ] == 1 && ( int ) ( S . charAt ( id ) - 97 ) < i ) {
        String s = ( char ) ( i + 97 ) ;
        break ;
      }
    }
    System . out . println ( S . substring ( 0 , id ) + s ) ;
  }
}
