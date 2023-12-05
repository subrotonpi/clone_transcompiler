public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int s = 0 ;
  for ( int a_ = 1 ;
  a_ <= 10 ;
  a_ ++ ) {
    for ( int b_ = 1 ;
    b_ <= 10 ;
    b_ ++ ) {
      s += ( a_ * b_ ) ;
    }
  }
  int diff = s - n ;
  ArrayList < String > a = new ArrayList < String > ( ) ;
  for ( int i = 1 ;
  i <= 10 ;
  i ++ ) {
    if ( ( ( ( diff % i ) == 0 ) ? ( diff / i ) : diff / i ) <= 9 ) {
      a . add ( String . valueOf ( i ) + " x " + diff / i ) ;
    }
  }
  for ( String a_ : a ) {
    System . out . println ( a_ ) ;
  }
}
