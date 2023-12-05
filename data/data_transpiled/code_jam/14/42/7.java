static private int indexOf ( List < String > l , String e ) {
  for ( int i = 0 ;
  i < l . size ( ) ;
  i ++ ) {
    if ( l . get ( i ) . equals ( e ) ) {
      return i ;
    }
  }
  if ( className . equals ( "java.util.List" ) ) {
    int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    for ( int t = 0 ;
    t < T ;
    t ++ ) {
      int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      List < String > d = CollectionUtils . toList ( Integer . parseInt ( System . console ( ) . readLine ( ) ) ) ;
      List < String > od = d . subList ( 0 , n ) ;
      Collections . sort ( od ) ;
      int operNeed = 0 ;
      for ( String elm : od ) {
        int idx = indexOf ( d , elm ) ;
        d . remove ( elm ) ;
        operNeed = operNeed + Math . min ( idx - 0 , d . size ( ) - idx ) ;
      }
      System . out . println ( "Case #" + ( t + 1 ) + ": " + operNeed ) ;
    }
  }
  return 0 ;
}
