@ GwtIncompatible ( "java.lang.ref.WeakReference" ) public static void main ( final String [ ] args ) throws IOException {
  final int [ ] args = new int [ args . length ] ;
  System . arraycopy ( args , 0 , args , 0 , args . length ) ;
  final int dp = args [ 0 ] ;
  System . arraycopy ( args , 1 , args , 0 , args . length ) ;
  final int res = args [ 0 ] ;
  if ( args . length > 1 ) {
    return ;
  }
  if ( args . length == 2 && args [ 1 ] == 0 ) {
    return ;
  }
  if ( args . length == 3 ) {
    return ;
  }
  if ( args . length == 4 ) {
    return ;
  }
  if ( args . length == 5 ) {
    return ;
  }
  final int res = ( dp * args [ 0 ] ) + ( dp * args [ 1 ] ) ;
  System . arraycopy ( args , 2 , res , args . length , 4 ) ;
  if ( args . length == 4 ) {
    return ;
  }
  if ( args . length == 5 ) {
    return ;
  }
  final int res = ( dp * args [ 0 ] ) + ( dp * args [ 1 ] ) ;
  System . arraycopy ( args , 0 , res , args . length , 4 ) ;
  System . arraycopy ( args , 0 , res , args . length , 4 ) ;
  System . arraycopy ( args , 0 , res , args . length , 4 ) ;
}
