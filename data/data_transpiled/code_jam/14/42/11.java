public static int solve ( List < Integer > list ) {
  int cost = 0 ;
  while ( list . size ( ) > 0 ) {
    int e = Math . min ( ( ( Integer ) list . get ( 0 ) ) . intValue ( ) , i ) ;
    int swLeft = i ;
    int swRight = ( list . size ( ) - 1 ) - i ;
    cost += Math . min ( swLeft , swRight ) ;
    list . remove ( i ) ;
  }
  return cost ;
  final String infname = System . getProperty ( "line.separator" ) ;
  try {
    BufferedReader inf = new BufferedReader ( new FileReader ( infname ) ) ;
    PrintWriter outf = new PrintWriter ( new FileWriter ( infname . replace ( ".in" , ".out" ) ) ) ;
    int T = Integer . parseInt ( inf . readLine ( ) ) ;
    for ( int t = 1 ;
    t <= T ;
    t ++ ) {
      int n = Integer . parseInt ( inf . readLine ( ) ) ;
      List < Integer > list = CollectionUtils . toArrayList ( inf . readLine ( ) . split ( " " ) ) ;
      outf . println ( "Case #" + t + ": " + solve ( list ) ) ;
    }
  }
  catch ( IOException e ) {
    e . printStackTrace ( ) ;
  }
  return cost ;
}
