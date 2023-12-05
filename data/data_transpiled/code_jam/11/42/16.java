final static String _FMT_ = "Case #" + _FMT_ + ": " + "\n" ;
BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
_T_ = Integer . parseInt ( br . readLine ( ) ) ;
final String result ;
if ( _FMT_ . length ( ) > 0 ) {
  _jobs_ = _T_ / 4 ;
  _jid_ = Integer . parseInt ( _FMT_ . substring ( 0 , _FMT_ . length ( ) - 1 ) ) ;
  _t0_ = _jobs_ * _jid_ ;
  _t1_ = _jobs_ * ( _jid_ + 1 ) ;
  if ( _jid_ == 3 ) _t1_ = _T_ ;
  g = new PrintWriter ( new FileOutputStream ( "out" + _jid_ ) ) ;
}
else {
  _jid_ = - 1 ;
  _t0_ = 0 ;
  _t1_ = _T_ ;
  g = new PrintWriter ( new FileOutputStream ( "out" + _jid_ ) ) ;
}
/* test */
int [ ] [ ] W = new int [ _FMT_ . length ( ) ] [ _FMT_ . length ( ) ] ;
int r1 = 0 ;
int r2 = 0 ;
int c1 = 0 ;
int c2 = 0 ;
double rc = 0.5 * ( r1 + r2 - 1 ) ;
double cc = 0.5 * ( c1 + c2 - 1 ) ;
double totr = 0 ;
double totc = 0 ;
for ( int r = xrange ( r1 , r2 ) ;
r < r0_ ;
r ++ ) {
  for ( int c = xrange ( c1 , c2 ) ;
  c < c0_ ;
  c ++ ) {
    totr += W [ r ] [ c ] * ( r - rc ) ;
    totc += W [ r ] [ c ] * ( c - cc ) ;
  }
  totr -= ( ( W [ r1 ] [ c1 ] + W [ r1 ] [ c2 - 1 ] - W [ r2 - 1 ] [ c1 ] - W [ r2 - 1 ] [ c2 - 1 ] ) * ( r1 - rc ) ) ;
  totc -= ( ( W [ r1 ] [ c1 ] - W [ r1 ] [ c2 - 1 ] + W [ r2 - 1 ] [ c1 ] - W [ r2 - 1 ] [ c2 - 1 ] ) * ( c1 - cc ) ) ;
  return ( Math . abs ( totr ) < 0.001 ? - 1 : 1 ) ;
}
for ( int _t_ = xrange ( _T_ ) ;
_t1_ ++ ) {
  