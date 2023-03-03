public static int N ( Scanner input ) {
  int M = input . nextInt ( ) ;
  List < Integer > py = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    py . add ( Collections . singletonList ( input . nextInt ( ) ) ) ;
  }
  Map < Pair < Integer , Integer > , Integer > map = new HashMap < > ( ) ;
  int now = 0 ;
  int num = 0 ;
  for ( int p = 0 ;
  p < py . size ( ) ;
  p ++ ) {
    int y = py . get ( p ) ;
    if ( now != y ) {
      now = y ;
      num = 1 ;
    }
    map . put ( Pair . of ( p , y ) , num ) ;
    num ++ ;
  }
  for ( int p = 0 ;
  p < py . size ( ) ;
  p ++ ) {
    int y = py . get ( p ) ;
    System . out . println ( p + ":" + map . get ( Pair . of ( p , y ) ) ) ;
  }
  return num ;
}
