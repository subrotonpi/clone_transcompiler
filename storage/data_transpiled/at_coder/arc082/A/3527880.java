public static void N ( int N ) {
  int [ ] A = new int [ N ] ;
  for ( String s : input . split ( " " ) ) {
    A [ i ] = Integer . parseInt ( s ) ;
  }
  final int [ ] cnt = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    cnt [ i ] = i ;
  }
  final int minval = Math . min ( A , 0 ) ;
  final int maxval = Math . max ( A , 0 ) ;
  int ret = 0 ;
  for ( int i = minval ;
  i <= maxval ;
  i ++ ) {
    final int s = cnt [ i - 1 ] + cnt [ i ] + cnt [ i + 1 ] ;
    ret = Math . max ( ret , s ) ;
  }
  System . out . println ( ret ) ;
}
