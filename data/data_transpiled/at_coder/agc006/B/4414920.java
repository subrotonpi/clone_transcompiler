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
  int [ ] tmp ;
  if ( x == 2 ) {
    tmp = {
      3 , 2 , 1 , 4 }
      ;
    }
    else {
      tmp = {
        x - 1 , x , x + 1 , x - 2 }
        ;
      }
      List remain = new LinkedList ( ) ;
      remain . add ( tmp ) ;
      int k = 3 - n ;
      tmp = remain . subList ( 0 , k ) + tmp . toArray ( ) ;
      System . out . println ( tmp ) ;
      return 1 ;
    }
    