@ VisibleForTesting static int bfs ( int startx , int starty ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int sy = Integer . parseInt ( input . nextLine ( ) ) ;
  int sx = Integer . parseInt ( input . nextLine ( ) ) ;
  int gy = Integer . parseInt ( input . nextLine ( ) ) ;
  int gx = Integer . parseInt ( input . nextLine ( ) ) ;
  char [ ] [ ] maze = new char [ H ] [ ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) maze [ i ] = input . toCharArray ( ) ;
  return bfs ( startx , starty , 0 ) ;
}
