public static int H = Integer . parseInt ( input ) {
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  Map < Integer , Integer > z = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( z . getOrDefault ( x , 10 * 6 ) > y ) z . put ( x , y ) ;
  }
  int length = 1 ;
  for ( int x = 1 ;
  x < H ;
  x ++ ) {
    if ( z . getOrDefault ( x , 10 * 6 ) <= length ) z . put ( x , y ) ;
  }
  return length ;
}
