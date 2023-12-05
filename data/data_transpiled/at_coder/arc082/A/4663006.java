@ VisibleForTesting static void from ( String input ) {
  int n = Integer . parseInt ( input ) ;
  Map < String , Integer > map = map ( map ( input ) ) ;
  int cnt = 0 ;
  for ( String i : map . keySet ( ) ) {
    int new = map . getOrDefault ( i , 0 ) + map . getOrDefault ( i - 1 , 0 ) + map . getOrDefault ( i + 1 , 0 ) ;
    if ( new > cnt ) {
      cnt = new ;
    }
  }
  System . out . println ( cnt ) ;
}
