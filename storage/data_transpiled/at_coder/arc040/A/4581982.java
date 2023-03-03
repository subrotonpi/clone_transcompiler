public static void print ( String s ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = 0 , t = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s = input . nextLine ( ) ;
    t += s . indexOf ( "R" ) ;
    a += s . indexOf ( "B" ) ;
  }
  if ( t == a ) {
    System . out . println ( "DRAW" ) ;
  }
  else if ( t > a ) {
    System . out . println ( "TAKAHASHI" ) ;
  }
  else {
    System . out . println ( "AOKI" ) ;
  }
}
