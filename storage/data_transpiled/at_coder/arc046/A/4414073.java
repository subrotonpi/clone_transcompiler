public static void print ( ) {
  int n = input . nextInt ( ) ;
  int s = n % 9 ;
  int l = n / 9 ;
  if ( s == 0 ) {
    s = 9 ;
    l -- ;
  }
  StringBuilder ans = new StringBuilder ( String . valueOf ( s ) ) ;
  for ( int i = 0 ;
  i < l ;
  i ++ ) ans . append ( String . valueOf ( i ) ) ;
  System . out . println ( ans . toString ( ) ) ;
}
