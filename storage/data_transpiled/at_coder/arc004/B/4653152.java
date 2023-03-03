public static void print ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  s = 0 ;
  mi = Double . MAX_VALUE ;
  ArrayList < Integer > d = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    s += a ;
    d . add ( a ) ;
  }
  int ma = Math . max ( d . size ( ) , ma ) ;
  int q = s - ma ;
  System . out . println ( s ) ;
  System . out . println ( Math . max ( 0 , ma - q ) ) ;
}
