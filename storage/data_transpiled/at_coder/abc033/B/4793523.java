public static void atcoder ( String input ) {
  int n = Integer . parseInt ( input ) ;
  String [ ] [ ] sp = new String [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) sp [ i ] = new String [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) sp [ i ] [ 0 ] = input . split ( " " ) ;
  int maxP = 0 ;
  String maxS = "" ;
  int sumP = 0 ;
  for ( int i = 0 ;
  i < sp . length ;
  i ++ ) {
    String s = sp [ i ] [ 0 ] ;
    int p = sp [ i ] [ 1 ] ;
    p = Integer . parseInt ( s ) ;
    sumP += p ;
    if ( maxP < p ) {
      maxP = p ;
      maxS = s ;
    }
  }
  if ( maxP > sumP / 2 ) System . out . println ( maxS ) ;
  else System . out . println ( "atcoder" ) ;
}
