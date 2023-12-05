@ VisibleForTesting static void from ( LinkedHashMap < Integer , Integer > input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int a : input . split ( " " ) ) {
    A . add ( a ) ;
  }
  Map < Integer , Integer > dp = new HashMap < > ( ) ;
  int s = 0 ;
  int ans = 0 ;
  for ( int a : A ) {
    s += a ;
    ans += dp . get ( s ) ;
    dp . put ( s , ++ a ) ;
  }
  System . out . println ( ans ) ;
}
