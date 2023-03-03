public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > list = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    list . add ( i ) ;
  }
  Collections . sort ( list ) ;
  long ans = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    ans += ( - 1 ) * ( i - 1 ) * list . get ( list . size ( ) - i ) ;
  }
  System . out . println ( ans ) ;
}
