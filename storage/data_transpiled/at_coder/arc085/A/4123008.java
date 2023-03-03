public static int parseInt ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int totalTime = M * 1900 + ( N - M ) * 100 ;
  int e = 0 ;
  int err = 10 * ( - 3 ) ;
  int prev = - 1 ;
  int i = 0 ;
  while ( Math . abs ( prev - e ) > err ) {
    prev = e ;
    e += ( 1 - ( 1 / 2 ) * M ) ;
  }
  return ( int ) floor ( e , 1 ) ;
}
