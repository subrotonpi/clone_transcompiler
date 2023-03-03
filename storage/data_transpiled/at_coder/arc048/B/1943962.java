public static void main ( String input ) {
  final int MAXR = 10 * 5 ;
  int [ ] [ ] src = new int [ MAXR ] [ ] ;
  int [ ] [ ] mem = new int [ MAXR ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int r = Integer . parseInt ( input . substring ( 0 , i ) ) ;
    int h = Integer . parseInt ( input . substring ( i + 1 ) ) ;
    src [ i ] [ r ] = new int [ r ] ;
    mem [ i ] [ h ] ++ ;
  }
  int [ ] cums = new int [ MAXR ] ;
  cums [ MAXR ] = 0 ;
  for ( int i = 0 ;
  i < MAXR ;
  i ++ ) {
    cums [ MAXR ] = cums [ MAXR ] + Integer . parseInt ( input . substring ( i + 1 ) ) ;
  }
  int [ ] [ ] res = new int [ MAXR ] [ ] ;
  for ( int i = 0 ;
  i < MAXR ;
  i ++ ) {
    res [ i ] = null ;
  }
  for ( int r = 0 ;
  r < src . length ;
  r ++ ) {
    int h = Integer . parseInt ( input . substring ( 0 , i + 1 ) ) ;
    if ( res [ r ] == null ) {
      int win = cums [ r ] ;
      int lose = N - win - Integer . parseInt ( mem [ r ] [ h ] ) ;
      int g = mem [ r ] [ h ] ;
      int c = mem [ r ] [ h ] ;
      int p = mem [ r ] [ g ] ;
      res [ r ] = new int [ ] {
        ( win + c ) , ( lose + p ) , g - 1 }
        ;
      }
      else {
        res [ r ] [ h ] = new int [ ] {
          ( win + p ) , ( lose + c ) , c - 1 }
          ;
        }
      }
      System . out . println ( Arrays . toString ( res [ r ] ) ) ;
    }
    