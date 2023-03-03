public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  List < Integer > tAndD = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    tAndD . add ( Integer . parseInt ( input ) ) ;
  }
  Collections . sort ( tAndD , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return o2 . compareTo ( o1 ) ;
    }
  }
  ) ;
  List < Integer > overStock = new ArrayList < > ( ) ;
  Set < Integer > typeSet = new HashSet < > ( ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    int tI = tAndD . get ( i ) ;
    int dI = tAndD . get ( i ) ;
    if ( typeSet . contains ( tI ) ) {
      overStock . add ( dI ) ;
    }
    else {
      typeSet . add ( tI ) ;
    }
  }
  int x = typeSet . size ( ) ;
  int point = Integer . valueOf ( x ) ;
  pointMax = point ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    int tI = tAndD . get ( i ) ;
    int dI = dI ;
    if ( overStock . size ( ) > 0 ) {
      if ( typeSet . contains ( tI ) ) {
        continue ;
      }
      else {
        int diff = ( x + 1 ) * x - x * x + dI - overStock . remove ( tI ) ;
        typeSet . add ( tI ) ;
        x ++ ;
        point += diff ;
        pointMax = Math . max ( pointMax , point ) ;
      }
    }
  }
  System . out . println ( pointMax ) ;
}
