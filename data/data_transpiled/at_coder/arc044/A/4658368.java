public static boolean isPrime ( ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  boolean flag = true ;
  if ( N == 1 ) {
    flag = false ;
  }
  else if ( N == 2 ) {
    flag = true ;
  }
  else if ( N % 2 == 0 ) {
    flag = false ;
  }
  else {
    for ( int i = 3 ;
    i <= N ;
    i += 2 ) {
      if ( N % i == 0 ) {
        flag = false ;
      }
    }
  }
  return flag ;
}
