public static int solve ( int X , int n ) {
  if ( count [ X ] == - 1 ) return false ;
  if ( n == 0 ) return X ;
  if ( count [ beats [ X ] ] != 0 ) {
    count [ beats [ X ] ] -- ;
    int x = solve ( X , n - 1 ) , y = solve ( beats [ X ] , n - 1 ) ;
    if ( x > 0 && y > 0 ) {
      if ( x > y ) return y + x ;
      else return x + y ;
    }
  }
  return false ;
}
