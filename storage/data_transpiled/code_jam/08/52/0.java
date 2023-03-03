static final double [ ] [ ] getHoles ( ) {
  final boolean DEBUG = false ;
  final int [ ] [ ] parts ;
  final int [ ] got = new int [ 32 ] [ 32 ] ;
  int currow , curcol ;
  final boolean DEBUG = true ;
  final int [ ] [ ] cases = new int [ 32 ] [ 32 ] ;
  for ( int i = 0 ;
  i < cases . length ;
  i ++ ) {
    parts = new String ( ) . split ( " " ) ;
    got [ currow ] = Math . min ( walldist [ row , col ] + 1 , walldist [ row , col ] + 1 , walldist [ row , col ] + 1 ) ;
  }
  final int [ ] cases = new int [ cases . length ] ;
  for ( int i = 0 ;
  i < cases . length ;
  i ++ ) {
    cases [ i ] = Math . min ( cells [ i ] , Math . max ( cells [ i ] , 1 ) ) ;
  }
  final int [ ] cases = new int [ cases . length ] ;
  for ( int i = 0 ;
  i < cases . length ;
  i ++ ) cases [ i ] = Math . min ( cells [ i ] , Math . max ( cells [ i ] , 1 ) ) ;
  cases [ currow ] = Math . max ( cells [ i ] , Math . max ( cells [ i ] , 1 ) ) ;
  final int [ ] cases = new int [ cases . length ] ;
  for ( int i = 0 ;
  i < cases . length ;
  i ++ ) cases [ currow ] = Math . min ( cells [ i ] , Math . max ( cells [ i ] , 1 ) ) ;
  cases [ curcol ] = Math . max ( cells [ i ] , Math . max ( cells [ i ] , 1 ) ) ;
  cases [ curcol ] = Math . min ( cells [ i ] , Math . max ( cells [ i ] , 1 ) ) ;
  cases [ curcol ] = Math . max ( cells [ i ] , Math . max ( cells [ i ] , 1 ) ) ;
  cases [ curcol ] = Math . min ( cells [ i ] , Math . max ( cells [ i ] , 1 ) ) ;
  cases [ curcol ] = Math . max ( cells [ i ] , Math . max ( cells [ i ] , 1 ) ) ;
  cases [ curcol ] = Math . max ( cells [ i ] , Math . max ( cells [ i ]