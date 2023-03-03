static final Scanner input = new Scanner ( System . in ) {
  private final Scanner in = new Scanner ( System . in ) ;
  private final Function < Integer , Integer > ni = ns -> Integer . parseInt ( ns . next ( ) ) ;
  private final Function < Integer , List < Integer >> na = ns -> Collections . list ( Integer . parseInt ( ns . next ( ) ) ) ;
  private final Function < Integer , Integer > ns = ns -> input . next ( ) ;
  private final int N = na . nextInt ( ) ;
  private final int H = na . nextInt ( ) ;
  private final int [ ] a = new int [ N ] ;
  private final int [ ] b = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final List < Integer > t = na . apply ( ns . next ( ) ) ;
    a [ i ] = t . get ( 0 ) ;
    b [ i ] = t . get ( 1 ) ;
  }
  final int mA = Collections . max ( a ) ;
  Arrays . sort ( b , Collections . reverseOrder ( ) ) ;
  int sumB = 0 ;
  int bI = 0 ;
  if ( ( mA > b [ b . length - 1 ] ) && ( b [ b . length - 1 ] <= mA ) ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      sumB += b [ i ] ;
      if ( ( b [ i ] <= mA ) && ( b [ i ] <= mA ) ) {
        sumB -= b [ i ] ;
        bI = i ;
        break ;
      }
    }
  }
  else {
    bI = N ;
    sumB = sum ( b ) ;
  }
  int res = 0 ;
  if ( ( sumB >= H ) && ( b [ bI ] <= H ) ) {
    for ( int i = 0 ;
    i < bI ;
    i ++ ) {
      res += b [ i ] ;
      if ( ( res >= H ) && ( res < H ) ) {
        System . out . println ( i + 1 ) ;
        exit ( ) ;
      }
    }
  }
  else {
    int ct = 0 ;
    final int H_resi = H - sumB ;
    ct += Math . ceil ( H_resi / mA ) ;
    System . out . println ( ct + bI ) ;
  }
  return new Scanner ( in ) ;
}
