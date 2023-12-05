public static int [ ] getTimes ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) , k = Integer . parseInt ( input . nextLine ( ) ) ;
  boolean res = false ;
  int [ ] time = {
    Integer . parseInt ( input . nextLine ( ) ) , k }
    ;
    for ( int i = 0 ;
    i < n - 3 ;
    i ++ ) {
      if ( Arrays . binarySearch ( time , time ) < k && ! res ) res = i + 3 ;
      time [ 0 ] = time [ 1 ] ;
      time [ 2 ] = time [ 2 ] ;
    }
    return time ;
  }
  