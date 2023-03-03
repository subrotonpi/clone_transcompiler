public static List < Integer > f ( int n , int a , int b ) {
  List < Integer > res = new ArrayList < Integer > ( ) ;
  for ( int i : input . split ( " " ) ) {
    if ( n == 1 ) {
      return Arrays . asList ( a , b ) ;
    }
    int mask = 1 << ( n - 1 ) ;
    if ( a & mask == b & mask ) {
      List < Integer > v1 = f ( n - 1 , a , b ) ;
      List < Integer > v2 = f ( n - 1 , a ^ mask , v1 . get ( 1 ) ^ mask ) ;
      List < Integer > ret = new ArrayList < Integer > ( ) ;
      ret . add ( a ) ;
      ret . addAll ( v2 ) ;
      ret . addAll ( v1 . subList ( 1 , v1 . size ( ) ) ) ;
      return ret ;
    }
    else {
      List < Integer > v1 = f ( n - 1 , a , a ^ 1 ) ;
      List < Integer > v2 = f ( n - 1 , a ^ 1 ^ mask , b ) ;
      v1 . addAll ( v2 ) ;
      return v1 ;
    }
  }
  if ( Integer . valueOf ( a ^ b ) . indexOf ( "1" ) % 2 == 0 ) {
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
    res = f ( n , a , b ) ;
    for ( Integer p : res ) {
      System . out . print ( p + " " ) ;
    }
  }
  return res ;
}
