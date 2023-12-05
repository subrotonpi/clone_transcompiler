public static int n ( ) {
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  Map < Integer , List < Integer >> di = Maps . newHashMap ( ) ;
  int m = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( ! di . containsKey ( x ) ) di . put ( x , new ArrayList < Integer > ( ) ) ;
    di . get ( x ) . add ( y ) ;
  }
  for ( int i : di . keySet ( ) ) {
    Collections . sort ( di . get ( i ) , Collections . reverseOrder ( ) ) ;
  }
  int a = Collections . min ( di . keySet ( ) ) ;
  int b = a + 1 , c = a + 2 , d = a + 3 ;
  for ( int i = b ;
  i < c ;
  i ++ ) {
    if ( ! di . containsKey ( i ) ) di . put ( i , new ArrayList < Integer > ( ) ) ;
  }
  for ( int i = 0 ;
  i < di . get ( a ) . size ( ) + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < di . get ( b ) . size ( ) + 1 ;
    j ++ ) {
      for ( int k = 0 ;
      k < di . get ( c ) . size ( ) + 1 ;
      k ++ ) {
        for ( int l = 0 ;
        l < di . get ( d ) . size ( ) + 1 ;
        l ++ ) {
          if ( i * a + j * b + k * c + l * d <= w ) m = Math . max ( m , Ints . checkedCast ( di . get ( a ) . subList ( 0 , i ) + di . get ( b ) . subList ( 0 , j ) + di . get ( c ) . subList ( 0 , k ) + di . get ( d ) . subList ( 0 , l ) ) ) ;
        }
      }
    }
  }
  System . out . println ( m ) ;
  return m ;
}
