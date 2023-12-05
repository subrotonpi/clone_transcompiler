static final String [ ] args ( ) throws IOException {
  BufferedReader ssr = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  PrintWriter ssw = new PrintWriter ( ssw ) ;
  /* read line */
  String line = ssr . readLine ( ) . trim ( ) ;
  /* read strs */
  String [ ] rdstrs = line . split ( " " ) ;
  /* read ints */
  int [ ] v = new int [ 3 ] ;
  for ( int i = 0 ;
  i < v . length ;
  i ++ ) v [ i ] = rdstrs [ i ] . trim ( ) ;
  /* do one case */
  int cnum = 0 ;
  int [ ] v = new int [ v . length - 1 ] ;
  for ( int i = 0 ;
  i < v . length ;
  i ++ ) v [ i ] = v [ i ] . trim ( ) ;
  final int N = v [ 0 ] . length ( ) ;
  final int S = v [ 0 ] . length ( ) ;
  final int p = v [ 0 ] . length ( ) ;
  final String [ ] t = v [ 3 ] . split ( " " ) ;
  assert t . length == N ;
  int nums = 0 ;
  int numns = 0 ;
  for ( int x = 0 ;
  x < t . length ;
  x ++ ) {
    final int mn = Math . max ( 0 , x / 3 - 1 ) ;
    final int mx = Math . min ( 10 , ( x + 2 ) / 3 + 1 ) ;
    final int [ ] r = new int [ mn ] ;
    for ( int i = 0 ;
    i < mn ;
    i ++ ) {
      r [ i ] = new int [ ] {
        mn , mx }
        ;
      }
      final List < Integer > tplx = new ArrayList < Integer > ( ) ;
      for ( int s1 = 0 ;
      s1 < r . length ;
      s1 ++ ) {
        for ( int s2 = 0 ;
        s2 < r . length ;
        s2 ++ ) {
          for ( int s3 = 0 ;
          s3 < r . length ;
          s3 ++ ) {
            if ( s1 + s2 + s3 == x ) {
              tplx . add ( new Integer ( s1 ) ) ;
            }
          }
        }
      }
      final List < Integer > tpls = new ArrayList < Integer > ( ) ;
      for ( Integer tt : tplx ) {
        if ( Math . max ( tt . intValue ( ) - Math . min ( tt . intValue ( ) ) , 2 )