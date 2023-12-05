@ VisibleForTesting static int trainCount ( HQueue < Integer > input ) {
  {
    int [ ] tmp = new int [ input . size ( ) ] ;
    int prev = - 1 ;
    int current = 0 ;
    int minimal = 0 ;
    while ( input . hasNext ( ) ) {
      int [ ] diff = input . poll ( ) ;
      if ( prev == diff [ 0 ] ) {
        tmp [ tmp . length - 1 ] += diff [ 1 ] ;
      }
      else {
        tmp [ 0 ] = diff [ 1 ] ;
      }
      prev = diff [ 0 ] ;
    }
    for ( int val : tmp ) {
      current += val ;
      if ( minimal > current ) {
        minimal = current ;
      }
    }
    return - minimal ;
  }
  public static void main ( String [ ] args ) {
    for ( int c = 0 ;
    c < input . length ;
    c ++ ) {
      int turn = input . nextInt ( ) ;
      List < Integer > trainAHq = new ArrayList < Integer > ( ) ;
      List < Integer > trainBHq = new ArrayList < Integer > ( ) ;
      int tripsA = Integer . parseInt ( input . nextLine ( ) ) ;
      int tripsB = Integer . parseInt ( input . nextLine ( ) ) ;
      for ( int i = 0 ;
      i < tripsA ;
      i ++ ) {
        String depAbStr = input . nextLine ( ) ;
        String arrAbStr = input . nextLine ( ) ;
        int depAbH = Integer . parseInt ( depAbStr ) ;
        int depAbM = Integer . parseInt ( depAbStr ) ;
        int arrAbH = Integer . parseInt ( arrAbStr ) ;
        int arrAbM = Integer . parseInt ( arrAbStr ) ;
        int depAB = depAbH * 60 + depAbM ;
        int arrAB = arrAbH * 60 + arrAbM ;
        System . out . println ( "Case #" + ( c + 1 ) + ": " + needA + " " + needB ) ;
      }
      for ( int i = 0 ;
      i < tripsB ;
      i ++ ) {
        String depBAStr = input . nextLine ( ) ;
        String arrBAStr = input . nextLine ( ) ;
        int depBH = Integer . parseInt ( depBAStr ) ;
        int depBM = Integer . parseInt ( arrBAStr ) ;
        int arrBH = Integer . parseInt ( arrBAStr ) ;
        int depBA = depBH * 60 + depBM ;
        int arrBA = arrB @ @