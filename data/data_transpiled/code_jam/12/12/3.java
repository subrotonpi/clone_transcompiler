@ VisibleForTesting static < T > T solve ( ) {
  Range < T > range = Range . range ( 0 , range ) ;
  final Collection < T > data = new ArrayList < > ( ) ;
  final Comparator < T > comparator = Comparator . comparing ( range ) ;
  class gcj {
    IN = Thread . currentThread ( ) ;
    byte [ ] buf = null ;
    final Comparator < T > identity = Comparator . comparing ( input -> input . toString ( ) ) ;
    @ SuppressWarnings ( "unchecked" ) final T res ;
    int n = range . size ( ) ;
    int [ ] done = new int [ n ] ;
    int stars = 0 ;
    Collections . sort ( data , comparator ) ;
    while ( stars < target ) {
      boolean ok = false ;
      for ( int i = range . size ( ) ;
      i < n ;
      i ++ ) {
        if ( done [ i ] < 2 && data [ i ] <= stars ) {
          stars += 2 - done [ i ] ;
          ok = true ;
        }
      }
      if ( ok ) {
        continue ;
      }
      for ( int i = range . size ( ) - 1 ;
      i >= 0 ;
      i -- ) {
        if ( done [ i ] == 0 && data [ i ] <= stars ) {
          stars ++ ;
          done [ i ] = 1 ;
          break ;
        }
      }
    }
    return res ;
  }
  @ SuppressWarnings ( "unchecked" ) final T line = ( T ) read ( ) ;
  if ( line == null ) {
    throw new IllegalArgumentException ( ) ;
  }
  @ SuppressWarnings ( "unchecked" ) final T conv = ( T ) read ( ) ;
  return conv . apply ( line . toString ( ) ) ;
  @ SuppressWarnings ( "unchecked" ) final T [ ] splitLine = ( T [ ] ) read ( ) ;
  @ SuppressWarnings ( "unchecked" ) final T [ ] line = splitLine ;
  return Arrays . stream ( line ) . map ( conv ) . filter ( Character :: isWhitespace ) . map ( Character :: isWhitespace ) . map ( conv ) . filter ( Character :: isWhitespace ) . map ( conv ) . map ( conv ) . filter ( Character :: isWhitespace ) . map ( conv ) . map ( conv ) . filter ( Character :: isWhitespace ) . map ( conv ) . map ( conv ) . filter ( Character :: isWhitespace ) . map ( conv ) . map ( conv ) . filter ( Character :: isWhitespace ) . map ( conv ) . map ( conv ) . filter ( Character :: isWhitespace ) . map ( conv ) . map ( conv ) . filter