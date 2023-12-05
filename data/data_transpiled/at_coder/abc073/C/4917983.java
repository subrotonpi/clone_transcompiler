static final < T > Stream < T > stream ( ) {
  final Function < String , T > ns = new Function < String , T > ( ) {
    @ Override public T apply ( String input ) {
      return System . in . read ( ) . toString ( ) ;
    }
  }
  ;
  final Function < String , T > ni = new Function < String , T > ( ) {
    @ Override public T apply ( String input ) {
      return Integer . parseInt ( ns . apply ( input ) ) ;
    }
  }
  ;
  final Function < String , T > nm = new Function < String , T > ( ) {
    @ Override public T apply ( String input ) {
      return Integer . parseInt ( nm . apply ( input ) ) ;
    }
  }
  ;
  final int n = ni . apply ( ) ;
  final T [ ] a = new T [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = ni . apply ( n ) ;
  }
  final Collection < T > c = new Collection < T > ( a ) . values ( ) ;
  int ans = 0 ;
  for ( T t : c ) {
    if ( t % 2 != 0 ) {
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
  return a ;
}
