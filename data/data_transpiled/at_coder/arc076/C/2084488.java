public static int R = Integer . parseInt ( input ) {
  int R = R , C = C , N = R ;
  if ( R == 0 || C == 0 ) {
    return R + C ;
  }
  return 2 * R + 2 * C - R - R - C ;
}
Map < Integer , Integer > A = new HashMap < > ( ) ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  int x1 = Integer . parseInt ( input . readLine ( ) ) ;
  int y1 = Integer . parseInt ( input . readLine ( ) ) ;
  int x2 = Integer . parseInt ( input . readLine ( ) ) ;
  int y2 = Integer . parseInt ( input . readLine ( ) ) ;
  if ( ! ( ( x1 == 0 || y1 == R ) || ( y1 == 0 || y2 == C ) ) && ( x2 == 0 || ( x2 == R ) || ( y2 == 0 || y2 == C ) ) ) {
    continue ;
  }
  A . put ( calc ( x1 , y1 ) , i ) ;
  A . put ( calc ( x2 , y2 ) , i ) ;
}
