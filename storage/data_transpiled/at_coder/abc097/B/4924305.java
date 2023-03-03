public static void main ( String input ) {
  int X = Integer . parseInt ( input ) ;
  ArrayList < Integer > ans = new ArrayList < Integer > ( ) ;
  for ( int b = 1 ;
  b < X / 2 ;
  b ++ ) {
    for ( int p = 2 ;
    p < X / 2 ;
    p ++ ) {
      int t = b * p ;
      if ( ( t <= X ) && ( t <= X ) ) {
        ans . add ( t ) ;
      }
    }
  }
  if ( ( ans . size ( ) == 0 ) && ( ans . size ( ) == 0 ) ) {
    System . out . println ( 1 ) ;
  }
  else {
    System . out . println ( Collections . max ( ans ) ) ;
  }
}
