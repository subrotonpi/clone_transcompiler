@ VisibleForTesting static void from ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a . add ( i ) ;
  }
  Map < Integer , Integer > ac = a . values ( ) ;
  int ans = ac . size ( ) ;
  int count = 0 ;
  for ( int aa : ac . values ( ) ) {
    if ( aa % 2 == 0 ) {
      count ++ ;
    }
  }
  System . out . println ( ans - ( count % 2 ) ) ;
}
