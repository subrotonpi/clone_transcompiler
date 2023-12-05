@ VisibleForTesting static void setCounter ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  String S = input . nextLine ( ) ;
  List < Integer > counts = new ArrayList < > ( ) ;
  Counter < String > tmpCounter = new Counter < > ( S . substring ( 0 , K ) ) ;
  {
    counts . add ( new Integer ( tmpCounter . getCount ( ) ) ) ;
  }
  {
    counts . add ( new Integer ( N ) ) ;
  }
  {
    counts . add ( new Integer ( N ) ) ;
  }
  {
    counts . add ( 0 ) ;
  }
  for ( int i = 0 ;
  i < N - K ;
  i ++ ) {
    String sExclude = S . substring ( i ) ;
    String sAdd = S . substring ( i + K ) ;
    tmpCounter . setCount ( sExclude ) ;
    tmpCounter . setCount ( sAdd ) ;
  }
  counts . sort ( ) ;
  int tmpCount = counts . get ( 0 ) ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    Integer count = ( Integer ) counts . get ( i ) ;
    if ( tmpCount > 26 ) {
      if ( count . intValue ( ) - tmpCount . intValue ( ) >= K ) {
        System . out . println ( "YES" ) ;
        exit ( ) ;
      }
    }
    else {
      tmpCount = count ;
    }
  }
  System . out . println ( "NO" ) ;
}
