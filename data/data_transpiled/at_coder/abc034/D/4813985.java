public static void input ( int n , int k ) {
  int [ ] [ ] info = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) info [ i ] = new int [ n ] ;
  boolean [ ] used = new boolean [ n ] ;
  double ansSolutionG = 0 ;
  double ansSaltG = 0 ;
  for ( int j = 0 ;
  j < k ;
  j ++ ) {
    double tmpSalutionG = 0 ;
    double tmpSaltG = 0 ;
    double tmpSolutionP = 0 ;
    int tmpI = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( used [ i ] ) {
        continue ;
      }
      else {
        double newSolutionG = ansSolutionG + info [ i ] [ 0 ] ;
        double newSaltG = ansSaltG + ( info [ i ] [ 0 ] * info [ i ] [ 1 ] ) / 100 ;
        newSolutionP = ( newSaltG / newSolutionG ) * 100 ;
        if ( newSolutionP > tmpSolutionP ) {
          tmpSolutionG = newSolutionG ;
          tmpSaltG = newSaltG ;
          tmpSolutionP = newSolutionP ;
          tmpI = i ;
        }
      }
    }
    used [ tmpI ] = true ;
    ansSolutionG = tmpSolutionG ;
    ansSaltG = tmpSaltG ;
  }
  System . out . println ( ansSaltG / ansSolutionG * 100 ) ;
}
