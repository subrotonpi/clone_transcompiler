public static BiFunction < Integer , Integer , Boolean > judge ( int D ) {
  int n = 0 ;
  while ( D % 4 == 0 ) {
    n ++ ;
    D /= 4 ;
  }
  return ( D % 2 == 1 ) ? ( ( x >> n ) ^ ( y >> n ) ) & 1 : ( ( x , y ) -> ~ ( ( x >> n ) ^ ( y >> n ) ) & 1 ) ;
}
