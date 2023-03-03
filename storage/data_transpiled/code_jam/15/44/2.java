static final Map < Key , Long > buf = new HashMap < Key , Long > ( ) {
  private final Map < Key , Long > buf = new HashMap < Key , Long > ( ) ;
  private final long gcd = ( long ) ( b % a ) ;
  private final long gcdlcm = gcd ( b , a ) ;
  private final long gcdlcm = gcd ( b , a ) ;
  private long dp ( final long C , final int remaining , final int lastType , final int repeat ) {
    if ( remaining == 0 ) return 1 ;
    final Key key = new Key ( remaining , lastType , repeat ) ;
    if ( buf . containsKey ( key ) ) return buf . get ( key ) ;
    long total = 0 ;
    if ( lastType != 3 && remaining >= 2 ) total += dp ( C , remaining - 2 , 3 , repeat ) ;
    if ( lastType != 12 ) {
      total += dp ( C , remaining - 1 , 12 , repeat ) ;
      if ( remaining >= 2 && C % 3 == 0 ) {
        final long n = gcdlcm ( repeat , 3 ) ;
        final long newRepeat = ( remaining - 2 ) ;
        total += n * dp ( C , remaining - 2 , 12 , newRepeat ) ;
      }
      if ( remaining >= 2 && C % 6 == 0 ) {
        final long n = gcdlcm ( repeat , 6 ) ;
        final long newRepeat = ( remaining - 2 ) ;
        total += n * dp ( C , remaining - 2 , 12 , newRepeat ) ;
      }
      if ( remaining >= 3 && C % 4 == 0 ) {
        final long n = gcdlcm ( repeat , 4 ) ;
        final long newRepeat = ( remaining - 3 ) ;
        total += n * dp ( C , remaining - 3 , 12 , newRepeat ) ;
      }
    }
    buf . put ( key , total % 1000000007 ) ;
    return buf ;
  }
  private long compute ( final long R , final long C ) {
    buf . clear ( ) ;
    return dp ( C , R , 0 , 1 ) ;
  }
  private long parse ( ) {
    long R = Long . parseLong ( System . console ( ) . readLine ( ) ) ;
    long C = Long . parseLong ( System . console ( ) . readLine ( ) ) ;
    if ( __name__ . equals ( "java" ) ) {
      System . setSecurityManager ( new SecurityManager ( ) {
        public void checkPermission ( Permission permission ) {
        }
      }
      ) ;
      int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      