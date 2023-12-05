public static int [ ] [ ] getLevels ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) , M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] li = new int [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    li [ i ] = 1 << i ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) - 1 ;
    int y = Integer . parseInt ( input . nextLine ( ) ) - 1 ;
    li [ x ] = li [ x ] | ( 1 << y ) ;
  }
  HashMap < Integer , Integer > [ ] lisDP = new HashMap [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    lisDP [ i ] = new HashMap < Integer , Integer > ( ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int ke = 1 << i ;
    lisDP [ i ] . put ( ke , ke ) ;
  }
  return lisDP ;
}
