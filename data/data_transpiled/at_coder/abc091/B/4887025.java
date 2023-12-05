public static void print ( int N ) {
  int [ ] s = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) s [ i ] = input . nextInt ( ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] t = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) t [ i ] = input . nextInt ( ) ;
  int a = 0 ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) {
    int b = s [ i ] - t [ i ] ;
    if ( a < b ) a = b ;
  }
  System . out . println ( a ) ;
}
