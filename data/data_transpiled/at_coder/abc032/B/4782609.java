public static void input ( ) {
  String s = input ( ) ;
  int n = Integer . parseInt ( input ( ) ) ;
  int l = s . length ( ) ;
  List < String > ans = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < l - n + 1 ;
  i ++ ) {
    ans . add ( s . substring ( i , i + n ) ) ;
  }
  System . out . println ( Collections . frequency ( ans ) ) ;
}
