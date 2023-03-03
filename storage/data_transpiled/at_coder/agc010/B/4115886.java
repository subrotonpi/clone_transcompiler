public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > lis = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) lis . add ( Integer . parseInt ( input ) ) ;
  if ( Integer . parseInt ( lis . get ( i ) ) % Integer . MAX_VALUE != 0 ) {
    System . out . println ( "NO" ) ;
    exit ( ) ;
  }
  int key = Integer . parseInt ( lis . get ( i ) ) ;
  List < Integer > li = Lists . newArrayList ( ) ;
  for ( int num : li ) {
    if ( num < 0 || num % n != 0 ) {
      System . out . println ( "NO" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "YES" ) ;
}
