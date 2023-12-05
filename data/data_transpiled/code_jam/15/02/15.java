public static int MAXP = 1001 ;
int best = MAXP ;
for ( int level = 1 ;
level < MAXP ;
level ++ ) {
  int moves = 0 ;
  for ( int p : P ) {
    moves += ( p - 1 ) / level ;
  }
  if ( moves + level < best ) {
    best = moves + level ;
  }
}
int T = input . nextInt ( ) ;
for ( int t = 1 ;
t <= T ;
t ++ ) {
  String D = input . nextLine ( ) ;
  int P = map . get ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int s = solve ( P ) ;
  System . out . println ( "Case #" + t + ": " + s ) ;
}
