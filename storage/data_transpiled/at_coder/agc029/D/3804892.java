static int solve ( List < Integer > obstacles ) {
  int offset = 0 ;
  obstacles . forEach ( x -> {
    if ( x > y + offset ) {
      return x - 1 ;
    }
    if ( x == y + offset ) {
      offset ++ ;
    }
  }
  ) ;
  return h ;
}
