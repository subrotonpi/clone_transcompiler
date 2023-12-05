public static void print ( int n ) {
  int [ ] [ ] csf = new int [ n ] [ n - 1 ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    csf [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int totalTime = 0 ;
    for ( int j = i ;
    j < csf . length ;
    j ++ ) {
      int c = csf [ j ] [ i ] ;
      int s = csf [ j ] [ i ] ;
      int f = csf [ j ] [ i ] ;
      int time = 0 ;
      if ( totalTime < s ) time += s - totalTime ;
      else time += ( f - totalTime % f ) % f ;
      time += c ;
      totalTime += time ;
    }
    System . out . println ( totalTime ) ;
  }
}
