public static void print ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  int N = Integer . parseInt ( input ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  List < Integer > l = new ArrayList < Integer > ( ) ;
  for ( int color = 0 , m = a . length ;
  color < m ;
  color ++ ) {
    l . add ( a [ color ] ) ;
  }
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    List < Integer > k = l . subList ( 0 , W ) ;
    l . clear ( ) ;
    if ( i % 2 != 0 ) {
      Collections . reverse ( k ) ;
    }
    System . out . println ( ( Integer ) k ) ;
  }
}
