public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int [ ] disk = new int [ N + 1 ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    disk [ i ] = i ;
  }
  int bf = 0 ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    if ( bf == a ) {
      continue ;
    }
    else {
      int b = disk [ a ] ;
      disk [ b ] = bf ;
      bf = a ;
    }
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( disk [ i ] ) ;
  }
}
