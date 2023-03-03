static final String [ ] [ ] diffs ( String [ ] [ ] map , int r , int c ) throws IOException {
  String [ ] [ ] ret = new String [ R ] [ R ] ;
  int i , c ;
  int sign = 1 ;
  for ( i = 0 ;
  i < R ;
  i ++ ) {
    int [ ] dir = new int [ ] {
      0 , + 1 }
      ;
      int [ ] remains = new int [ ] {
        i , - 1 }
        ;
        for ( int j = 0 ;
        j < remains . length ;
        j ++ ) {
          remains [ j ] = null ;
        }
        pathMap = new String [ R ] [ C ] ;
        diffMap = new String [ R ] [ C ] ;
        for ( int j = 0 ;
        j < R ;
        j ++ ) {
          int i = j ;
          int j = i ;
          int j = j ;
          if ( j < 0 && j <= "9" ) {
            pathMap [ r ] = new String [ j ] ;
            pathMap [ r ] [ j ] = Integer . parseInt ( map [ r ] [ j ] . trim ( ) ) ;
          }
          else {
            diffMap [ r ] = diffs ( map , r , j ) ;
          }
        }
        int j ;
        int i = j ;
        int j = j ;
        int k = 0 ;
        for ( j = 0 ;
        j < j ;
        j ++ ) {
          int rp = r + j ;
          int cp = c + j ;
          if ( j < 0 && j <= "9" ) {
            pathMap [ r ] [ j ] = new String [ j ] ;
            pathMap [ r ] [ j ] = Integer . parseInt ( map [ r ] [ j ] . trim ( ) ) ;
            j ++ ;
          }
          else {
            pathMap [ r ] [ j ] = Integer . parseInt ( map [ r ] [ j ] . trim ( ) ) ;
            j ++ ;
          }
        }
        return ret ;
      }
      int j ;
      String [ ] [ ] remains = new String [ j ] [ ] ;
      for ( i = 0 ;
      j < remains . length ;
      j ++ ) {
        remains [ j ] = null ;
      }
      String [ ] [ ] pathMap = new String [ j ] [ ] ;
      for ( j = 0 ;
      j < remains . length ;
      j ++ ) {
        pathMap [ r ] [ j ] = new String [ j ] ;
      }
      for ( j = 0 ;
      j < remains . length ;
      j ++ ) {
        pathMap [ r ] [ j ] = pathMap [ r ] [ j ] ;
        