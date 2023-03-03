@ GwtIncompatible ( "java.util.concurrent.atomic.LinkedList" ) private static String sol ( int n , List < List < Integer >> l ) {
  Map < Integer , Integer > c = new HashMap < > ( ) ;
  for ( List < Integer > ll : l ) {
    for ( Integer a : ll ) {
      c . put ( a , ++ n ) ;
    }
  }
  List < String > res = new ArrayList < > ( ) ;
  for ( Map . Entry < Integer , Integer > e : c . entrySet ( ) ) {
    if ( e . getValue ( ) % 2 == 1 ) {
      res . add ( e . getKey ( ) ) ;
    }
  }
  return String . join ( " " , res ) ;
}
