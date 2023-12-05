public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ma = max ( a ) ;
  long diff = 100000000000000 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int aa = a [ i ] ;
    long t = Math . abs ( ma / 2 - aa ) ;
    if ( ma != aa && diff > t ) {
      diff = t ;
      ans = aa ;
    }
  }
  System . out . println ( ma + " " + ans ) ;
}
