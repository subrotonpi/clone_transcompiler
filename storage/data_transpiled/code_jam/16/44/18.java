@ VisibleForTesting static int [ ] solve ( final int N , final int [ ] [ ] W ) throws IOException {
  final BufferedReader in = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final String raw = in . readLine ( ) ;
  final int [ ] ints = Ints . fromCharStream ( raw . toCharArray ( ) ) ;
  final Scanner scanner = new Scanner ( in ) ;
  final int [ ] valid = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int p = scanner . nextInt ( ) ;
    final int [ ] poss = new int [ p ] ;
    for ( int j = 0 ;
    j < p ;
    j ++ ) {
      poss [ j ] = scanner . nextInt ( ) & free ;
      if ( poss [ j ] == 0 ) return false ;
    }
    return Arrays . binarySearch ( valid , valid , new int [ N ] , Arrays . copyOfRange ( poss , 1 , poss . length ) ) ;
  }
  {
    final int [ ] squares = new int [ N ] ;
    for ( int i = 0 ;
    i < squares . length ;
    i ++ ) for ( int j = 0 ;
    j < squares . length ;
    j ++ ) if ( ! W [ i ] [ j ] ) squares [ i ] = new int [ N ] ;
    for ( int fix = 0 ;
    fix < squares . length + 1 ;
    fix ++ ) for ( final int [ ] comb : combinations ( squares , fix ) ) {
      final Set < Integer > new HashSet < Integer > ( ) ;
      for ( final int x = 0 ;
      x < comb . length ;
      x ++ ) {
        new HashSet < Integer > ( ) ;
      }
      for ( final int x = 0 ;
      x < comb . length ;
      x ++ ) {
        new HashSet < Integer > ( ) ;
      }
      for ( final int y = 0 ;
      y < comb . length ;
      y ++ ) {
        if ( W [ x ] [ y ] ) {
          new HashSet < Integer > ( ) ;
        }
      }
      if ( Arrays . binarySearch ( valid , valid , new int [ N ] , Arrays . copyOfRange ( Arrays . copyOf ( squares , squares . length ) , N ) ) >= 0 ) {
        return fix ;
      }
    }
    throw new IllegalArgumentException ( ) ;
  }
}
