private static void solve ( ) {
  int n = Integer . parseInt ( readLine ( ) ) ;
  List < Level > levels = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int ai = Integer . parseInt ( readLine ( ) ) ;
    int bi = Integer . parseInt ( readLine ( ) ) ;
    levels . add ( new Level ( i , ai , bi ) ) ;
  }
  int current = 0 ;
  int [ ] status = new int [ n ] ;
  int answer = 0 ;
  final int maxLevel = new Integer ( 9999999 ) ;
  {
    try {
      return Collections . min ( levels , new Comparator < Level > ( ) {
        public int compare ( Level o1 , Level o2 ) {
          return o1 . compareTo ( o2 ) ;
        }
      }
      ) ;
    }
    catch ( NumberFormatException e ) {
      return maxLevel ;
    }
  }
  {
    try {
      return Collections . max ( ContainerUtil . filter ( levels , new Predicate < Level > ( ) {
        public boolean apply ( Level o1 ) {
          return o1 . getLevel1 ( ) <= current && status [ o1 . getLevel1 ( ) ] == 0 ;
        }
      }
      ) , new Comparator < Level > ( ) {
        public int compare ( Level o1 , Level o2 ) {
          return o2 . getLevel1 ( ) <= current && status [ o1 . getLevel1 ( ) ] == 0 ;
        }
      }
      ) ;
    }
    catch ( NumberFormatException e ) {
      return maxLevel ;
    }
  }
  while ( levels . size ( ) > 0 ) {
    Level level = getMinTwoStarLevel ( ) ;
    int oneStar = level . getLevel1 ( ) ;
    int twoStar = level . getLevel2 ( ) ;
    if ( twoStar <= current ) {
      levels . remove ( new Level ( level , oneStar , twoStar ) ) ;
      if ( status [ level ] == 0 ) {
        current += 2 ;
      }
      else {
        current ++ ;
      }
      status [ level ] = 2 ;
      answer ++ ;
    }
    else {
      Level level = getMaxSatisfyLevel ( current ) ;
      oneStar = level . getLevel1 ( ) ;
      twoStar = level . getLevel2 ( ) ;
      if ( oneStar > current ) {
        return - 1 ;
      }
      else {
        current ++ ;
        status [ level ] = 1 ;
      }
      answer ++ ;
    }
  }
}
