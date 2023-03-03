public static void inFile ( File file ) throws IOException {
  FileWriter out = new FileWriter ( file ) ;
  int T = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
  for ( int t = xrange ( T ) ;
  t < T ;
  t ++ ) {
    int X = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
    int S = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
    int R = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
    int runtime = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
    int N = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
    int runBonus = R - S ;
    double [ ] speeds = new double [ N ] , lengths = new double [ N ] ;
    ArrayList < Pair < Integer , Integer >> walKways = new ArrayList < Pair < Integer , Integer >> ( N ) ;
    for ( int i = xrange ( N ) ;
    i < X ;
    i ++ ) {
      int B = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
      int E = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
      int w = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
      walKways . add ( new Pair < Integer , Integer > ( w + S , E - B ) ) ;
    }
    double sumLens = Double . parseDouble ( walKways . get ( 1 ) . second ) ;
    walKways . add ( new Pair < Integer , Integer > ( S , X - sumLens ) ) ;
    walKways = new ArrayList < Pair < Integer , Integer >> ( walKways ) ;
    Collections . sort ( walKways ) ;
    double answer = 0.0 ;
    for ( Pair < Integer , Integer > pair : walKways ) {
      int speed = pair . first ;
      int distance = pair . second ;
      double curRuntime = Math . min ( distance / ( double ) ( speed + runBonus ) , ( double ) runtime ) ;
      runtime -= curRuntime ;
      answer += curRuntime + ( ( distance - ( speed + runBonus ) * curRuntime ) / ( double ) speed ) ;
    }
    out . write ( String . format ( "Case #%d: %.9f\n" , t + 1 , answer ) ) ;
  }
}
