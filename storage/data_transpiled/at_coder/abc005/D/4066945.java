public static int [ ] [ ] calc ( int x , int y ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < List < Integer >> D = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) D . add ( Collections . singletonList ( Integer . parseInt ( input ( ) ) ) ) ;
  int Q = Integer . parseInt ( input ( ) ) ;
  int [ ] P = new int [ Q ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) P [ i ] = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] memRec = new int [ N + 1 ] [ N + 1 ] ;
  int [ ] [ ] memMax = new int [ N * N + 1 ] [ N + 1 ] ;
  int maxP = Math . max ( P [ 0 ] , maxP ) ;
  for ( int x = 1 ;
  x <= N ;
  x ++ ) {
    for ( int y = 1 ;
    y <= x ;
    y ++ ) {
      memRec [ y ] [ x ] = D [ y - 1 ] [ x - 1 ] + memRec [ y ] [ x - 1 ] + memRec [ y - 1 ] [ x - 1 ] ;
      memRec [ x ] [ y ] = D [ x - 1 ] [ y - 1 ] + memRec [ x ] [ y - 1 ] + memRec [ x - 1 ] [ y - 1 ] - memRec [ x - 1 ] [ y - 1 ] ;
    }
    memRec [ x ] [ x ] = D [ x - 1 ] [ x - 1 ] + memRec [ x ] [ x - 1 ] + memRec [ x ] [ x - 1 ] - memRec [ x - 1 ] [ x - 1 ] ;
  }
  / * ▁ calc ▁ the ▁ max ▁ of ▁ the ▁ max ▁ of ▁ the ▁ max ▁ of ▁ the ▁ max ▁ of ▁ the ▁ max ▁ of ▁ the ▁ max ▁ of ▁ max ▁ of ▁ the ▁ max ▁ of ▁ max ▁ of ▁ max ▁ of ▁ the ▁ max ▁ of ▁ max ▁ of ▁ max ▁ of ▁ max ▁ of ▁ max ▁ of ▁ max ▁ of ▁ max ▁ of ▁ max ▁ of ▁ max ▁ of ▁ max ▁ of ▁ max ▁ of ▁ max ▁ of ▁ max ▁ of ▁ max ▁ of ▁ max ▁ of ▁ max ▁ of ▁ max ▁ of ▁ max ▁