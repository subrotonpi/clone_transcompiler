@ VisibleForTesting static String solve ( int caseid , String flydata ) throws IOException {
  String filein = "B.in" ;
  String fileout = "B.out" ;
  int atrow ;
  String text ;
  int num = flydata . length ( ) ;
  double X = 0 ;
  double Y = 0 ;
  double Z = 0 ;
  double DX = 0 ;
  double DY = 0 ;
  double DZ = 0 ;
  for ( int i = 0 ;
  i < num ;
  i ++ ) {
    double x = Integer . parseInt ( flydata . substring ( i , i + 1 ) ) ;
    double y = Integer . parseInt ( flydata . substring ( i , i + 1 ) ) ;
    double z = Integer . parseInt ( flydata . substring ( i , i + 1 ) ) ;
    double dx = Double . parseDouble ( flydata . substring ( i , i + 1 ) ) ;
    double dy = Double . parseDouble ( flydata . substring ( i , i + 1 ) ) ;
    double dz = Double . parseDouble ( flydata . substring ( i , i + 1 ) ) ;
    X += x ;
    Y += y ;
    Z += z ;
    DX += dx ;
    DY += dy ;
    DZ += dz ;
  }
  X = X / num ;
  Y = Y / num ;
  Z = Z / num ;
  DX = DX / num ;
  DY = DY / num ;
  DZ = DZ / num ;
  double t ;
  try {
    t = Math . max ( 0 , - ( X * DX + Y * DY + Z * DZ ) / ( DX * DX + DY * DY + DZ * DZ ) ) ;
  }
  catch ( Exception e ) {
    System . out . println ( DX + " " + DY + " " + DZ ) ;
    t = 0 ;
  }
  double px = ( X + t * DX ) ;
  double py = ( Y + t * DY ) ;
  double pz = ( Z + t * DZ ) ;
  double minD = Math . sqrt ( px * px + py * py + pz * pz ) ;
  return "Case #" + caseid + ": " + minD + " " + t ;
}
