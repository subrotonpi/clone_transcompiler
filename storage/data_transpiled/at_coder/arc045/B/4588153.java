public static int [ ] [ ] input ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] par = new int [ N + 2 ] ;
  int [ ] [ ] sTArray = new int [ M ] [ M + 1 ] ;
  sTArray [ 0 ] = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int s = Integer . parseInt ( input . readLine ( ) ) ;
    int t = Integer . parseInt ( input . readLine ( ) ) ;
    sTArray [ i ] [ s ] = t ;
    par [ s ] ++ ;
    par [ t + 1 ] -- ;
  }
  int [ ] par1 = new int [ N + 2 ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    par1 [ i ] = par1 [ i - 1 ] + par [ i ] ;
  }
  int [ ] par2 = new int [ N + 2 ] ;
  for ( int i = 1 ;
  i < par . length ;
  i ++ ) {
    if ( par1 [ i ] != 1 ) {
      par1 [ i ] = 0 ;
    }
    par2 [ i ] = par2 [ i - 1 ] + par1 [ i ] ;
  }
  List < Integer > ans = new ArrayList < Integer > ( ) ;
  for ( int i = 1 ;
  i <= M ;
  i ++ ) {
    if ( par2 [ sTArray [ i ] [ 1 ] ] - par2 [ ( sTArray [ i ] [ 0 ] - 1 ) ] == 0 ) {
      ans . add ( i ) ;
    }
  }
  System . out . println ( ans . size ( ) ) ;
  if ( ans . size ( ) != 0 ) {
    for ( int i : ans ) {
      System . out . println ( i ) ;
    }
  }
  return ans . toArray ( new int [ ans . size ( ) ] [ ] ) ;
}
