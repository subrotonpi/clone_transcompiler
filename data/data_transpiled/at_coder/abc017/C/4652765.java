public static void input ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int m = Integer . parseInt ( input . readLine ( ) ) ;
  List < List < Integer >> info = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) info . add ( Collections . singletonList ( input . readLine ( ) ) ) ;
  int [ ] imos = new int [ m + 2 ] ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    imos [ i ] = imos [ i ] + imos [ i - 1 ] ;
  }
  System . out . println ( ans - Math . min ( imos , 1 , imos . length - 1 ) ) ;
}
