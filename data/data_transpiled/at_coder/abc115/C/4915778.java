static final void solve ( int N , int K , @ Nonnull List < Integer > h ) {
  int minDiff = 10 * 18 ;
  for ( int i = 0 ;
  i < N - K + 1 ;
  i ++ ) {
    minDiff = Math . min ( minDiff , h . get ( i + K - 1 ) - h . get ( i ) ) ;
  }
  System . out . println ( minDiff ) ;
  return ;
  /* main loop */
  {
    Iterator < String > iter = new Scanner ( System . in ) . iterator ( ) ;
    while ( iter . hasNext ( ) ) {
      String line = iter . next ( ) ;
      for ( String word : line . split ( " " ) ) {
        iter . next ( ) ;
      }
    }
  }
  final Iterator < String > tokens = new Scanner ( System . in ) . iterator ( ) ;
  N = Integer . parseInt ( next ( tokens ) ) ;
  K = Integer . parseInt ( next ( tokens ) ) ;
  List < Integer > q = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    q . add ( Integer . parseInt ( next ( tokens ) ) ) ;
  }
  Collections . sort ( q ) ;
  solve ( N , K , q ) ;
}
