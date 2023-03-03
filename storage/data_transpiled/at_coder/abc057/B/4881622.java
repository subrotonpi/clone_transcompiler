public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > X = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) X . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  List < Integer > check = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) check . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  for ( int x = 0 ;
  x < X . size ( ) ;
  x ++ ) {
    int y = X . get ( x ) ;
    List < Integer > dist = new ArrayList < > ( ) ;
    for ( int c : check ) dist . add ( Math . abs ( x - c . x ) + Math . abs ( y - c . y ) ) ;
    int MIN = Collections . min ( dist ) ;
    System . out . println ( dist . indexOf ( MIN ) + 1 ) ;
  }
  return MIN ;
}
