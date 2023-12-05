static final public int Customers ( int T , int [ ] times ) {
  int ret = 0 ;
  for ( int barberTime : times ) {
    ret += ( T - 1 ) / barberTime + 1 ;
  }
  return ret ;
}
