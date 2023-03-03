public static boolean isOne ( ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] W = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) W [ i ] = input ;
  HashMap < Integer , Boolean > map = new HashMap < Integer , Boolean > ( ) ;
  int alp = W [ 0 ] - 1 ;
  map . put ( W [ 0 ] , true ) ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( map . containsKey ( W [ i ] ) ) {
      System . out . println ( "No" ) ;
      exit ( ) ;
    }
    if ( alp != W [ i ] ) {
      System . out . println ( "No" ) ;
      exit ( ) ;
    }
    map . put ( W [ i ] , true ) ;
    alp = W [ i ] - 1 ;
  }
  return true ;
}
