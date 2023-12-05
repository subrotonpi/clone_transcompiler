static final int [ ] getDistance ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > D = Lists . newArrayList ( ) ;
  for ( int i = N ;
  i < 100001 ;
  i ++ ) {
    int flg = 1 ;
    String cost = Integer . toString ( i ) ;
    int digit = cost . length ( ) ;
    for ( int j = 0 ;
    j < digit ;
    j ++ ) {
      if ( D . contains ( cost ) ) {
        flg = 0 ;
        break ;
      }
    }
    if ( flg == 1 ) {
      System . out . println ( cost ) ;
      System . exit ( 0 ) ;
    }
  }
  return null ;
}
