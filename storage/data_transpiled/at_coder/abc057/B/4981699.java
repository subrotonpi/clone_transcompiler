public static int [ ] [ ] input ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] ab_a = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    int [ ] ab = new int [ N ] ;
    for ( int j = 0 ;
    j <= N ;
    j ++ ) {
      ab [ j ] = Integer . parseInt ( input . readLine ( ) ) ;
    }
    ab_a [ i ] = ab ;
  }
  int [ ] [ ] cd_a = new int [ M ] [ ] ;
  for ( int i = 0 ;
  i <= M ;
  i ++ ) {
    int [ ] cd = new int [ N ] ;
    for ( int j = 0 ;
    j <= N ;
    j ++ ) {
      cd [ j ] = Integer . parseInt ( input . readLine ( ) ) ;
    }
    cd_a [ i ] = cd ;
  }
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    int mnh = 10 * 10 ;
    int point = 100 ;
    int h = 0 ;
    for ( h = 0 ;
    h <= M ;
    h ++ ) {
      int tmp = Math . abs ( cd_a [ h ] [ 0 ] - ab_a [ i ] [ 0 ] ) + Math . abs ( cd_a [ h ] [ 1 ] - ab_a [ i ] [ 1 ] ) ;
      if ( tmp < mnh ) {
        mnh = tmp ;
        point = h ;
      }
    }
    System . out . println ( point + 1 ) ;
  }
  return ab_a ;
}
