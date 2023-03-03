public static int rank ( int num ) {
  if ( num == 10000 ) {
    return 1 ;
  }
  else {
    return ( num % 10 + ( int ) ( num % 100 / 10 ) + ( int ) ( num % 1000 / 100 ) + ( int ) ( num % 10000 / 1000 ) ) ;
  }
}
