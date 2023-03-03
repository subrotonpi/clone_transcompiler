@ VisibleForTesting static boolean isPossible ( List < Integer > solution ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = input . nextLine ( ) ;
  Map < Integer , Integer > counters = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    counters . put ( i + 1 , Integer . valueOf ( s . charAt ( i ) ) ) ;
  }
  /* possible */
  return true ;
}
