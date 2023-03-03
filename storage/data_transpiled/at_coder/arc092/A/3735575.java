public static void print ( int N ) {
  int [ ] [ ] R = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    R [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] [ ] B = new int [ N ] [ N ] ;
  List = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    B [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  List = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    List . add ( new ArrayList < > ( ) ) ;
  }
  int [ ] count = new int [ N ] ;
  boolean [ ] unpaired = new boolean [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    List . get ( i ) . add ( R [ i ] ) ;
    for ( int j = 0 ;
    j < B . length ;
    j ++ ) {
      if ( B [ j ] > R [ i ] && B [ j ] > R [ i ] ) {
        List . get ( i ) . add ( j ) ;
        count [ j ] ++ ;
      }
    }
  }
  Collections . sort ( List , new Comparator < List > ( ) {
    @ Override public int compare ( List < ? > o1 , List < ? > o2 ) {
      int ans = 0 ;
      for ( List < ? > l : o1 ) {
        int k = Double . MAX_VALUE ;
        int p = - 1 ;
        for ( int j : l ) {
          if ( unpaired [ j ] ) {
            if ( k > count [ j ] ) {
              k = count [ j ] ;
              p = j ;
            }
            count [ j ] -- ;
          }
        }
        if ( p >= 0 ) {
          ans ++ ;
          unpaired [ p ] = false ;
        }
      }
      return ans ;
    }
  }
  ) ;
}
