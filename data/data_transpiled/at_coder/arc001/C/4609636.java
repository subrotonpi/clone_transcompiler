static final int [ ] [ ] M = new int [ 8 ] [ ] ;
for ( int i = 0 ;
i < 8 ;
i ++ ) {
  M [ i ] = new LinkedList < String > ( ) ;
}
{
  for ( int i = 0 ;
  i < 8 ;
  i ++ ) {
    M [ i ] [ 0 ] = input . next ( ) ;
  }
}
{
  int y = 0 ;
  for ( int i = 1 ;
  i < 8 ;
  i ++ ) {
    int [ ] y1 = {
      y , y , y - i , y - i , y + i , y + i , y + i }
      ;
      int [ ] x1 = {
        x - i , x + i , x - i , x , x + i , x - i , x , x + i }
        ;
        for ( int Y = 0 ;
        Y < y1 . length ;
        Y ++ ) {
          int X = y1 [ i ] ;
          if ( 0 <= Y && Y <= 7 && 0 <= X && M [ Y ] [ X ] == "Q" ) {
            return 0 ;
          }
        }
      }
    }
    {
      int n = 1 ;
    }
  }
  