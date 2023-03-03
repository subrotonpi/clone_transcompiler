static final int [ ] binarySearch ( ) {
  String S = input . next ( ) ;
  String A [ ] = {
    "a" , "b" , "c" , "d" , "e" , "f" , "g" , "h" , "i" , "j" , "k" , "l" , "m" , "n" , "o" , "p" , "q" , "r" , "s" , "t" , "u" , "v" , "w" , "x" , "y" , "z" }
    ;
    int N [ ] = new int [ 26 ] ;
    int n [ ] = new int [ 26 ] ;
    for ( int i = 0 ;
    i < N . length ;
    i ++ ) {
      N [ i ] = 0 ;
    }
    for ( int i = 0 ;
    i < n . length ;
    i ++ ) {
      n [ i ] = i ;
    }
    int a [ ] = new int [ 26 ] ;
    if ( S . equals ( "zyxwvutsrqponmlkjihgfedcba" ) ) {
      System . out . println ( - 1 ) ;
    }
    else if ( S . length ( ) < 26 ) {
      for ( int i = 0 ;
      i < S . length ( ) ;
      i ++ ) {
        for ( int j = 0 ;
        j < 26 ;
        j ++ ) {
          if ( S . charAt ( i ) == A . charAt ( j ) ) {
            N [ j ] = 1 ;
          }
        }
      }
      for ( int i = 0 ;
      i < 26 ;
      i ++ ) {
        if ( N [ i ] == 0 ) {
          S = S + A . charAt ( i ) ;
          System . out . println ( S ) ;
          exit ( ) ;
        }
      }
    }
    else {
      int len = S . length ( ) ;
      for ( int i = 0 ;
      i < len ;
      i ++ ) {
        for ( int j = 0 ;
        j < 26 ;
        j ++ ) {
          if ( S . charAt ( i ) == A . charAt ( j ) ) {
            S [ i ] = n [ j ] ;
          }
        }
      }
      for ( int i = 0 ;
      i < 25 ;
      i ++ ) {
        if ( S . charAt ( 25 - i ) > S . charAt ( 24 - i ) ) {
          break ;
        }
      }
    }
    List < String > L = new ArrayList < > ( ) ;
    L . addAll ( S ) ;
    Collections . sort