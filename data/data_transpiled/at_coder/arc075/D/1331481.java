public static int result ( int letters , int number , int cantZero ) {
  if ( letters <= 1 ) {
    if ( number == 0 ) {
      return 10 * letters ;
    }
    return 0 ;
  }
  int diff = ( 10 - number % 10 ) % 10 ;
  int variants = number % 10 - cantZero ;
  if ( number % 10 == 0 ) {
    variants = 10 - cantZero ;
  }
  number -= diff * ( 10 * ( letters - 1 ) - 1 ) ;
  number = Math . abs ( number / 10 ) ;
  return variants * result ( letters - 2 , number , 0 ) ;
}
