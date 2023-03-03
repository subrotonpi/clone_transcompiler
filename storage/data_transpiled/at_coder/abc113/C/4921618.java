@ VisibleForTesting static void solve ( @ Nonnull final int N , @ Nonnull final int M , @ Nonnull final List < List < Integer >> iPY ) {
  final double INF = Double . MAX_VALUE ;
  final Map < Integer , List < Integer >> map = new TreeMap < > ( ) ;
  Collections . sort ( iPY , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer i , Integer p , Integer y ) {
      for ( int j = 0 ;
      j < i ;
      j ++ ) {
        map . get ( j ) . add ( i , p , y ) ;
      }
      return i ;
    }
  }
  ) ;
  final List < List < Integer >> ans = new ArrayList < > ( ) ;
  for ( int k = 0 ;
  k < map . size ( ) ;
  k ++ ) {
    for ( int j = 0 ;
    j < map . get ( k ) . size ( ) ;
    j ++ ) {
      final int i = map . get ( k ) . get ( j ) ;
      final int p = map . get ( k ) . get ( i ) ;
      final int y = map . get ( k ) . get ( j ) ;
      ans . add ( i , p + "" + ( j + 1 ) + "" + ( j + 1 ) ) ;
    }
  }
  Collections . sort ( ans ) ;
  for ( List < Integer > a : ans ) {
    System . out . println ( a . get ( 1 ) ) ;
  }
  /* main program */
  final Scanner scanner = new Scanner ( System . in ) ;
  final String line ;
  while ( scanner . hasNextLine ( ) ) {
    final StringTokenizer tokenizer = new StringTokenizer ( line ) ;
    while ( tokenizer . hasMoreTokens ( ) ) {
      scanner . nextLine ( ) ;
    }
  }
  final List < String > tokens = scanner . nextLine ( ) ;
  final int N = Integer . parseInt ( ( String ) tokens . get ( 0 ) ) ;
  final int M = Integer . parseInt ( ( String ) tokens . get ( 1 ) ) ;
  final List < List < Integer >> iPY = new ArrayList < > ( M ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    iPY . add ( new ArrayList < > ( ) ) ;
  }
  solve ( N , M , iPY ) ;
}
