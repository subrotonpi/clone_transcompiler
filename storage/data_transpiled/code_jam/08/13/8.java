static final Commands getCommands ( ) {
  int t = input . nextInt ( ) ;
  for ( int c = 1 ;
  c <= t ;
  c ++ ) {
    int n = input . nextInt ( ) ;
    String s = Commands . getCommands ( /*echo 'scale=2000'
    (3+sqrt(5))^%d' | bc*/
    n ) ;
    t = "000" + s . substring ( 0 , s . indexOf ( "." ) ) ;
    System . out . println ( "Case #" + c + ": " + t . substring ( t . length ( ) - 3 ) ) ;
  }
  return new Commands ( ) ;
}
