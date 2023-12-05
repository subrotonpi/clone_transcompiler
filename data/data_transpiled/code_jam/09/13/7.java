@ String ( filename = "C-large" ) public static void main ( String filename ) throws IOException {
  BufferedReader br = new BufferedReader ( new FileReader ( filename + ".in" ) ) ;
  String line = br . readLine ( ) ;
  br . close ( ) ;
  int MAX = 41 ;
  double [ ] FACT = new double [ MAX ] ;
  /* Find the fact */
  if ( FACT [ n ] != 0 ) {
    return FACT [ n ] ;
  }
  double tot = 1.0 ;
  for ( int x : xrange ( 1 , n + 1 ) ) {
    tot *= x ;
  }
  FACT [ n ] = tot ;
  /* choose the fact */
  if ( k > N ) {
    return ;
  }
  /* choose the fact */
  System . out . println ( choose ( 5 , 0 ) + " " + choose ( 5 , 1 ) + " " + choose ( 5 , 5 ) + " " + choose ( 5 , 7 ) ) ;
  Map < Integer , Double > CACHE = new HashMap < Integer , Double > ( ) ;
  /* choose the fact */
  double sum = 0 ;
  for ( int x : FACT ) {
    sum += 1.0 ;
  }
  System . out . println ( choose ( 5 , 0 ) + " " + choose ( 5 , 1 ) + " " + choose ( 5 , 5 ) + " " + choose ( 5 , 7 ) ) ;
  CACHE . put ( Integer . valueOf ( x ) , sum ) ;
}
