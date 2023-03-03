@ VisibleForTesting static int addlBowlsFor ( String mixture , Map < String , List < String >> mixtures , int unusedBowls , boolean p ) {
  if ( Character . isLowerCase ( mixture . charAt ( 0 ) ) ) {
    return 0 ;
  }
  List < String > ingreds = mixtures . get ( mixture ) ;
  List < String > ingredLeastUse = new ArrayList < > ( ingreds ) ;
  Collections . sort ( ingredLeastUse , null , new Comparator < String > ( ) {
    @ Override public int compare ( String o1 , String o2 ) {
      return addlBowlsFor ( o1 , o2 , mixtures , unusedBowls ) ;
    }
  }
  ) ;
  int bowlsINeed = 0 ;
  int big = 0 ;
  for ( String ingred : new ArrayList < > ( ingredLeastUse ) ) {
    if ( Character . isUpperCase ( ingred . charAt ( 0 ) ) ) {
      int addlBowls = addlBowlsFor ( ingred , mixtures , unusedBowls , p ) ;
      unusedBowls += addlBowls - 1 ;
      bowlsINeed += addlBowls ;
    }
  }
  if ( unusedBowls == 0 ) {
    bowlsINeed ++ ;
  }
  return bowlsINeed ;
}
