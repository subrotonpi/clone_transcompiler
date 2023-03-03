public static void input ( ) {
  String s = input . nextLine ( ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  ArrayList < String > anss = new ArrayList < String > ( ) ;
  if ( n > s . length ( ) ) {
    System . out . println ( ans ) ;
  }
  else {
    for ( int i = 0 ;
    i < s . length ( ) - n + 1 ;
    i ++ ) {
      if ( ! anss . contains ( s . substring ( i , i + n ) ) ) {
        anss . add ( s . substring ( i , i + n ) ) ;
        ans ++ ;
      }
    }
  }
  System . out . println ( ans ) ;
}
