public static final void main ( String input ) {
  if ( input . equals ( "" ) ) {
    String a = input ;
    int n = a . length ( ) ;
    int a = Integer . parseInt ( a ) ;
    int low = a * a ;
    int up = ( a + 1 ) * ( a + 1 ) ;
    int ans = low ;
    int b = low ;
    int div = 100 ;
    do {
      int add = div - b % div ;
      if ( add != div ) b += add ;
      if ( b < up ) ans = b ;
      else break ;
      div *= 100 ;
    }
    while ( ans % 100 == 0 ) ;
    ans /= 100 ;
    System . out . println ( ans ) ;
  }
}
