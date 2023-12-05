public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] A = new int [ N ] [ N ] ;
  for ( int a = 0 ;
  a < N ;
  a ++ ) {
    A [ a ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] [ ] B = new int [ N ] [ N ] ;
  for ( int b = 0 ;
  b < N ;
  b ++ ) {
    B [ b ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] [ ] C = new int [ N ] [ N ] ;
  for ( int c = 0 ;
  c < N ;
  c ++ ) {
    C [ c ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] parts = A ;
  Arrays . sort ( parts , Collections . reverseOrder ( ) ) ;
  int A_count = 0 ;
  int B_count = 0 ;
  int C_count = 0 ;
  for ( int s = 0 ;
  s < N ;
  s ++ ) {
    String t = parts [ s ] [ 0 ] ;
    if ( t . equals ( "C" ) ) C_count ++ ;
    else B_count += C_count ;
    else if ( t . equals ( "B" ) ) B_count += C_count ;
    else if ( t . equals ( "A" ) ) A_count += B_count ;
  }
  System . out . println ( A_count ) ;
  return 0 ;
}
