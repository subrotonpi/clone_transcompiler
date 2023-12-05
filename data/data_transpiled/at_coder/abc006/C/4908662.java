public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int grand = M % 2 ;
  int child = ( M - 2 * N ) / 2 ;
  int man = N - grand - child ;
  if ( man < 0 || child < 0 ) {
    System . out . println ( "-1 -1 -1" ) ;
  }
  else {
    System . out . println ( man + " " + grand + " " + child ) ;
  }
  return man ;
}
