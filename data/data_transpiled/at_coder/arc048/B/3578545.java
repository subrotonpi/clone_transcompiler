@ InputFunction public static void input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] A = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Arrays . copyOf ( input . nextLine ( ) , N ) ;
  }
  Arrays . sort ( A , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      int prevScore = - 1 ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        if ( A [ i ] [ 1 ] != prevScore ) {
          prevScore = A [ i ] [ 1 ] ;
          int cnt = 0 ;
          int startI = i ;
          int [ ] te = {
            0 , 0 , 0 , 0 }
            ;
          }
          else {
          }
          cnt ++ ;
          te [ A [ i ] [ 2 ] ] ++ ;
          if ( i + 1 >= N || A [ i + 1 ] [ 1 ] != prevScore ) {
            int endI = i ;
            int win = N - endI - 1 , lose = startI ;
            for ( int j = startI ;
            j <= endI ;
            j ++ ) {
              switch ( A [ j ] [ 2 ] ) {
                case 1 : A [ j ] [ 3 ] = win + te [ 2 ] ;
                case 2 : A [ j ] [ 4 ] = lose + te [ 3 ] ;
                case 3 : A [ j ] [ 5 ] = win + te [ 3 ] ;
                case 4 : A [ j ] [ 5 ] = lose + te [ 1 ] ;
                case 5 : A [ j ] [ 3 ] = win + te [ 3 ] ;
                case 5 : A [ j ] [ 4 ] = lose + te [ 1 ] ;
                case 6 : A [ j ] [ 5 ] = win + te [ 2 ] ;
                case 7 : A [ j ] [ 6 ] = win + te [ 3 ] ;
                case 8 : A [ j ] [ 7 ] = lose + te [ 1 ] ;
                case 9 : A [ j ] [ 8 ] = win + te [ 2 ] ;
                case 10 : A [ j ] [ 11 ] = win + te [ 3 ] ;
                case 11 : A [ j ] [ 12 ] = lose + te [ 1 ] ;
                case 12 : A [ j ] [ 13 ] = win + te [ 1 ] ;
              }
            }
          }
        }
        return cnt ;
      }
    }
    ) ;
  }
  