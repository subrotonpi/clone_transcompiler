public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] c = new int [ n ] ;
  c [ "M" ] = 0 ;
  c [ "A" ] = 0 ;
  c [ "R" ] = 0 ;
  c [ "C" ] = 0 ;
  c [ "H" ] = 0 ;
  String march = "MARCH" ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    String s = input . substring ( 0 , i ) ;
    if ( s . equals ( "M" ) || s . equals ( "A" ) || s . equals ( "R" ) || s . equals ( "C" ) || s . equals ( "H" ) ) {
      c [ s ] ++ ;
    }
  }
  int s = 0 ;
  for ( int i = 0 ;
  i <= 5 ;
  i ++ ) {
    for ( int j = i + 1 ;
    j <= 5 ;
    j ++ ) {
      for ( int k = j + 1 ;
      k <= 5 ;
      k ++ ) {
        s += c [ march . charAt ( i ) ] * c [ march . charAt ( j ) ] * c [ march . charAt ( k ) ] ;
      }
    }
  }
  System . out . println ( s ) ;
}
