public static int [ ] [ ] [ ] data ( Scanner input ) {
  int N = input . nextInt ( ) , M = input . nextInt ( ) ;
  int [ ] [ ] [ ] data = new int [ N ] [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) data [ i ] [ i ] = 0 ;
  for ( int m = 0 ;
  m < M ;
  m ++ ) {
    int a = input . nextInt ( ) , b = input . nextInt ( ) ;
    a -- ;
    b -- ;
    data [ a ] [ b ] = 1 ;
    data [ b ] [ a ] = 1 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      for ( int k = 0 ;
      k < N ;
      k ++ ) {
        data [ i ] [ j ] = Math . min ( data [ i ] [ j ] , data [ i ] [ k ] + data [ k ] [ j ] ) ;
      }
    }
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( data [ i ] . length [ 2 ] ) ;
  }
  return data ;
}
