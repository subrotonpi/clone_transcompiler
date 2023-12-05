static boolean isset ( int a , int bit ) {
  return ( ( a >> bit ) & 1 ) > 0 ;
}
