@ Pulp public static void pulp ( String ... input ) {
  int tc = Integer . parseInt ( input ) ;
  for ( int t = 0 ;
  t < tc ;
  t ++ ) {
    int n = Integer . parseInt ( input [ 0 ] ) ;
    List < Pair < String , Integer >> sen = new ArrayList < > ( ) ;
    Map < String , Integer > wor = Maps . newHashMap ( ) ;
    LpProblem prob = new LpProblem ( "myProblem" , LpMinimize . class ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      String [ ] ws = input . split ( " " ) ;
      LpVariable s_e = new LpVariable ( "s_" + i + "^E" , 0 , 1 ) ;
      LpVariable s_f = new LpVariable ( "s_" + i + "^F" , 0 , 1 ) ;
      sen . add ( new Pair < > ( s_e , s_f ) ) ;
      prob . add ( new Pair < > ( s_e , s_f ) ) ;
      prob . add ( new Pair < > ( s_e , s_f ) ) ;
      prob . add ( new Pair < > ( s_e , s_f ) ) ;
      prob . add ( new Pair < > ( s_e , s_f ) ) ;
      for ( String w : ws ) {
        LpVariable w_e = wor . putIfAbsent ( w , new Pair < > ( LpVariable . get ( "w^E." + w , 0 , 1 ) , LpVariable . get ( "w^F." + w , 0 , 1 ) ) ) ;
        prob . add ( new Pair < > ( w_e , w_f ) ) ;
      }
    }
    prob . add ( sen . get ( 0 ) . first == 1 ) ;
    prob . add ( sen . get ( 1 ) . second == 1 ) ;
    prob . add ( new LpSum ( a -> a . first + a . second ) ) ;
    prob . add ( new LpSum ( a -> a . first + a . second ) ) ;
  }
  prob . solve ( ) ;
  System . out . println ( "Case #" + ( t + 1 ) + ": " + value ( prob . getObjective ( ) ) ) ;
}
