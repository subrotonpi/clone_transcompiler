public static final int [ ] [ ] getH ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < List < Integer >> H = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    H . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  Collections . sort ( H , new Comparator < List < Integer >> ( ) {
    @ Override public int compare ( List < Integer > o1 , List < Integer > o2 ) {
      return o1 . get ( 2 ) . compareTo ( o2 . get ( 2 ) ) ;
    }
  }
  ) ;
  for ( List < Integer > i : H ) {
    int x = i . get ( 0 ) ;
    int y = i . get ( 1 ) ;
    int h = i . get ( 2 ) ;
    for ( int cX = 0 ;
    cX < 101 ;
    cX ++ ) {
      for ( int cY = 0 ;
      cY < 101 ;
      cY ++ ) {
        int Height = h + Math . abs ( x - cX ) + Math . abs ( y - cY ) ;
        for ( int j = 0 ;
        j < N ;
        j ++ ) {
          if ( H . get ( j ) . get ( 2 ) != Math . max ( Height - Math . abs ( H . get ( j ) . get ( 0 ) - cX ) - Math . abs ( H . get ( j ) . get ( 1 ) - cY ) , 0 ) ) {
            break ;
          }
          if ( j == N - 1 ) {
            System . out . println ( cX + " " + cY + " " + Height ) ;
            System . exit ( 0 ) ;
          }
        }
      }
    }
  }
  return H . get ( 0 ) ;
}
