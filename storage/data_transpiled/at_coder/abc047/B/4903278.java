public static int W = Integer . parseInt ( input . nextLine ( ) ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> xya = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    xya . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int [ ] [ ] xy = new int [ W ] [ H ] ;
  for ( int i = 0 ;
  i < xya . size ( ) ;
  i ++ ) {
    List < Integer > x_y = xya . get ( i ) . subList ( 0 , 2 ) ;
    int a = xya . get ( i ) . get ( 2 ) ;
    if ( a == 1 ) {
      for ( int j = 0 ;
      j < x_y . get ( 0 ) ;
      j ++ ) {
        xy [ j ] = Collections . singletonList ( xy [ j ] ) ;
      }
    }
    else if ( a == 2 ) {
      for ( int j = x_y . get ( 0 ) ;
      j < W ;
      j ++ ) {
        xy [ j ] [ k ] += k < y ? 1 : 0 ;
      }
    }
    else if ( a == 3 ) {
      int y = x_y . get ( 1 ) ;
      for ( int j = 0 ;
      j < W ;
      j ++ ) {
        for ( int k = 0 ;
        k < H ;
        k ++ ) {
          xy [ j ] [ k ] += k >= y ? 1 : 0 ;
        }
      }
    }
  }
  int area = 0 ;
  for ( List < Integer > i : xy ) {
    area += i . stream ( ) . mapToInt ( 0 ) ;
  }
  System . out . println ( area ) ;
  return area ;
}
