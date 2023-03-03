public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int preI = 0 ;
  int c = 1 ;
  int g = 0 ;
  for ( ;
  ;
  ) {
    int i = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( preI == 0 ) {
      preI = i ;
      c = 1 ;
    }
    else if ( preI < i ) c ++ ;
  }
}
