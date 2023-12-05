public static void main ( String testClass , Range range ) {
  int N = Integer . parseInt ( readLine ( ) ) ;
  int M = Integer . parseInt ( readLine ( ) ) ;
  int [ ] [ ] lawn = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) lawn [ i ] = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) lawn [ i ] = Integer . parseInt ( readLine ( ) ) ;
  boolean bad = false ;
  for ( int height : Range . values ( 100 , 0 , - 1 ) ) {
    boolean goodRows [ ] = new boolean [ N ] ;
    boolean goodCols [ ] = new boolean [ M ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) if ( Math . max ( lawn [ i ] [ i ] , height ) <= height ) goodRows [ i ] = true ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      int most = 0 ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) most = Math . max ( most , lawn [ i ] [ j ] ) ;
      if ( most <= height ) goodCols [ j ] = true ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) for ( int j = 0 ;
      j < M ;
      j ++ ) if ( lawn [ i ] [ j ] <= height && ! ( goodRows [ i ] || goodCols [ j ] ) ) bad = true ;
    }
  }
  System . out . println ( "Case #" + testClass + ": " + ( bad ? "NO" : "YES" ) ) ;
}
