static final int [ ] max ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] s = new String [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) s [ i ] = input . nextLine ( ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] t = new String [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) t [ i ] = input . nextLine ( ) ;
  HashMap < String , Integer > smax = new HashMap < String , Integer > ( s ) ;
  HashMap < String , Integer > tmax = new HashMap < String , Integer > ( t ) ;
  ArrayList < Integer > ans = new ArrayList < Integer > ( ) ;
  for ( Map . Entry < String , Integer > entry : smax . entrySet ( ) ) {
    ans . add ( entry . getValue ( ) ) ;
  }
  return ans . toArray ( ) ;
}
