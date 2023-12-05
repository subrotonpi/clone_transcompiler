static final double INF = Double . MAX_VALUE ;
final double MOD = 10 * * 9 + 7 ;
{
  int [ ] LI = new int [ 3 ] ;
  int [ ] LI_ = new int [ 3 ] ;
  int [ ] LS = new int [ 3 ] ;
  int [ ] II = new int [ 3 ] ;
  int [ ] SI = new int [ 3 ] ;
  {
    int n = LI [ 0 ] ;
    int x = LI_ [ 1 ] ;
    if ( x == 1 || x == 2 * n - 1 ) {
      System . out . println ( "No" ) ;
      return 0 ;
    }
    System . out . println ( "Yes" ) ;
  }
  if ( n < 3 ) {
    System . out . println ( Arrays . toString ( LENGTH ) ) ;
    return 1 ;
  }
  else {
    return 0 ;
  }
}
