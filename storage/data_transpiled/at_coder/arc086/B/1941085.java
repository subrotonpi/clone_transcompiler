public static void print ( int N ) {
  int [ ] a = new int [ N ] ;
  for ( int n : input . split ( " " ) ) {
    a [ n ] = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  }
  List < Step > steps = new ArrayList < Step > ( ) ;
  int aMaxIndex = Collections . max ( Arrays . asList ( a ) , Integer . MAX_VALUE ) ;
  int aMaxIndex = Collections . max ( Arrays . asList ( a ) , Integer . MAX_VALUE ) ;
  int aArgMin = Collections . min ( Arrays . asList ( a ) , Integer . MIN_VALUE ) ;
  int aMin = Collections . min ( Arrays . asList ( a ) , Integer . MIN_VALUE ) ;
  if ( aMaxIndex + aMinIndex >= 0 ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      steps . add ( new Step ( aMaxIndex , i ) ) ;
    }
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) {
      steps . add ( new Step ( i , i + 1 ) ) ;
    }
  }
  else {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      steps . add ( new Step ( aMinIndex , i ) ) ;
    }
    for ( int i = N - 1 ;
    i > 0 ;
    i -- ) {
      steps . add ( new Step ( i , i - 1 ) ) ;
    }
  }
  System . out . println ( 2 * N - 1 ) ;
  for ( Step x : steps ) {
    System . out . println ( x . ordinal ( ) + " " + y . ordinal ( ) ) ;
  }
}
