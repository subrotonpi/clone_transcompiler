public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int a = 2025 - n ;
  ArrayList < Integer > divs = new ArrayList < Integer > ( ) ;
  for ( int i = 1 ;
  i <= ( int ) ( a * 0.5 ) ;
  i ++ ) {
    if ( a % i == 0 ) {
      divs . add ( i ) ;
      if ( i != a / i ) {
        divs . add ( a / i ) ;
      }
    }
  }
  Collections . sort ( divs ) ;
  for ( int x : divs ) {
    int y = ( int ) ( a / x ) ;
    if ( x < 10 && y < 10 ) {
      System . out . println ( x + " x " + y ) ;
    }
  }
}
