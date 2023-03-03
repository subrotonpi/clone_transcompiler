public static void Unionfindtree ( int number ) {
  int [ ] par = new int [ number ] ;
  int [ ] rank = new int [ number ] ;
  for ( int i = 0 ;
  i < number ;
  i ++ ) {
    par [ i ] = i ;
    rank [ i ] = 0 ;
  }
  int x = 0 ;
  int y = 0 ;
  for ( int i = 0 ;
  i < number ;
  i ++ ) {
    par [ i ] = i ;
    rank [ i ] = 0 ;
  }
  int px = 0 ;
  int py = 0 ;
  for ( int i = 0 ;
  i < number ;
  i ++ ) {
    par [ i ] = i ;
  }
  int w = 0 ;
  for ( int i = 0 ;
  i < par . length ;
  i ++ ) {
    int px = par [ i ] ;
    int py = par [ i ] ;
    if ( px == py ) return ;
    if ( rank [ px ] < rank [ py ] ) par [ i ] = py ;
    else par [ i ] = px ;
    if ( rank [ px ] == rank [ py ] ) rank [ px ] ++ ;
  }
  int [ ] connect = new int [ N ] ;
  int Q = Integer . parseInt ( input ( ) ) ;
  Unionfindtree tree = new Unionfindtree ( 2 * N ) ;
  String [ ] A = new String [ Q ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int w = Integer . parseInt ( input ( ) ) ;
    int x = Integer . parseInt ( input ( ) ) ;
    int y = Integer . parseInt ( input ( ) ) ;
    int z = Integer . parseInt ( input ( ) ) ;
    if ( w == 1 ) {
      if ( z % 2 == 0 ) {
        tree . union ( 2 * ( x - 1 ) , 2 * ( y - 1 ) ) ;
        tree . union ( 2 * x - 1 , 2 * y - 1 ) ;
      }
      else {
        tree . union ( 2 * ( x - 1 ) , 2 * y - 1 ) ;
        tree . union ( 2 * x - 1 , 2 * y - 1 ) ;
      }
    }
    else {
      if ( tree . connect ( 2 * ( x - 1 ) , 2 * ( y - 1 ) ) ) A [ i ] = "YES" ;
      else A [ i ] = "NO" ;
    }
  }
  System . out . println ( Arrays . toString ( A ) ) ;
}
