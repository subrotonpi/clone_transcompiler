public static int SUBMIT = 0 ;
int REQUEST = 1 ;
int _T = Integer . parseInt ( readLine ( ) ) ;
for ( int _t = 1 ;
_T <= _T ;
_t ++ ) {
  String S = readLine ( ) ;
  Stack < Integer > Q = new Stack < Integer > ( ) ;
  int res = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    int action ;
    if ( Q . size ( ) == 0 ) {
      action = REQUEST ;
    }
    else if ( S . charAt ( i ) == Q . peek ( ) ) {
      action = SUBMIT ;
    }
    else if ( Q . size ( ) >= S . length ( ) - i ) {
      action = SUBMIT ;
    }
    else {
      action = REQUEST ;
    }
    if ( action == REQUEST ) {
      Q . push ( S . charAt ( i ) ) ;
    }
    else {
      res += S . charAt ( i ) == Q . peek ( ) ? 10 : 5 ;
      Q . pop ( ) ;
    }
  }
  System . out . println ( "Case #" + _t + ": " + res ) ;
}
