@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static String oneTest ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > a = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < 2 * n - 1 ;
  i ++ ) {
    a . addAll ( Ints . fromByteArray ( input . nextLine ( ) . split ( " " ) ) ) ;
  }
  Map < Integer , Integer > c = new HashMap < > ( a ) ;
  List < String > ans = new ArrayList < > ( ) ;
  for ( Map . Entry < Integer , Integer > entry : c . entrySet ( ) ) {
    if ( entry . getValue ( ) % 2 == 1 ) {
      ans . add ( entry . getKey ( ) ) ;
    }
  }
  return Joiner . on ( ' ' ) . join ( ans ) ;
}
