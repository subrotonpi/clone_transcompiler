@ VisibleForTesting static void from ( LinkedHashMap < String , Integer > input ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  S = input . nextLine ( ) ;
  m = 10 * * 9 + 7 ;
  Counter c = new Counter ( S ) ;
  int r = 1 ;
  for ( String k : c . keySet ( ) ) {
    r = ( r * ( c . getCount ( k ) + 1 ) ) % m ;
  }
  System . out . println ( ( r - 1 ) % m ) ;
}
