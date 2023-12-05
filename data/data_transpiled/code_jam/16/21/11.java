static void print ( String input ) throws IOException {
  Scanner scanner = new Scanner ( System . in ) ;
  String nn [ ] = {
    "ZERO" , "ONE" , "TWO" , "THREE" , "FOUR" , "FIVE" , "SIX" , "SEVEN" , "EIGHT" , "NINE" }
    ;
    int tn = scanner . nextInt ( ) ;
    for ( int test = 1 ;
    test <= tn ;
    test ++ ) {
      String s = scanner . next ( ) ;
      HashMap < String , Integer > v = new HashMap < String , Integer > ( ) ;
      for ( String x : s . split ( " " ) ) {
        if ( ! v . containsKey ( x ) ) v . put ( x , 0 ) ;
        v . put ( x , ++ counter ) ;
      }
      int cnt [ ] = new int [ 10 ] ;
      HashSet < String > used = new HashSet < String > ( ) ;
      while ( used . size ( ) < 10 ) {
        for ( String x : nn ) {
          if ( ! used . contains ( x ) ) {
            String good = "$" ;
            for ( String t : x . split ( " " ) ) {
              boolean canT = true ;
              for ( String z : nn ) {
                if ( ! used . contains ( z ) && z != x && t . contains ( z ) ) canT = false ;
              }
              if ( canT ) {
                good = t ;
                break ;
              }
            }
            if ( good != "$" ) {
              used . add ( x ) ;
              for ( int z = 0 ;
              z < nn . length ;
              z ++ ) {
                if ( nn [ z ] . equals ( x ) ) {
                  int ind = z ;
                  break ;
                }
              }
              if ( v . containsKey ( good ) ) {
                cnt [ z ] = v . get ( good ) ;
                for ( int z = 0 ;
                z < x . length ( ) ;
                z ++ ) {
                  if ( v . containsKey ( x ) ) v . put ( x , cnt [ z ] -- ) ;
                }
              }
            }
          }
        }
      }
      System . out . println ( "Case #" + test + ":" + Arrays . toString ( v . values ( ) ) ) ;
    }
  }
  