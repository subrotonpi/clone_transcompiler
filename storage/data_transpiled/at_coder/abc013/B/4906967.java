public static int a = Integer . parseInt ( input ) {
  int b = Integer . parseInt ( input ) ;
  int upCount = 0 ;
  int downCount = 0 ;
  int a1 = a ;
  int a2 = a ;
  while ( ( a1 != b ) && ( a1 != 9 ) ) {
    if ( ( a1 == 0 ) && ( a2 == 9 ) ) {
      a1 = 0 ;
      upCount ++ ;
    }
    else {
      a1 ++ ;
      upCount ++ ;
    }
  }
  while ( a2 != 0 ) {
  }
  return a ;
}
