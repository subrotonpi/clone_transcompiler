static void prity ( char [ ] [ ] mat ) {
  for ( int i = 0 ;
  i < mat . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < mat [ 0 ] . length ;
    j ++ ) {
      System . out . print ( mat [ i ] [ j ] + " " ) ;
    }
    System . out . println ( ) ;
  }
  {
    int a = 0 ;
    int b = 0 ;
    System . out . println ( "YES" ) ;
    prity ( mat ) ;
  }
  {
    int N = Integer . parseInt ( input . nextLine ( ) ) ;
    int M = Integer . parseInt ( input . nextLine ( ) ) ;
    int A = Integer . parseInt ( input . nextLine ( ) ) ;
    int B = Integer . parseInt ( input . nextLine ( ) ) ;
    int a = A ;
    int b = B ;
    char [ ] [ ] mat = new char [ M ] [ N ] ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      for ( int w = 0 ;
      w < M ;
      w ++ ) {
        if ( a > 0 ) {
          int j = 2 * w + ( M % 2 ) ;
          tileA ( i , j , mat ) ;
          a -- ;
        }
      }
    }
    if ( M % 2 == 1 ) {
      int j = M - 1 ;
      for ( int h = 0 ;
      h < N / 2 ;
      h ++ ) {
        if ( b > 0 ) {
          int i = 2 * h ;
          tileB ( i , j , mat ) ;
          b -- ;
        }
      }
    }
    int height = N / 2 ;
    int width = M / 2 ;
    List < Integer > skipArr = new ArrayList < Integer > ( ) ;
    if ( N % 2 == 1 && M % 2 == 1 && a % 2 == 1 && b % 2 == 1 ) {
      tileA ( 2 * ( height - 1 ) , 0 , mat ) ;
      tileB ( 2 * ( height - 1 ) + 1 , 0 , mat ) ;
      a -- ;
      b -- ;
      skipArr . add ( new Integer ( 2 * ( height - 1 ) ) ) ;
    }
    for ( int h = 0 ;
    h < height ;
    h ++ ) {
      for ( int w = 0 ;
      w < width ;
      w ++ ) {
        int i = 2 * h ;
        int j = 2 * w ;
        if ( ! ( ( i , j ) == 1 ) && ( j == 1 ) ) {
          tileA ( i , j , mat ) ;
          a