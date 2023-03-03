public static int N = - 1 ;
int M = - 1 ;
int t0 ;
int i , j ;
int i , j ;
int temp [ ] [ ] = new int [ 4 * N ] [ 2 * M ] ;
FileReader reader = new FileReader ( "B-large.in" ) ;
int num = Integer . parseInt ( reader . readLine ( ) . trim ( ) ) ;
System . out . println ( "numis " + num ) ;
fw = new FileWriter ( "outputSecondLarge" ) ;
for ( j = 0 ;
j < num ;
j ++ ) {
  String sline [ ] = reader . readLine ( ) . split ( " " ) ;
  N = Integer . parseInt ( sline [ 0 ] ) ;
  M = Integer . parseInt ( sline [ 1 ] ) ;
}
if ( j % 2 != 0 ) {
  t0 = mat [ i ] [ j ] ;
  cycle = hor [ i / 2 ] [ j ] + ver [ i / 2 ] [ j ] ;
  t1 = wait [ i / 2 ] [ j ] ;
  temp [ 0 ] = hor [ i ] [ j ] ;
  temp [ 1 ] = hor [ i ] [ j ] ;
  temp [ 2 * N ] = hor [ i ] [ j ] ;
  temp [ 2 * N ] = hor [ i ] [ j ] ;
  temp [ 3 ] = hor [ i ] [ j ] ;
  temp [ 0 ] = hor [ i ] [ j ] ;
  temp [ 1 ] = hor [ i ] [ j ] ;
  temp [ 2 * N ] = hor [ i ] [ j ] ;
  temp [ 2 * N ] = hor [ i ] [ j ] ;
  mat [ i ] [ j ] = temp [ 0 ] ;
  for ( k = 0 ;
  k < 4 * N * M ;
  k ++ ) {
    if ( j % 2 == 0 ) {
      t0 = mat [ i ] [ j ] ;
      cycle = hor [ i / 2 ] [ j ] + ver [ i / 2 ] [ j ] ;
      t1 = wait [ i / 2 ] [ j ] ;
      add = 0 ;
      if ( ( t0 - t1 ) % cycle >= hor [ i ] [ j ] - 1 ) {
        add = cycle - ( t0 - t1 ) % cycle ;
      }
      nextValid = t0 + ( t1 ) % cycle ;
      temp [ 2 * N ] = hor [ i ] [ j ] ;
      mat [ i ]