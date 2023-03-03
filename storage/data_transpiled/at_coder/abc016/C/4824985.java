static void print ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final int inf = 10 * 18 ;
  final int N = Integer . parseInt ( input ) ;
  final int M = Integer . parseInt ( input ) ;
  final List < List < Integer >> AB = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    AB . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  final boolean [ ] [ ] net = new boolean [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    net [ i ] [ i ] = false ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int Ai = AB . get ( i ) . get ( ) ;
    final int Bi = AB . get ( i ) . get ( ) ;
    net [ Ai - 1 ] [ Bi - 1 ] = true ;
    net [ Bi - 1 ] [ Ai - 1 ] = true ;
  }
  for ( int p = 0 ;
  p < N ;
  p ++ ) {
    final boolean [ ] net2 = new boolean [ N ] ;
    for ( int q = 0 ;
    q < N ;
    q ++ ) {
      if ( net [ p ] [ q ] ) continue ;
      for ( int r = 0 ;
      r < N ;
      r ++ ) {
        if ( net [ q ] [ r ] ) continue ;
        if ( net [ p ] [ r ] ) continue ;
        net2 [ r ] = true ;
      }
    }
    System . out . println ( Arrays . toString ( net2 ) ) ;
  }
}
