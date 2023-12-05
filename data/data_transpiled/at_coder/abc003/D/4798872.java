static final int R = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
final int C = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
final int X = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
final int Y = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
final int D = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
final int L = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
/* Calculate the number of the combinations */
double x ;
if ( n < r ) {
  x = 0 ;
}
else {
  x = Math . factorial ( n ) / ( Math . factorial ( n - r ) * Math . factorial ( r ) ) ;
}
int a = R - X ;
int b = C - Y ;
int n_1 = 0 ;
if ( a > 0 && b < 0 ) {
  n_1 = a + 1 ;
}
else if ( b > 0 && a < b ) {
  n_1 = b + 1 ;
}
else if ( a > 0 && b > 0 ) {
  for ( int i = 0 ;
  i < a + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < b + 1 ;
    j ++ ) {
      n_1 ++ ;
    }
  }
}
else {
  n_1 = 1 ;
}
if ( X * Y != D + L ) {
  double sum_1 = 2 * ctCombi ( X * ( Y - 1 ) , D + L ) + 2 * ctCombi ( ( X - 1 ) * Y , D + L ) ;
  double sum_2 = ctCombi ( ( X - 2 ) * Y , D + L ) + ctCombi ( ( Y - 2 ) * X , D + L ) + 4 * ctCombi ( ( X - 1 ) * Y , D + L ) ;
  double sum_3 = 2 * ctCombi ( ( X - 1 ) * Y , D + L ) + 2 * ctCombi ( ( Y - 2 ) * X , D + L ) ;
  double sum_4 = ctCombi ( ( X - 2 ) * Y , D + L ) ;
  double sum = ctCombi ( X * Y , D + L ) - sum_1 + sum_2 - sum_3 + sum_4 ;
  n_2 = sum * ctCombi ( D + L , D