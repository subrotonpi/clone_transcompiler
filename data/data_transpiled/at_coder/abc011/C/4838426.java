public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > NG = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    NG . add ( Integer . parseInt ( input ) ) ;
  }
  for ( int i = 0 ;
  i < 100 ;
  i ++ ) {
    if ( NG . contains ( N ) ) {
      break ;
    }
    if ( N <= 3 ) {
      N = 0 ;
      break ;
    }
    for ( int j = 3 ;
    j <= 2 ;
    j ++ ) {
      if ( ! NG . contains ( N - j ) ) {
        N -= j ;
        break ;
      }
    }
  }
  if ( N == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
