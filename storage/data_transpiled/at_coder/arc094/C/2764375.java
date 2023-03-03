public static int N = Integer . parseInt ( input ) {
  int bMin = 10 * 10 , isequal = 0 , total = 0 ;
  for ( ;
  ;
  ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    total += a ;
    if ( a > b ) {
      if ( b < bMin ) {
        bMin = b ;
      }
    }
    else if ( a == b ) {
      isequal ++ ;
    }
  }
  if ( isequal == N ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( ( int ) ( total - bMin ) ) ;
  }
  return isequal ;
}
