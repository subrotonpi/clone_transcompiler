static void _ ( ) {
  Scanner s = new Scanner ( System . in ) ;
  int a = 1 ;
  for ( int i : set ( s ) ) a *= s . count ( i ) + 1 ;
  System . out . println ( a / 2 % ( 10 * * 9 + 7 ) - 1 ) ;
}
