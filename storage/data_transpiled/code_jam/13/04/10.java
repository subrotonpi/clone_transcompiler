static final class Chest {
  {
    this . name = name ;
    chest . keyType = numbers [ 0 ] ;
    numberOfKeysInside = numbers [ 1 ] ;
    chest . keysInside = numbers [ 2 ] ;
    assert chest . keysInside . length == numberOfKeysInside ;
  }
  public Chest getFirstSolution ( ) {
    return getSolution ( initialKeys , new Chest [ 0 ] ) ;
  }
  public Chest translateSolution ( Chest solution ) {
    return new Chest ( solution ) ;
  }
  public int [ ] readNumbers ( ) {
    return ArrayUtil . readInt ( ) ;
  }
  public int [ ] readNumbers ( ) {
    return ArrayUtil . readInt ( ) ;
  }
  public int [ ] readNumbers ( ) {
    return ArrayUtil . readInt ( ) ;
  }
  public int [ ] readNumbers ( ) {
    int [ ] K = readNumbers ( ) ;
    int [ ] keys = new int [ K ] ;
    Arrays . fill ( keys , 0 , K ) ;
    chests = new Chest [ K ] ;
    for ( int i = 0 ;
    i < K ;
    ++ i ) chests [ i ] = new Chest ( i + 1 , readNumbers ( ) ) ;
    assert keys . length == K ;
    assert chests . length == N ;
    System . err . println ( "Case #" + ( i + 1 ) + ": " + solutionStr ) ;
    Problem p = new Problem ( keys , chests ) ;
    String solution = p . getFirstSolution ( ) ;
    if ( solution == null ) {
      solution = "IMPOSSIBLE" ;
    }
    else {
      solution = p . translateSolution ( solution ) ;
      solution = " " . concat ( solution ) ;
    }
    System . err . println ( "Case #" + ( i + 1 ) + ": " + solution ) ;
  }
  for ( int i = 0 ;
  i < chests . length ;
  ++ i ) {
    if ( ! chests [ i ] . keysInside [ i ] ) {
      int key = chests [ i ] . getKeyType ( ) ;
      if ( ! keys [ i ] . getKeyType ( ) . equals ( key ) ) {
        covered [ i ] = true ;
        for ( int keyInside : chests [ i ] . keysInside ) {
          open ( keyInside ) ;
        }
      }
    }
    for ( int k : keys ) {
      open ( k ) ;
    }
    return Arrays . binarySearch ( covered , solution ) ;
  }
  public boolean isFeasible ( ) {
    return true ;
  }
}
