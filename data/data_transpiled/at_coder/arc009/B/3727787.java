private static void print ( Map < String , String > map ) {
  String [ ] B = input . split ( " " ) ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) {
    map . put ( B [ i ] , Integer . toString ( i ) ) ;
  }
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  List < int [ ] > a = new ArrayList < int [ ] > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String [ ] t = input . split ( " " ) ;
    StringBuffer u = new StringBuffer ( ) ;
    for ( int j = 0 ;
    j < t . length ;
    j ++ ) {
      u . append ( map . get ( t [ j ] ) ) ;
    }
    a . add ( new int [ ] {
      Integer . parseInt ( u . toString ( ) ) , t . length }
      ) ;
    }
    Collections . sort ( a , new Comparator < int [ ] > ( ) {
      public int compare ( int [ ] o1 , int [ ] o2 ) {
        return o1 . length - o2 . length ;
      }
    }
    ) ;
    for ( int [ ] v : a ) {
      System . out . println ( v [ 1 ] ) ;
    }
  }
  