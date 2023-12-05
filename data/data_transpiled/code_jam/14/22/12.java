public static int input ( ) {
  final Map < Integer , Integer > seen = new HashMap < Integer , Integer > ( ) ;
  {
    int maxlen = Math . max ( da . length ( ) , db . length ( ) , dk . length ( ) ) ;
    if ( maxlen == 0 ) {
      return 0 ;
    }
    int da = ( maxlen - da . length ( ) ) * '0' + da ;
    int db = ( maxlen - db . length ( ) ) * '0' + db ;
    int dk = ( maxlen - dk . length ( ) ) * '0' + dk ;
    if ( seen . containsKey ( new Integer ( da ) ) ) {
      return seen . get ( new Integer ( da ) ) ;
    }
    if ( dk . equals ( "0" ) && db . equals ( "0" ) ) {
      int ans = solve ( da , db , dk ) ;
      seen . put ( new Integer ( da ) , ans ) ;
      return ans ;
    }
    if ( da . equals ( "1" ) && db . equals ( "1" ) ) {
      int ans = solve ( da , db , dk ) + solve ( da , db , dk ) ;
      seen . put ( new Integer ( da ) , ans ) ;
      return ans ;
    }
    if ( da . equals ( "1" ) && db . equals ( "1" ) ) {
      int ans = solve ( da , db , dk ) + solve ( da , db , dk ) ;
      seen . put ( new Integer ( da ) , ans ) ;
      return ans ;
    }
    if ( da . equals ( "1" ) && db . equals ( "1" ) ) {
      int ans = solve ( da , db , dk ) + solve ( da , db , dk ) ;
      seen . put ( new Integer ( da ) , ans ) ;
      return ans ;
    }
    if ( da . equals ( "1" ) && db . equals ( "1" ) ) {
      int ans = solve ( da , db , dk ) + solve ( da , db , dk ) ;
      seen . put ( new Integer ( da ) , ans ) ;
      return ans ;
    }
    if ( da . equals ( "1" ) && db . equals ( "1" ) ) {
      int ans = solve ( da , db , dk ) + solve ( da , db , dk ) ;
      seen . put ( new Integer ( da ) , ans ) ;
      return ans ;
    }
  }
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    int ans = solve ( da , db , dk ) + solve ( da , db , dk ) + solve ( da , db , dk ) ;
    seen