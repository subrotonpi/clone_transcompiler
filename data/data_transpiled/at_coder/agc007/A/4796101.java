public static void main ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  int dist = 0 ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    dist += input . indexOf ( "#" ) ;
  }
  if ( dist == H + W - 1 ) {
    System . out . println ( "Possible" ) ;
  }
  else {
    System . out . println ( "Impossible" ) ;
  }
}
