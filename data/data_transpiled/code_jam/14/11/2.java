@ GwtIncompatible ( "java.util.Scanner" ) private static Iterable < Integer > line ( ) {
  return map ( Integer :: parseInt , Integer :: parseInt , Integer :: parseInt , Integer :: sum ) ;
  /* String sLine = System.getProperty("line.separator"); */
  int T = line . indexOf ( ' ' ) ;
  for ( T = xrange ( 1 , T + 1 ) ;
  T <= 0 ;
  T ++ ) {
    int N = line . indexOf ( ' ' ) ;
    int L = line . indexOf ( ' ' ) ;
    List < Integer > A = new ArrayList < > ( ) ;
    for ( int a : sLine . split ( " " ) ) {
      A . add ( Integer . parseInt ( a , 2 ) ) ;
    }
    List < Integer > B = new ArrayList < > ( ) ;
    for ( int b : sLine . split ( " " ) ) {
      B . add ( Integer . parseInt ( b , 2 ) ) ;
    }
    Set < Integer > C = null ;
    for ( Integer a : A ) {
      Set < Integer > D = new HashSet < > ( ) ;
      for ( Integer b : B ) {
        D . add ( a . intValue ( ) ^ b . intValue ( ) ) ;
      }
      if ( C == null ) {
        C = D ;
      }
      else {
        C = C . retainAll ( D ) ;
      }
    }
    if ( C . size ( ) == 0 ) {
      System . out . println ( String . format ( "Case #%d: NOT POSSIBLE" , T ) ) ;
    }
    else {
      List < Integer > list = new ArrayList < > ( ) ;
      for ( Integer c : C ) {
        list . add ( Integer . valueOf ( c ) ) ;
      }
      list . add ( c . replace ( "0" , "" ) ) ;
      list . add ( c . length ( ) ) ;
      System . out . println ( String . format ( "Case #%d: %d" , T , min ( list ) ) ) ;
    }
  }
  return null ;
}
