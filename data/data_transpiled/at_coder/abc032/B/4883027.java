public static void input ( ) {
  String s = input ( ) ;
  int k = Integer . parseInt ( input ( ) ) ;
  ArrayList < String > plist = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) - k + 1 ;
  i ++ ) {
    String tmp = s . substring ( i , i + k ) ;
    if ( ! tmp . equals ( "" ) ) {
      plist . add ( tmp ) ;
    }
  }
  System . out . println ( plist . size ( ) ) ;
}
