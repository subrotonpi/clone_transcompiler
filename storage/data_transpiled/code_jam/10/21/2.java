static private int add ( Map < String , Map < String , Integer >> rl ) {
  final String rl = rl . get ( "/" ) ;
  if ( rl . size ( ) == 0 ) return 0 ;
  int ret = 0 ;
  if ( ! rl . containsKey ( "/" ) ) {
    ret = 1 ;
    rl . put ( "/" , new Integer ( rl . get ( "/" ) ) ) ;
  }
  return ret + add ( rl . get ( "/" ) , rl . get ( "/" ) ) ;
}
