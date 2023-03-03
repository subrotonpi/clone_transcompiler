static final java . util . Random random = new java . util . Random ( ) {
  private static final long serialVersionUID = 1L ;
  private static final long serialVersionUID = 1L ;
  private static final long serialVersionUID = 1L ;
  private static final String dataFile = "probs.pkl" ;
  private static final String [ ] badShuffles ( ) {
    List < Integer > nums = new LinkedList < > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      nums . add ( Integer . parseInt ( i ) ) ;
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int randint = random . nextInt ( N ) ;
      Integer swap = nums . get ( i ) ;
      nums . set ( i , nums . get ( randint ) ) ;
      nums . set ( randint , swap ) ;
    }
    return nums . toArray ( new Integer [ 0 ] ) ;
  }
  private static String goodShuffles ( ) {
    List < Integer > nums = new LinkedList < > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      nums . add ( i ) ;
    }
    Collections . shuffle ( nums ) ;
    return nums . toString ( ) ;
  }
  public static String [ ] [ ] profileGoodShuffles ( ) {
    List < List < Integer >> occurrences = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      occurrences . add ( new LinkedList < > ( ) {
        {
          add ( 1.0 / N ) ;
        }
      }
      ) ;
    }
    return occurrences . toArray ( new List [ 0 ] ) ;
  }
  public static String [ ] [ ] profileBadShuffles ( int trials ) {
    List < List < Integer >> occurrences = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < trials ;
    i ++ ) {
      int [ ] lst = badShuffles ( ) ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        occurrences . get ( i ) . add ( lst [ j ] ++ ) ;
      }
    }
    for ( int i = 0 ;
    i < occurrences . size ( ) ;
    i ++ ) {
      occurrences . get ( i ) . add ( ( double ) occurrences . get ( i ) . get ( ) / trials ) ;
    }
    return occurrences . toArray ( new List [ 0 ] ) ;
  }
  public static String [ ] [ ] logify ( List < List < Integer >> table ) {
    for ( int i = 0 ;
    i < table . size ( ) ;
    i ++