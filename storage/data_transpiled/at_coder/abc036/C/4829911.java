public static void print ( int N = Integer . parseInt ( input ) ) {
  int [ ] an = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    an [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  Map < Integer , Integer > map = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    map . put ( a , i ) ;
  }
  for ( int a : an ) {
    System . out . println ( map . get ( a ) ) ;
  }
}
