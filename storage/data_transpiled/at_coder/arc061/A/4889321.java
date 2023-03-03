public static void input ( ) {
  long ans = 0 ;
  ArrayList < String > memo = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < 1 << s . length - 1 ;
  i ++ ) {
    String tmp = s . substring ( 0 , 1 ) ;
    for ( int j = 0 ;
    j < s . length - 1 ;
    j ++ ) {
      if ( ( ( i >> j ) & 1 ) != 0 ) tmp += "+" ;
      tmp += s . substring ( j + 1 ) ;
    }
    if ( ! memo . contains ( tmp ) ) {
      ans += new Long ( tmp ) ;
      memo . add ( tmp ) ;
    }
  }
  System . out . println ( ans ) ;
}
