[ ] M = new M [ 8 ] ;
for ( int i = 0 ;
i < 8 ;
i ++ ) {
  M [ i ] = new M [ 8 ] ;
}
{
  for ( int i = 1 ;
  i < 8 ;
  i ++ ) {
    int [ ] yl = {
      y , y , y - i , y + i , y - i , y + i , y + i }
      ;
      int [ ] xl = {
        x - i , x + i , x , x , x - i , x + i , x - i , x + i }
        ;
        for ( int i2 = 0 ;
        i2 < yl . length ;
        i2 ++ ) {
          int j2 = yl [ i2 ] ;
          if ( 0 <= i2 && i2 <= 7 && 0 <= j2 && M [ i2 ] [ j2 ] == "Q" ) return 0 ;
        }
      }
    }
    