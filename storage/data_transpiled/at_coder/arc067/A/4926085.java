static final Scanner getScanner ( ) {
  final Scanner ns = new Scanner ( System . in ) ;
  final NumberGenerator ni = new NumberGenerator ( ) {
    @ Override public int getNumberValue ( ) {
      return Integer . parseInt ( ns . next ( ) ) ;
    }
  }
  ;
  final NumberGenerator nm = new NumberGenerator ( ) {
    @ Override public List < Integer > getNumberValue ( ) {
      return Collections . singletonList ( nm . next ( ) ) ;
    }
  }
  ;
  final NumberGenerator nl = new NumberGenerator ( ) {
    @ Override public List < Integer > getNs ( ) {
      return Collections . singletonList ( nm . next ( ) ) ;
    }
  }
  ;
  final NumberGenerator nsl = new NumberGenerator ( ) {
    @ Override public List < String > getNs ( ) {
      return Collections . singletonList ( nsl . next ( ) ) ;
    }
  }
  ;
  {
    int [ ] data = new int [ 2 ] ;
    for ( int i = 2 ;
    i <= n ;
    i ++ ) {
      data [ 0 ] = i ;
    }
    for ( int d : data ) {
      data [ 1 ] = i ;
    }
    int [ ] [ ] data1 = new int [ data . length ] [ 2 ] ;
    for ( int d : data ) {
      data1 [ 0 ] [ d ] = 1 ;
    }
    return data1 ;
  }
}
