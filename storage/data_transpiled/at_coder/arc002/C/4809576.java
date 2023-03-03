@ VisibleForTesting static Iterable < String > combinations ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = input . nextLine ( ) . trim ( ) ;
  String [ ] cand = {
    "AA" , "AB" , "AX" , "AY" , "BA" , "BB" , "BX" , "BY" , "XA" , "XB" , "XX" , "XY" , "YA" , "YB" , "YX" , "YY" , }
    ;
    int minl = 1000 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      String c1 = cand [ i ] ;
      String c2 = cand [ i ] ;
      String tmps = s ;
      tmps = tmps . replace ( c1 , "L" ) . replace ( c2 , "R" ) ;
      if ( tmps . length ( ) < minl ) {
        minl = tmps . length ( ) ;
      }
    }
    System . out . println ( minl ) ;
    return s ;
  }
  