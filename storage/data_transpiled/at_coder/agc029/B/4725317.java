@ VisibleForTesting static void from ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input ) ) ;
  }
  Counter < Integer > ctr = new Counter < Integer > ( A ) ;
  List < Integer > sa = new ArrayList < Integer > ( ctr . keySet ( ) ) ;
  sa . sort ( ) ;
  int ans = 0 ;
  for ( Integer a : sa ) {
    int p = 2 * ( Integer . SIZE - 2 ) ;
    int rem = p - a ;
    int v ;
    if ( a == rem ) {
      v = ctr . getCount ( a ) / 2 ;
    }
    else {
      v = Math . min ( ctr . getCount ( a ) , ctr . getCount ( rem ) ) ;
    }
    ans += v ;
    ctr . getCount ( a ) - = v ;
    ctr . setCount ( rem ) - = v ;
  }
  System . out . println ( ans ) ;
}
