static final Scanner rl = new Scanner ( System . in ) {
  @ Override public void nextLine ( ) {
  }
}
;
final int t = Integer . parseInt ( rl . nextLine ( ) ) ;
for ( int cc = 0 ;
cc < t ;
cc ++ ) {
  final int chicks = Integer . parseInt ( rl . nextLine ( ) ) ;
  final int deliver = Integer . parseInt ( rl . nextLine ( ) ) ;
  final int barn = Integer . parseInt ( rl . nextLine ( ) ) ;
  final int timeLimit = Integer . parseInt ( rl . nextLine ( ) ) ;
  final int [ ] location = Integer . parseInt ( rl . nextLine ( ) ) ;
  final int [ ] speed = Integer . parseInt ( rl . nextLine ( ) ) ;
  int ret = 0 ;
  int delivered = 0 ;
  int lagging = 0 ;
  for ( int i = chicks - 1 ;
  i >= 0 ;
  i -- ) {
    if ( barn - location [ i ] <= timeLimit * speed [ i ] ) {
      delivered ++ ;
      ret += lagging ;
      if ( delivered == deliver ) break ;
      else lagging ++ ;
    }
  }
  System . out . println ( "Case #" + ( cc + 1 ) + ":" ) ;
  if ( delivered < deliver ) System . out . println ( "IMPOSSIBLE" ) ;
  else System . out . println ( ret ) ;
}
