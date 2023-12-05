public static boolean dfs ( int x , int y ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > S = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) S . add ( Collections . singletonList ( input . nextLine ( ) ) ) ;
  List < Boolean > memo = new ArrayList < Boolean > ( ) ;
  for ( int i = 0 ;
  i < W ;
  i ++ ) {
    memo . add ( null ) ;
  }
  /* dfs */
  if ( y >= H || x >= W || S . get ( y ) . charAt ( x ) == '#' ) return true ;
  if ( memo . get ( y ) . get ( x ) != null ) return true ;
  return false ;
}
