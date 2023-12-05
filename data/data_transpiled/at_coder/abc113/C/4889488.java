public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > list = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    list . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int now = 0 ;
  int num = 0 ;
  Map < Pair , Integer > map = Maps . newHashMap ( ) ;
  for ( int p = 0 ;
  p < M ;
  p ++ ) {
    int y = list . get ( p ) ;
    if ( now != p ) {
      now = p ;
      num = 1 ;
    }
    map . put ( Pair . of ( p , y ) , num ) ;
    num ++ ;
  }
  for ( int p = 0 ;
  p < M ;
  p ++ ) {
    int y = list . get ( p ) ;
    System . out . println ( p + ":" + map . get ( Pair . of ( p , y ) ) ) ;
  }
  return num ;
}
