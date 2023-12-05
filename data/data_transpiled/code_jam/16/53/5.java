static final boolean solve ( ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  final int N = scanner . nextInt ( ) ;
  final int [ ] [ ] asteroids = new int [ N ] [ ] ;
  final int [ ] asteroidSpeed = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    asteroids [ i ] = scanner . nextInt ( ) ;
  }
  final int MOD = 10 * 9 + 7 ;
  final float INF = Float . parseFloat ( "+inf" ) ;
  final int anFast = scanner . nextInt ( ) ;
  if ( scanner . hasNextInt ( ) ) {
    anFast = scanner . nextInt ( ) ;
    if ( anFast != 0 ) {
      System . out . println ( "BAD" + anFast + ": " + anFast ) ;
      quit ( ) ;
    }
  }
  System . out . println ( "Case #" + t + ": " + anFast ) ;
  final Function < Integer , Double > pr = scanner . next ( ) ;
  final Function < Integer , Double > epr = scanner . next ( ) ;
  final Function < Integer , Double > die = scanner . next ( ) ^ exit ( 0 ) ;
  final Function < Integer , Double > readStr = scanner . next ( ) ;
  final Function < Integer , Integer > readStrs = scanner . next ( ) ;
  final Function < Integer , Integer > readInt = scanner . next ( ) ;
  final Function < Integer , Integer > readInts = scanner . next ( ) ;
  final Function < Integer , Integer > readFloat = scanner . next ( ) ;
  final Function < Double , Double > readFloats = scanner . next ( ) ;
  final double dist = scanner . nextDouble ( ) ;
  final double x = scanner . nextDouble ( ) ;
  final double y = scanner . nextDouble ( ) ;
  final double z = scanner . nextDouble ( ) ;
  final double X = scanner . nextDouble ( ) ;
  final double Y = scanner . nextDouble ( ) ;
  final double Z = scanner . nextDouble ( ) ;
  final double x = scanner . nextDouble ( ) ;
  final double y = scanner . nextDouble ( ) ;
  final double x = scanner . nextDouble ( ) ;
  final double y = scanner . nextDouble ( ) ;
  final double x = scanner . nextDouble ( ) ;
  final double y = scanner . nextDouble ( ) ;
  final double x = scanner . nextDouble ( ) ;
  final double y = scanner . nextDouble ( ) ;
  final double x = scanner . nextDouble (