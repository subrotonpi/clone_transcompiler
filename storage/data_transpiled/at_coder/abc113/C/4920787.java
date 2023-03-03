public static Prefecture [ ] [ ] solve ( ) {
  Prefecture [ ] [ ] prefectures ;
  {
    int i = i ;
    int P = P ;
    int Y = Y ;
    {
      String upper = Integer . toString ( P ) ;
      while ( upper . length ( ) < 6 ) upper = "0" + upper ;
      String lower = Integer . toString ( x ) ;
      while ( lower . length ( ) < 6 ) lower = "0" + lower ;
      id = upper + lower ;
    }
  }
  {
    int N = Integer . parseInt ( input . nextLine ( ) ) ;
    int M = Integer . parseInt ( input . nextLine ( ) ) ;
    prefectures = new Prefecture [ ( N + 1 ) * M ] [ ] ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      prefectures [ i ] = null ;
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int p = Integer . parseInt ( input . nextLine ( ) ) ;
      int y = Integer . parseInt ( input . nextLine ( ) ) ;
      if ( prefectures [ p ] == null ) {
        prefectures [ p ] = new Prefecture [ M ] ;
        prefectures [ p ] [ 0 ] = new Prefecture ( i , p , y ) ;
      }
      else {
        prefectures [ p ] [ 0 ] . setY ( y ) ;
      }
    }
    List < Prefecture > ans = new ArrayList < > ( ) ;
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      if ( prefectures [ i ] == null ) continue ;
      Collections . sort ( prefectures [ i ] , new Comparator < Prefecture > ( ) {
        @ Override public int compare ( Prefecture o1 , Prefecture o2 ) {
          return o1 . Y - o2 . Y ;
        }
      }
      ) ;
      for ( int j = 0 ;
      j < prefectures [ i ] . length ;
      j ++ ) {
        prefectures [ i ] [ j ] . makeId ( j + 1 ) ;
        ans . add ( prefectures [ i ] [ j ] ) ;
      }
    }
    Collections . sort ( ans , new Comparator < Prefecture > ( ) {
      @ Override public int compare ( Prefecture o1 , Prefecture o2 ) {
        return o1 . i - o2 . i ;
      }
    }
    ) ;
    for ( Prefecture prefecture : ans ) System . out . println ( prefecture . id ) ;
  }
  