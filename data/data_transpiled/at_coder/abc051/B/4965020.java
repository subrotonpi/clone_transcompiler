static final int [ ] range ( int K , int S ) {
  int count = 0 ;
  for ( int x = 0 , y = 0 ;
  x <= K ;
  ++ x , -- y ) {
    int z = S - x - y ;
    if ( 0 <= z && z <= K ) count ++ ;
  }
  return new int [ ] {
    count }
    ;
  }
  