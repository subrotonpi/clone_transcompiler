static final double [ ] [ ] getMaxEnergy ( int maxE , int e , int r , int [ ] values , int i ) throws IOException {
  if ( ( i == ( values . length - 1 ) ) && ( values [ i ] > 0 ) ) {
    return new double [ ] [ ] {
      e * values [ i ] , 0 }
      ;
    }
    double best = 0 ;
    int bestIndex = - 1 ;
    int [ ] possibleEnergies = {
      0 , e }
      ;
      if ( ( e + r > maxE ) && ( values [ i ] > 0 ) ) {
        possibleEnergies [ 0 ] = Math . min ( e , e + r - maxE ) ;
      }
      int nextHighest = 1 ;
      while ( ( i + nextHighest ) < values . length && values [ i + nextHighest ] < values [ i ] ) {
        nextHighest ++ ;
      }
      if ( ( i + nextHighest ) == values . length ) {
        possibleEnergies = new int [ ] {
          e }
          ;
        }
        else {
          possibleEnergies = new int [ ] {
            Math . min ( e , Math . max ( possibleEnergies [ 0 ] , ( e + nextHighest * r ) - maxE ) ) }
            ;
          }
          int energyToUse = possibleEnergies [ 0 ] ;
          int energyForNextStep = Math . min ( e - energyToUse + r , maxE ) ;
          return new double [ ] [ ] {
            energyToUse * values [ i ] , energyForNextStep }
            ;
          }
          