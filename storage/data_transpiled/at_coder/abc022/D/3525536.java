public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > AXY = new ArrayList < > ( ) ;
  List < Integer > BXY = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    AXY . add ( Integer . parseInt ( input ) ) ;
  }
  List < Integer > AX = new ArrayList < > ( ) ;
  AX . add ( AXY . get ( 0 ) ) ;
  List < Integer > AY = new ArrayList < > ( ) ;
  AY . add ( AXY . get ( 1 ) ) ;
  List < Integer > BX = new ArrayList < > ( ) ;
  BX . add ( BXY . get ( 0 ) ) ;
  List < Integer > BY = new ArrayList < > ( ) ;
  BY . add ( BXY . get ( 1 ) ) ;
  AVEAX = sum ( AX ) / N ;
  AVEAY = sum ( AY ) / N ;
  AVEBX = sum ( BX ) / N ;
  AVEBY = sum ( BY ) / N ;
  final double A_sumdis = 0 ;
  double B_sumdis = 0 ;
  for ( int x = 0 ;
  x < N ;
  x ++ ) {
    A_sumdis += Math . sqrt ( ( x - AVEAX ) * ( x - AVEAY ) + ( y - AVEAY ) * ( y - AVEAY ) ) ;
  }
  for ( int x = 0 ;
  x < N ;
  x ++ ) {
    B_sumdis += Math . sqrt ( ( x - AVEBX ) * ( x - AVEBX ) + ( y - AVEBY ) * ( y - AVEBY ) ) ;
  }
  System . out . println ( B_sumdis / A_sumdis ) ;
}
