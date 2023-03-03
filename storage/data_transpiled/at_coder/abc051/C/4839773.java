public static void drawLine ( int sx , int sy , int tx , int ty ) {
  int [ ] x = new int [ ] {
    sx , sy }
    ;
    int [ ] y = new int [ ] {
      sy , sy }
      ;
      String ans = "R" ;
      int x = tx - sx ;
      int y = ty - sy ;
      for ( int i = 0 ;
      i < x - 1 ;
      i ++ ) {
        ans += "R" ;
      }
      for ( int i = 0 ;
      i < y ;
      i ++ ) {
        ans += "U" ;
      }
    }
    