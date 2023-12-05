@ VisibleForTesting static void print ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] colorArray = {
    1 , 400 , 800 , 1200 , 1600 , 2000 , 2400 , 2800 , 3200 }
    ;
    int [ ] colorMap = new int [ a . length ] ;
    int redCount = 0 ;
    for ( int i = 0 ;
    i < a . length ;
    i ++ ) {
      int idx = Arrays . binarySearch ( colorArray , a [ i ] ) ;
      if ( 1 <= idx && idx <= 8 ) {
        colorMap [ idx ] ++ ;
      }
      else if ( idx == 9 ) {
        redCount ++ ;
      }
    }
    if ( colorMap . length >= 1 ) {
      System . out . println ( colorMap . length + " " + colorMap . length + redCount ) ;
    }
    else {
      System . out . println ( 1 + " " + redCount ) ;
    }
  }
  