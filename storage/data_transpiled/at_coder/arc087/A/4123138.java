@ VisibleForTesting static void from ( LinkedHashMap < Integer , Integer > input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( input . get ( i ) ) ;
  }
  Map < Integer , Integer > C = new HashMap < Integer , Integer > ( A ) ;
  int ans = 0 ;
  for ( Map . Entry < Integer , Integer > entry : C . entrySet ( ) ) {
    if ( entry . getValue ( ) > i ) {
      ans += entry . getValue ( ) - i . getKey ( ) ;
    }
    else if ( entry . getValue ( ) < i ) {
      ans += entry . getValue ( ) ;
    }
  }
  System . out . println ( ans ) ;
}
