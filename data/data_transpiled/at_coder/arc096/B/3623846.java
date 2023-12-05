public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  List < List < Integer >> lis = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) lis . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  int ans = 0 ;
  int num = 0 ;
  int nu = 0 ;
  int cou = 0 ;
  int co = 0 ;
  int go ;
  List < Integer > left = new ArrayList < > ( ) ;
  List < Integer > right = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    num += lis . get ( i ) . get ( 1 ) ;
    go = lis . get ( i ) . get ( 0 ) ;
    ans = Math . max ( ans , num - go ) ;
    if ( cou < num - go ) {
      cou = num - go ;
      left . add ( new Integer ( go ) ) ;
      left . add ( new Integer ( num ) ) ;
    }
    else {
      try {
        left . add ( left . get ( left . size ( ) - 1 ) ) ;
      }
      catch ( Exception e ) {
        left . add ( new Integer ( 0 ) ) ;
      }
    }
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    nu += lis . get ( i ) . get ( 1 ) ;
    go = c - lis . get ( i ) . get ( 0 ) ;
    ans = Math . max ( ans , nu - go ) ;
    if ( co < nu - go ) {
      co = nu - go ;
      right . add ( new Integer ( go ) ) ;
      right . add ( new Integer ( nu ) ) ;
    }
    else {
      try {
        right . add ( right . get ( right . size ( ) - 1 ) ) ;
      }
      catch ( Exception e ) {
        right . add ( new Integer ( 0 ) ) ;
      }
    }
    int gone = 0 ;
    int gon = 0 ;
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      gone += lis . get ( i ) . get ( 1 ) ;
      ans = Math . max ( ans , gone + right . get ( n - i - 2 ) . get ( 1 ) - lis . get ( i ) . get ( 0 ) * 2 - right . get ( n - i - 2 ) . get ( 0 ) ) ;
    }
    ans = Math