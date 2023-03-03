public static void input ( int r , int c , int k ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> RC = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) RC . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  int [ ] rows = new int [ r ] ;
  int [ ] columns = new int [ c ] ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    rows [ i ] = 0 ;
    columns [ i ] = 0 ;
  }
  @ SuppressWarnings ( "unchecked" ) List < Integer > rows2 = ( List < Integer > ) rows ;
  @ SuppressWarnings ( "unchecked" ) List < Integer > columns2 = ( List < Integer > ) columns ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < rows2 . size ( ) ;
  i ++ ) {
    ans += rows2 . get ( i ) * columns2 . get ( k - i ) ;
  }
  for ( int i = 0 ;
  i < c ;
  i ++ ) {
    if ( rows [ i ] + columns [ c - 1 ] == k ) ans -- ;
    if ( rows [ i ] + columns [ c - 1 ] == k + 1 ) ans ++ ;
  }
  System . out . println ( ans ) ;
}
