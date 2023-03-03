static final String getString ( ) {
  final BufferedReader ssr = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final BufferedWriter ssw = new BufferedWriter ( new OutputStreamWriter ( System . out ) ) ;
  final double D = - 99 ;
  /* comb */
  if ( L . isEmpty ( ) ) return new String [ ] {
  }
  ;
  final int p1 = L . peek ( ) ;
  final double v1 = ssr . nextDouble ( ) ;
  final double t1 = ssw . nextDouble ( ) ;
  final int p2 = ssr . nextInt ( ) ;
  final double v2 = ssr . nextDouble ( ) ;
  final double t2 = ssw . nextDouble ( ) ;
  final double v3 = v1 + v2 ;
  final double d , mm , t3 ;
  if ( ( p2 - p1 ) < 0.5 * D * v3 ) {
    final double m = 0.5 * D * v3 - ( p2 - p1 ) ;
    if ( t1 < t2 ) {
      d = t2 - t1 ;
      mm = Math . max ( 0 , 0.5 * ( m - d ) ) ;
      t3 = t2 + mm ;
      p3 = p2 + mm - 0.5 * D * v1 ;
    }
    else {
      d = t1 - t2 ;
      mm = Math . max ( 0 , 0.5 * ( m - d ) ) ;
      t3 = t1 + mm ;
      p3 = p1 - mm + 0.5 * D * v2 ;
    }
    L [ L . length - 1 ] = new Double ( p3 ) ;
    L [ 0 ] = new Double ( v3 ) ;
    L [ 1 ] = new Double ( t3 ) ;
  }
  else {
    L [ 0 ] = ssr . nextDouble ( ) ;
  }
  /* do one case */
  final int C = Integer . parseInt ( ssr . readLine ( ) ) ;
  final double [ ] L = new double [ C ] ;
  for ( int i = 0 ;
  i < L . length ;
  i ++ ) {
    final int P = Integer . parseInt ( ssr . readLine ( ) ) ;
    final int V = ssw . nextDouble ( ) ;
    final double t = 0.5 * D * ( V - 1 ) ;
    L [ i ] = new Double ( 1.0 * P ) ;
    L [ i ] . doubleValue ( ) ;
  }
  final double t = Math . max ( 0 , t ) ;
  System . out . println ( "Case #" + cnum + ": " + t + "g" ) ;
  /* main */
  final int N = Integer . parseInt ( ssr . readLine ( ) . trim ( ) ) ;
  