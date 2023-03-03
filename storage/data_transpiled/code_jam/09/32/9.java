public static void main ( String [ ] args ) {
  final int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int testCase = 0 ;
  testCase < T ;
  testCase ++ ) {
    final int N = Integer . parseInt ( readLine ( ) ) ;
    final Vector3 position = new Vector3 ( ) ;
    final Vector3 velocity = new Vector3 ( ) ;
    for ( ;
    testCase < N ;
    testCase ++ ) {
      final double x = Double . parseDouble ( readLine ( ) ) ;
      final double y = Double . parseDouble ( readLine ( ) ) ;
      final double z = Double . parseDouble ( readLine ( ) ) ;
      final double vx = Double . parseDouble ( readLine ( ) ) ;
      final double vy = Double . parseDouble ( readLine ( ) ) ;
      final double vz = Double . parseDouble ( readLine ( ) ) ;
      position . add ( new Vector3 ( x , y , z ) ) ;
      velocity . add ( new Vector3 ( vx , vy , vz ) ) ;
    }
    position . normalize ( ) ;
    velocity . normalize ( ) ;
    final float dMin ;
    final float tMin ;
    if ( velocity . equals ( Vector3 . ZERO ) ) {
      dMin = Math . abs ( position . minus ( Vector3 . ZERO ) ) ;
      tMin = 0.0f ;
    }
    else {
      position = new Vector3 ( position . x , position . y , position . z ) ;
      final Ray3 ray = new Ray3 ( position , velocity ) ;
      final Ray3 . Connection connection = ray . connect ( Vector3 . ZERO ) ;
      dMin = Math . abs ( connection . p1 ) ;
      tMin = Math . abs ( connection . p1 - position ) / Math . abs ( velocity ) ;
    }
    System . out . printf ( "Case #%d: %1.8f %1.8f%n" , testCase + 1 , dMin , tMin ) ;
  }
}
