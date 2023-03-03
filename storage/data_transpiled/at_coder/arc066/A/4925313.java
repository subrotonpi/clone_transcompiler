static final String getUsage ( ) {
  final String ns = System . getProperty ( "line.separator" ) ;
  final Integer ni = System . getProperty ( "line.separator" ) ;
  final String nm = System . getProperty ( "line.separator" ) ;
  final List < String > nl = Collections . list ( nm ) ;
  final String nsl = System . getProperty ( "line.separator" ) ;
  final int n = ni . intValue ( ) ;
  final String [ ] a = nl . toArray ( new String [ n ] ) ;
  final Counter < String > c = new ClassicCounter < String > ( ) ;
  c . add ( a ) ;
  final int mod = 10 * 9 + 7 ;
  final List < String > val = new LinkedList < String > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    val . add ( n ) ;
  }
  final List < String > key = new LinkedList < String > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    key . add ( n ) ;
  }
  final int check = a . length % 2 ;
  if ( check == 1 ) {
    if ( val . indexOf ( 1 ) != 1 ) {
      System . out . println ( 0 ) ;
      exit ( ) ;
    }
    if ( key . indexOf ( val . indexOf ( 1 ) ) != 0 ) {
      System . out . println ( 0 ) ;
      exit ( ) ;
    }
    else {
      if ( val . indexOf ( 2 ) != val . size ( ) - 1 ) {
        System . out . println ( 0 ) ;
        exit ( ) ;
      }
      else {
        System . out . println ( 2 * ( val . size ( ) ) % mod ) ;
      }
    }
  }
  else {
    if ( val . indexOf ( 2 ) != val . size ( ) ) {
      System . out . println ( 0 ) ;
      exit ( ) ;
    }
    else {
      System . out . println ( 2 * ( val . size ( ) ) % mod ) ;
    }
  }
  return ns + " " + n + " " + a ;
}
