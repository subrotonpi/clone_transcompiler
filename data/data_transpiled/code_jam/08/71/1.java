static final boolean DEBUG = false ;
{
  final String [ ] parts = new String [ ] {
  }
  ;
  final List < Object > got = new ArrayList < Object > ( ) ;
  for ( int i : xrange ( parts . length ) ) {
    got . add ( types . get ( i ) . parse ( parts [ i ] ) ) ;
  }
  return got . isEmpty ( ) ;
}
