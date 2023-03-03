static final int solve ( ) throws IOException {
  final int MOD = 1000000007 ;
  int tc = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int tmpTC = xrange ( tc ) ;
  tmpTC < tc ;
  tmpTC ++ ) {
    Arrays . fill ( R , ( byte ) ( ( ( int ) ( System . console ( ) . readLine ( ) ) ) & 0xFF ) ) ;
    Arrays . fill ( C , ( byte ) ( ( ( int ) ( System . console ( ) . readLine ( ) ) ) & 0xFF ) ) ;
    /* s3 = (r - 2) * 3; */
    if ( R == 0 ) return 1 ;
    if ( R == 1 ) return 0 ;
    /* s2 = (r - 2) * 6; */
    if ( R == 1 ) return 1 ;
    /* s3 = (r - 1) * 6; */
    if ( 2 <= R && C % 6 == 0 ) {
      if ( R == 0 ) res += s3 ( r - 2 , 6 ) ;
      else if ( R == 3 ) res += s3 ( r - 2 , 6 ) * 3 ;
      else res += s3 ( r - 2 , 6 ) * 6 ;
    }
    if ( 2 <= R && C % 3 == 0 ) {
      if ( R == 0 ) res += s3 ( r - 2 , 3 ) ;
      else if ( R == 3 ) res += s3 ( r - 2 , 3 ) * 3 ;
      else res += s3 ( r - 2 , 6 ) * 3 ;
    }
    if ( 3 <= R && C % 4 == 0 ) res += s3 ( r - 3 , 4 ) * ( R == 4 ? 4 : 1 ) ;
    /* s3 = (r - 3) * (R - 4) * 3; */
    if ( R == 1 ) res += s3 ( r - 1 , 3 ) * 3 ;
    else res += s3 ( r - 1 , 6 ) * 3 ;
    if ( R == 2 ) res += s3 ( r - 2 , 4 ) * 3 ;
    if ( R == 3 ) res += s3 ( r - 2 , 4 ) * ( R == 4 ) ? 4 : 1 ;
  }
  int res = ( s3 ( R , 0 ) + s2 ( R , 0 ) ) % MOD ;
  System . out . println ( "Case #" +