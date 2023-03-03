static int simpleSolve ( int N , String S ) {
  TreeSet < String > set = new TreeSet < String > ( S ) ;
  int cnt = 0 ;
  for ( String perm : new String [ ] {
    S }
    ) {
      String z = new String ( perm ) ;
      boolean [ ] chars = new boolean [ 26 ] ;
      for ( int t = 1 ;
      t <= T ;
      t ++ ) {
        chars [ t ] = false ;
      }
      char last = '\0' ;
      for ( char c : z . toCharArray ( ) ) {
        if ( last == c ) continue ;
        last = c ;
        if ( chars [ ( c - 'a' ) ] ) break ;
        chars [ ( c - 'a' ) ] = true ;
      }
      else cnt ++ ;
    }
    {
      int N = Integer . parseInt ( scanner . nextLine ( ) ) ;
      String [ ] rz = new String [ 26 ] ;
      for ( int c = 0 ;
      c < N ;
      c ++ ) {
        char c = ( char ) ( c + 'a' ) ;
        int cnt_inside = 0 ;
        int cnt_left = 0 ;
        int cnt_right = 0 ;
        int cnt_full = 0 ;
        char left_char = 0 ;
        char right_char = "" ;
        for ( String z : set ) {
          boolean h = false ;
          char last = '\0' ;
          for ( char x : z . toCharArray ( ) ) {
            if ( x == c && h && last != c ) return 0 ;
            if ( x == c ) h = true ;
            last = x ;
          }
          if ( z . charAt ( 0 ) == z . charAt ( z . length ( ) - 1 ) == c ) cnt_full ++ ;
          else if ( z . charAt ( 0 ) == c ) {
            cnt_left ++ ;
            right_char = z . charAt ( z . length ( ) - 1 ) ;
          }
          else if ( z . charAt ( z . length ( ) - 1 ) == c ) {
            cnt_right ++ ;
            left_char = z . charAt ( 0 ) ;
          }
          else if ( h ) cnt_inside ++ ;
        }
        if ( cnt_inside > 1 || cnt_inside > 0 && cnt_left + cnt_right + cnt_full > 0 || cnt_left > 1 || cnt_right > 1 ) return 0 ;
        if ( cnt_inside == 0 && cnt_left + cnt_right + cnt_full > 0 ) rz [ c ] = ( new Integer ( left_char ) ) . intValue ( ) ;
        bb *= v . length