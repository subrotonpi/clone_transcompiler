@ VisibleForTesting static void from ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = copyOf ( Arrays . asList ( input . split ( " " ) ) ) ;
  Map < Integer , Integer > cnt = Maps . newHashMap ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    cnt . put ( a [ i ] , cnt . get ( i ) ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( cnt . keySet ( ) . size ( ) > i ) {
      ans += cnt . keySet ( ) . size ( ) ;
    }
    else if ( cnt . keySet ( ) . size ( ) != i ) {
      ans += cnt . keySet ( ) . size ( ) - i ;
    }
  }
  System . out . println ( ans ) ;
}
