static final String [ ] readWordArr ( File file , int R ) {
  final String fileName = file . getName ( ) ;
  final int __path__ = file . getParent ( ) ;
  final String __prob__ = file . getName ( ) ;
  final int [ ] res = new int [ R ] ;
  {
    final int i ;
    {
      final File f = file . getParentFile ( ) ;
      final String outFn = fileName + ".in" ;
      final int d = 0 ;
      if ( f . exists ( ) ) {
        final File fi = new File ( outFn ) ;
        for ( String l : f . list ( ) ) {
          if ( l . length ( ) > 6 ) {
            d = Integer . parseInt ( l . substring ( 6 , l . indexOf ( ':' ) ) ) + 1 ;
          }
        }
      }
      final boolean append = false ;
      final File fi = new File ( outFn ) ;
      final File fi = new File ( fi , "a" ) ;
      final int T = fi . nextInt ( ) ;
      final int d = 0 ;
      if ( f . exists ( ) ) {
        d = fi . nextInt ( ) ;
      }
      final File fi = new File ( fi , "b" ) ;
      final File fi = new File ( fi , "c" ) ;
      final int N = fi . nextInt ( ) ;
      final int p = fi . nextInt ( ) ;
      if ( p < 0 ) {
        continue ;
      }
      final String fn = fi . getAbsolutePath ( ) ;
      final int N = fi . nextInt ( ) ;
      final int [ ] t = new int [ N ] ;
      for ( int i = 0 ;
      i < t . length ;
      i ++ ) {
        t [ i ] = i ;
      }
      final int [ ] a = new int [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        a [ i ] = i ;
      }
      final int [ ] a = new int [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        a [ i ] = i ;
      }
      final int [ ] a = new int [ N ] ;
      for ( int i = 0 ;
      i < a . length ;
      i ++ ) {
        a [ i ] = i ;
      }
      final int [ ] a = new int [ N ] ;
      for ( int i = 0 ;
      i < a . length ;
      i ++ ) {
        a [ i ] = i ;
      }
      for ( int i = 0 ;
      i < a . length ;
      i ++ ) {
        a [