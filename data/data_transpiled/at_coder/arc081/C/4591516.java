@ collections . Counter public static String print ( ) {
  String s = input ( ) ;
  {
    int num = ( int ) letter . charAt ( 0 ) - 97 ;
    char let = ( char ) ( number . charAt ( 0 ) + 97 ) ;
    int ok = 0 ;
    int ng = s . length ( ) ;
    boolean [ ] used = new boolean [ 26 ] ;
    int tmp = 0 ;
    int cnt = 0 ;
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      if ( used [ num ( s . charAt ( i ) ) ] == false ) {
        used [ num ( s . charAt ( i ) ) ] = true ;
        tmp ++ ;
      }
      if ( tmp == 26 ) {
        cnt ++ ;
        tmp = 0 ;
        used = new boolean [ 26 ] ;
      }
    }
    int prm = cnt + 1 ;
    if ( prm == 1 ) {
      for ( int j = 0 ;
      j < 26 ;
      j ++ ) {
        if ( used [ j ] == false ) {
          System . out . println ( let ( j ) ) ;
          break ;
        }
      }
    }
    else {
      int [ ] d = new int [ 26 ] ;
      used = new boolean [ 26 ] ;
      tmp = 0 ;
      for ( int i = s . length ( ) - 1 ;
      i >= 0 ;
      i -- ) {
        if ( used [ num ( s . charAt ( i ) ) ] == false ) {
          used [ num ( s . charAt ( i ) ) ] = true ;
          tmp ++ ;
        }
        if ( tmp == 26 ) {
          tmp = 0 ;
          used = new boolean [ 26 ] ;
          d [ cnt ] = i ;
        }
      }
      Arrays . sort ( d ) ;
      String ans = "" ;
      cnt = 0 ;
      int i = 0 ;
      boolean skip = false ;
      used = new boolean [ 26 ] ;
      for ( i = 0 ;
      i < s . length ( ) ;
      i ++ ) {
        if ( cnt < prm - 1 ) {
          if ( i == d [ cnt ] ) {
            for ( int j = 0 ;
            j < 26 ;
            j ++ ) {
              if ( used [ j ] == false ) {
                ans += let ( j ) ;
                break ;
              }
            }
            used = new boolean [ 26 ] ;
            cnt ++ ;
            skip = true ;
          }
        }
        if ( skip ) {
          if ( s . charAt ( i ) == ans . charAt ( ans . length ( ) - 1 ) ) {
            skip = false ;
          }
          continue ;
        }
        if ( used [ num ( s . charAt ( i ) )