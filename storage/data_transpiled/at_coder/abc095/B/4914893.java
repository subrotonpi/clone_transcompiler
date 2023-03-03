public static int N = Integer . parseInt ( input ) {
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > lists = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int m = Integer . parseInt ( input . nextLine ( ) ) ;
    lists . add ( m ) ;
  }
  X -= lists . size ( ) ;
  if ( X > 0 ) {
    int amari = X / Collections . min ( lists ) ;
    System . out . println ( lists . size ( ) + amari ) ;
  }
  else {
    System . out . println ( lists . size ( ) ) ;
  }
  return N ;
}
