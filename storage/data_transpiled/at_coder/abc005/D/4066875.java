public static int [ ] [ ] calc ( int x , int y ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < List < Integer >> D = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) D . add ( Collections . singletonList ( Integer . parseInt ( input ( ) ) ) ) ;
  int Q = Integer . parseInt ( input ( ) ) ;
  int [ ] P = new int [ Q ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) P [ i ] = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] memRec = new int [ N + 1 ] [ N + 1 ] ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < N + 1 ;
    j ++ ) {
      memRec [ j ] [ x ] = 0 ;
    }
  }
  int [ ] memMax = new int [ N * N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N + 1 ;
    j ++ ) {
      memMax [ i ] [ j ] = 0 ;
    }
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N + 1 ;
    j ++ ) {
      int tmp = memRec [ j ] [ i ] - memRec [ j ] [ i - x ] - memRec [ j - y ] [ i ] + memRec [ j - y ] [ i - x ] ;
      res = Math . max ( res , tmp ) ;
    }
  }
  for ( int i = 0 ;
  i < P . length ;
  i ++ ) {
    System . out . println ( memMax [ i ] ) ;
  }
  for ( int i = 0 ;
  i < P . length ;
  i ++ ) {
    System . out . println ( memMax [ i ] ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( memMax [ i ] [ i ] ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( memMax [ i ] [ i ] ) ;
  }
  return memMax ;
}
