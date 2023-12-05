public static void main ( String [ ] args ) {
  int A = Integer . parseInt ( args [ 0 ] ) ;
  int B = Integer . parseInt ( args [ 1 ] ) ;
  int C = Integer . parseInt ( args [ 2 ] ) ;
  int X = Integer . parseInt ( args [ 3 ] ) ;
  int Y = Integer . parseInt ( args [ 4 ] ) ;
  int totalA1 = A * X ;
  int totalA2 = C * X * 2 ;
  int totalB1 = B * Y ;
  int totalB2 = C * Y * 2 ;
  int totalAB = A * X + B * Y ;
  int totalAC = C * Y ;
  if ( X > Y ) totalAC += ( X - Y ) * A ;
  int totalCB = C * X * 2 ;
  if ( Y > X ) totalCB += ( Y - X ) * B ;
  totalCC = C * Y * 2 ;
}
