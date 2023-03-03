public static String solve ( String pancakeStr , int k ) {
  char [ ] pancakes = new char [ pancakeStr . length ( ) ] ;
  for ( int i = 0 ;
  i < pancakes . length ;
  i ++ ) {
    if ( pancakes [ i ] == '-' ) {
      flipCount ++ ;
      for ( int j = i ;
      j < i + k ;
      j ++ ) {
        if ( j >= pancakes . length ) {
          return "IMPOSSIBLE" ;
        }
        pancakes [ j ] = pancakes [ j ] == '-' ? '+' : '-' ;
      }
    }
  }
  return String . valueOf ( flipCount ) ;
}
int caseCount = input . nextInt ( ) ;
for ( int i = 1 ;
i <= caseCount ;
i ++ ) {
  String s = input . nextLine ( ) ;
  int k = Integer . parseInt ( s ) ;
  System . out . println ( "Case #" + i + ": " + solve ( s , k ) ) ;
}
