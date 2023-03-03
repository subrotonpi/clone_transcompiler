public static int getSumOfSorted ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = input . nextLine ( ) ;
  String sl = s . substring ( 0 , n ) ;
  String sr = s . substring ( n ) . substring ( 0 , s . length ( ) - 1 ) ;
  @ SuppressWarnings ( "unchecked" ) LinkedHashMap < String , Integer > l = new LinkedHashMap < String , Integer > ( ) ;
  @ SuppressWarnings ( "unchecked" ) LinkedHashMap < String , Integer > r = new LinkedHashMap < String , Integer > ( ) ;
  @ SuppressWarnings ( "unchecked" ) Iterator < Boolean > iter = l . values ( ) . iterator ( ) ;
  while ( iter . hasNext ( ) ) {
    Boolean m = iter . next ( ) ;
    StringBuilder key = new StringBuilder ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) if ( ! m ) key . append ( sl . charAt ( i ) ) ;
    key . append ( '-' ) ;
    key . append ( sl . charAt ( i ) ) ;
    l . put ( key . toString ( ) , 1 ) ;
    key = new StringBuilder ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) if ( ! iter . hasNext ( ) ) key . append ( sr . charAt ( i ) ) ;
    key . append ( '-' ) ;
    key . append ( sr . charAt ( i ) ) ;
    r . put ( key . toString ( ) , 1 ) ;
  }
  int ans = l . size ( ) ;
  for ( int lk : l . keySet ( ) ) ans += r . get ( lk ) ;
  return ans ;
}
