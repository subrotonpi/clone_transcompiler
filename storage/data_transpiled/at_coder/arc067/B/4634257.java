public static void main ( String input , int n , int a , int b ) {
  int l = Integer . parseInt ( input ) ;
  int s = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    s += Math . min ( ( l + 1 - l ) * a , b ) ;
  }
  System . out . println ( s ) ;
}
