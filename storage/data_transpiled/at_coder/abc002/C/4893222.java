@ OperatorOperator ( OperatorType . EQUAL ) public static int compare ( String input ) {
  int x1 , y1 , x2 , y2 , x3 , y3 ;
  int [ ] xy = {
    ( x1 == 0 ) ? 0 : 1 , ( x2 == 0 ) ? 0 : 1 , ( x3 == 0 ) ? 0 : 1 }
    ;
    Arrays . sort ( xy ) ;
    return xy [ 0 ] ;
  }
  