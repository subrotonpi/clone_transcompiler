public static void main ( String input ) {
  int nMou = Integer . parseInt ( input ) ;
  LinkedList < Integer > lMou = Lists . newLinkedList ( ) ;
  for ( int i = 0 ;
  i < nMou ;
  i ++ ) {
    lMou . add ( Integer . parseInt ( input ) ) ;
  }
  int [ ] [ ] lMouInd = new int [ nMou ] [ ] ;
  for ( int i = 0 ;
  i < nMou ;
  i ++ ) {
    lMouInd [ i ] = new int [ ] {
      lMou [ i ] , i }
      ;
    }
    Arrays . sort ( lMouInd ) ;
    int [ ] lAns = new int [ nMou ] ;
    for ( int i = 0 ;
    i < nMou ;
    i ++ ) {
      lAns [ i ] = 0 ;
    }
    lAns [ 0 ] = lMouInd [ 0 ] [ 0 ] * nMou ;
    int minIndex = lMouInd [ nMou - 1 ] [ 1 ] ;
    for ( int i = nMou - 1 ;
    i > 0 ;
    i -- ) {
      minIndex = Math . min ( minIndex , lMouInd [ i ] [ 1 ] ) ;
      if ( lMouInd [ i - 1 ] [ 0 ] != lMouInd [ i ] [ 0 ] ) {
        lAns [ minIndex ] += ( lMouInd [ i ] [ 0 ] - lMouInd [ i - 1 ] [ 0 ] ) * ( nMou - i ) ;
      }
    }
    for ( int i = 0 ;
    i < nMou ;
    i ++ ) {
      System . out . println ( lAns [ i ] ) ;
    }
  }
  