public static int [ ] getN ( ) {
  Map < String , Integer > l = new HashMap < String , Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String s = input . nextLine ( ) ;
    if ( ! l . containsKey ( s ) ) l . get ( s ) -- ;
  }
  return l . values ( ) ;
}
