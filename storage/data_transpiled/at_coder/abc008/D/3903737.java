static final int [ ] [ ] getStdin ( ) {
  final int [ ] [ ] stdin = new int [ 10 ] [ 5 ] ;
  System . setIn ( stdin ) ;
  final int [ ] [ ] li = new int [ stdin . length ] [ ] ;
  System . setIn ( stdin [ 0 ] ) ;
  final int [ ] [ ] li_ = new int [ stdin . length ] [ ] ;
  System . setIn ( stdin [ 1 ] ) ;
  final int [ ] lf = new int [ stdin . length ] [ ] ;
  System . setIn ( stdin [ 2 ] ) ;
  final int [ ] ls = new int [ stdin . length ] [ ] ;
  System . arraycopy ( stdin [ 0 ] , 0 , ls , 0 , stdin . length ) ;
  final String [ ] ns = new String [ stdin . length ] ;
  System . arraycopy ( stdin [ 0 ] , 0 , ns , 0 , stdin . length ) ;
  final List < String > lc = new LinkedList < String > ( ) ;
  for ( int i = 0 ;
  i < ns . length ;
  i ++ ) {
    lc . add ( ns [ i ] ) ;
  }
  final int ni = Integer . parseInt ( stdin [ stdin . length - 1 ] ) ;
  final float nf = Float . parseFloat ( stdin [ stdin . length - 1 ] ) ;
  final int [ ] [ ] search = new int [ ] [ ] {
    int . MAX_VALUE , int . MAX_VALUE , int . MIN_VALUE , int . MAX_VALUE , int . MIN_VALUE , int . MAX_VALUE , int . MIN_VALUE }
    ;
    if ( ( east [ 0 ] == 0 ) && ( south [ 0 ] == 0 ) && ( west [ 0 ] == 0 ) && ( north [ 0 ] == 0 ) ) {
      return memo [ ( east [ 0 ] ) ? 0 : - 1 ] ;
    }
    final List < Integer > cands = new ArrayList < Integer > ( ) ;
    for ( int i = 0 ;
    i < cands . size ( ) ;
    i ++ ) {
      final int xcand = xy [ i ] ;
      final int ycand = xy [ i ] ;
      if ( east [ i ] <= xcand && west [ i ] <= south && west [ i ] <= ycand && north [ i ] <= 0 ) {
        cands . add ( new Integer ( xcand ) ) ;
      }
    }
    if ( cands . size ( ) == 0 ) {
      return 0 ;
    }
    int temp = 0 ;
    for ( int i = 0 ;
    i < c @ @