public static void main ( String [ ] args ) {
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  double ans = - 10 * 9 ;
  int [ ] [ ] f = new int [ 10 ] [ n ] ;
  int [ ] [ ] p = new int [ 11 ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    f [ i ] = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        f [ i ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
      }
    }
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      p [ j ] = new int [ n ] ;
      for ( int k = 0 ;
      k < n ;
      k ++ ) {
        p [ k ] [ k ] = Integer . parseInt ( input . nextLine ( ) ) ;
      }
    }
    ans = - Double . MAX_VALUE ;
    for ( int i0 = 0 ;
    i0 < n ;
    i0 ++ ) {
      int i1 = 0 ;
      int i2 = 0 ;
      int i3 = 0 ;
      int i4 = 0 ;
      int i5 = 0 ;
      int i6 = 0 ;
      int i7 = 0 ;
      int i8 = 0 ;
      int i9 = 0 ;
      int i9 = 0 ;
      int i0 = 0 ;
      int i1 = 0 ;
      int i1 = 0 ;
      int i2 = 0 ;
      int i3 = 0 ;
      int i4 = 0 ;
      int i5 = 0 ;
      int i6 = 0 ;
      int i7 = 0 ;
      int i6 = 0 ;
      int i7 = 0 ;
      int i7 = 0 ;
      int i8 = 0 ;
      int i9 = 0 ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        i3 = i ;
        i4 = i ;
        i5 = i ;
        i6 = i ;
        i7 = i ;
        i8 = i ;
      }
      ans = Math . max ( ans , i1 + i4 ) ;
    }
  }
  System . out . println ( ans ) ;
}
