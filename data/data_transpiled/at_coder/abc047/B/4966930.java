public static void print ( int w , int h , int n ) {
  int [ ] wArray = new int [ w ] ;
  int [ ] hArray = new int [ h ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = Integer . parseInt ( input . readLine ( ) ) ;
    int y = Integer . parseInt ( input . readLine ( ) ) ;
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    if ( a == 1 ) {
      for ( int j = 0 ;
      j < x ;
      j ++ ) wArray [ j ] = 1 ;
    }
    else hArray [ j ] = 1 ;
  }
}
