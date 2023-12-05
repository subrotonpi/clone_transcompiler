II ) public static int II = new Integer ( ) {
  @ Override public void run ( ) {
    for ( int t = 1 ;
    t <= II . length ;
    t ++ ) {
      System . out . printf ( "Case #%d:" , t ) ;
      String s = scanner . nextLine ( ) . trim ( ) ;
      int n = Integer . parseInt ( s . substring ( 0 , s . length ( ) - 1 ) . replace ( '+' , '0' ) . replace ( '-' , '1' ) , 2 ) ;
      int a = 0 ;
      while ( n > 0 ) {
        a += n & 3 == 1 || n & 3 == 2 ;
        n >>= 1 ;
      }
      System . out . println ( a ) ;
    }
  }
}
