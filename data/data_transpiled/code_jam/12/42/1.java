public static void testCount ( Scanner in ) {
  for ( int testIndex = 0 ;
  testIndex < testCount ;
  testIndex ++ ) {
    String ans = "Case #" + ( testIndex + 1 ) + ": " ;
    int n = in . nextInt ( ) , mx = in . nextInt ( ) , my = in . nextInt ( ) ;
    int [ ] ss = in . nextInt ( ) ;
    int [ ] [ ] s = new int [ ss . length ] [ ] ;
    for ( int i = 0 ;
    i < s . length ;
    i ++ ) {
      int a = in . nextInt ( ) ;
      s [ i ] [ 0 ] = i ;
    }
    Arrays . sort ( s , new Comparator < int [ ] > ( ) {
      @ Override public int compare ( int [ ] o1 , int [ ] o2 ) {
        return - o1 [ 1 ] ;
      }
    }
    ) ;
    int [ ] [ ] p = new int [ n ] [ 2 ] ;
    int cx = 0 , cy = 0 ;
    int ny = 0 ;
    for ( int i = 0 ;
    i < s . length ;
    i ++ ) {
      int l = s [ i ] [ 0 ] ;
      if ( cx > 0 ) cx += l ;
      if ( cx > mx ) {
        cx = 0 ;
        cy = ny + l ;
      }
      if ( cy > my ) {
        System . out . println ( " BUG ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !