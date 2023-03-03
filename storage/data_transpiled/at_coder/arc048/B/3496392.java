public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] participant = new int [ 3 ] [ 3 ] ;
  int [ ] [ ] handList = new int [ 100001 ] [ 100001 ] ;
  int [ ] ratingAcum = new int [ 100001 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    int h = Integer . parseInt ( input . nextLine ( ) ) ;
    participant [ i ] = new int [ r ] ;
    for ( int j = 0 ;
    j < r ;
    j ++ ) {
      int h = Integer . parseInt ( input . nextLine ( ) ) ;
      participant [ i ] [ j ] = new int [ h ] ;
      ratingAcum [ r ] ++ ;
      if ( h == 1 ) {
        handList [ r ] [ 0 ] ++ ;
      }
      else if ( h == 2 ) {
        handList [ r ] [ 1 ] ++ ;
      }
      else {
        handList [ r ] [ 2 ] ++ ;
      }
    }
  }
  @ SuppressWarnings ( "unchecked" ) final List < Integer > ratingAcum = Collections . unmodifiableList ( Arrays . asList ( ratingAcum ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int r = participant [ i ] [ 0 ] ;
    int h = participant [ i ] [ 1 ] ;
    int ac = ratingAcum [ r - 1 ] ;
    int G = handList [ r ] [ 0 ] ;
    int C = handList [ r ] [ 1 ] ;
    int P = handList [ r ] [ 2 ] ;
    if ( h == 1 ) {
      System . out . println ( ac + C + " " + N - ac - G - C + " " + G - 1 ) ;
    }
    else if ( h == 2 ) {
      System . out . println ( ac + P + " " + N - ac - P - C + " " + C - 1 ) ;
    }
    else {
      System . out . println ( ac + G + " " + N - ac - G - P + " " + P - 1 ) ;
    }
  }
  return 0 ;
}
