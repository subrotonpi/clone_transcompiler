public static int [ ] getHogeX ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] hogeX = new int [ n ] ;
  int [ ] hogeY = new int [ n ] ;
  int [ ] hugaX = new int [ n ] ;
  int [ ] hugaY = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    hogeX [ i ] = a ;
    hogeY [ i ] = b ;
  }
  for ( int j = 0 ;
  j < m ;
  j ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    hugaX [ i ] = a ;
    hugaY [ i ] = b ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int ansKyori = - 1 ;
    int ansIndex = - 1 ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      int kyori = Math . abs ( hogeX [ i ] - hugaX [ j ] ) + Math . abs ( hogeY [ i ] - hugaY [ j ] ) ;
      if ( ( kyori < ansKyori ) || ( ansKyori == - 1 ) ) {
        ansKyori = kyori ;
        ansIndex = j + 1 ;
      }
    }
    System . out . println ( ansIndex ) ;
  }
  return hogeX ;
}
