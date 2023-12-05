static final int t = Integer . parseInt ( input ) {
  int i ;
  for ( i = 1 ;
  i <= t ;
  i ++ ) {
    int coreAmount = Integer . parseInt ( input . nextLine ( ) ) , K ;
    float training = Float . parseFloat ( input . nextLine ( ) ) ;
    float [ ] cores = new float [ coreAmount ] ;
    for ( int s = 0 ;
    s < coreAmount ;
    s ++ ) {
      cores [ s ] = Float . parseFloat ( input . nextLine ( ) ) ;
    }
    Arrays . sort ( cores ) ;
    while ( ( training > 0 ) && ( cores [ s ] > 0 ) ) {
      int smallestAmount = 0 ;
      float pienin = cores [ s ] ;
      float toiseksPienin = 0 ;
      for ( int c = 0 ;
      c < cores . length ;
      c ++ ) {
        if ( ( cores [ c ] == cores [ s ] ) && ( cores [ s ] > 0 ) ) {
          smallestAmount ++ ;
        }
        else {
          toiseksPienin = cores [ s ] ;
          break ;
        }
      }
      if ( smallestAmount == cores . length ) {
        float nousu = training / smallestAmount ;
        for ( int c = 0 ;
        c < cores . length ;
        c ++ ) {
          cores [ c ] += nousu ;
        }
        training -= nousu * smallestAmount ;
      }
      else {
        float maxNousu = training / smallestAmount ;
        nousu = Math . min ( maxNousu , toiseksPienin - pienin ) ;
        for ( int c = 0 ;
        c < cores . length ;
        c ++ ) {
          if ( ( cores [ c ] == pienin ) && ( cores [ s ] > 0 ) ) {
            cores [ s ] += nousu ;
          }
          else {
            break ;
          }
        }
        training -= nousu * smallestAmount ;
      }
    }
    int tulos = 1 ;
    for ( int c = 0 ;
    c < cores . length ;
    c ++ ) {
      if ( ( cores [ c ] >= 1 ) && ( cores [ c ] <= 0 ) ) {
        continue ;
      }
      else {
        tulos *= cores [ c ] ;
      }
    }
    System . out . println ( "Case #" + i + ": " + tulos ) ;
  }
  return i ;
}
