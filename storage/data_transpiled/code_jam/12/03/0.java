static final String [ ] readIntsArr ( File file , int R ) {
  final String fileName = file . getName ( ) ;
  final int __path__ = file . getParent ( ) ;
  final String __prob__ = file . getName ( ) ;
  final int [ ] res = new int [ R ] ;
  {
    final int i ;
    {
      final File f = new File ( fileName ) ;
      final String outFn = fileName + ".in" ;
      final int d = 0 ;
      if ( f . exists ( ) ) {
        final String l = f . getAbsolutePath ( ) . substring ( 0 , 6 ) ;
        if ( l . contains ( ":" ) ) {
          d = Integer . parseInt ( l . substring ( 6 , l . indexOf ( ":" ) ) ) + 1 ;
        }
      }
      final boolean append = false ;
      final File fi = new File ( outFn ) ;
      {
        final File f = new File ( fi , "a" ) ;
        final int i ;
        final int d = 0 ;
        if ( f . exists ( ) ) {
          d = f . getAbsolutePath ( ) . substring ( 0 , d ) ;
        }
        System . out . println ( "Case #" + i + " of " + T ) ;
        final int i ;
        final boolean append = true ;
        if ( f . exists ( ) ) {
          final String l = f . getAbsolutePath ( ) . substring ( 0 , d ) ;
          if ( l . contains ( ":" ) ) {
            d = Integer . parseInt ( l . substring ( 6 ) ) + 1 ;
          }
        }
        final File fi = new File ( fi , "a" ) ;
        final int i ;
        final boolean append = false ;
        if ( f . exists ( ) ) {
          final String l = f . getAbsolutePath ( ) . substring ( 0 , d ) ;
          if ( l . contains ( ":" ) ) {
            d = f . getAbsolutePath ( ) . substring ( d ) ;
          }
        }
        final int [ ] a = new int [ i ] ;
        if ( s == null ) {
          s = new int [ i ] ;
          f . getAbsolutePath ( ) . substring ( 0 , d ) ;
        }
        final int i ;
        final int [ ] b = new int [ i ] ;
        for ( i = 1 ;
        i < i ;
        i ++ ) {
          b [ i ] = i ;
        }
        res [ i ] = b [ i ] ;
      }
      return res ;
    }
  }
}
