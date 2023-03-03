public static int N ( String input ) {
  int A = Integer . parseInt ( input ) ;
  int X [ ] = new int [ N ] ;
  for ( int x = 0 ;
  x < X ;
  x ++ ) {
    X [ x ] = Integer . parseInt ( input ) - A ;
  }
  Map < Integer , Integer > map = new HashMap < Integer , Integer > ( ) ;
  return map . get ( 0 ) - 1 ;
}
