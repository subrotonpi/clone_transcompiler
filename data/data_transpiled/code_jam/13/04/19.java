public static List < Chest > findSolution ( List < Chest > chestList , List < Chest > partialSolution ) throws IOException {
  BufferedReader fIn = new BufferedReader ( new FileReader ( "D-small-attempt2.in" ) ) ;
  PrintWriter fOut = new PrintWriter ( new FileWriter ( "D-small-attempt2.out" ) ) ;
  int numCases = Integer . parseInt ( fIn . readLine ( ) . trim ( ) ) ;
  List < Chest > solution ;
  List < Chest > chestList ;
  int idxCase = 0 ;
  for ( Chest chest : chestList ) {
    if ( ! chest . lock . equals ( chest . lock ) ) {
      feasible = false ;
      break ;
    }
    totalKeyList . remove ( chest . lock ) ;
  }
  if ( feasible ) {
    solution = findSolution ( keyList , chestList , new ArrayList < Chest > ( ) ) ;
  }
  else {
    solution = new ArrayList < Chest > ( ) ;
  }
  if ( solution . size ( ) == N ) {
    fOut . println ( "Case #" + ( idxCase + 1 ) + ": " + Arrays . toString ( solution ) ) ;
  }
  else {
    fOut . println ( "Case #" + ( idxCase + 1 ) + ": IMPOSSIBLE\n" ) ;
  }
  fIn . close ( ) ;
  fOut . close ( ) ;
  List < Chest > newKeyList ;
  for ( Chest chest : chestList ) {
    if ( chest . lock . equals ( chest . lock ) ) {
      List < Chest > newKeyList = new ArrayList < Chest > ( keyList ) ;
      newKeyList . remove ( chest . lock ) ;
      newKeyList . addAll ( chest . keysInside ) ;
      List < Chest > newChestList = new ArrayList < Chest > ( chestList ) ;
      newChestList . remove ( chest ) ;
      if ( newChestList . size ( ) == 0 ) {
        return Collections . singletonList ( chest . number ) ;
      }
      List < Chest > newSolution = findSolution ( newKeyList , newChestList , partialSolution . toArray ( new Chest [ newChestList . size ( ) ] ) ) ;
      if ( newSolution . size ( ) > 0 ) {
        newSolution . add ( chest . number ) ;
        return newSolution ;
        