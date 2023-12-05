public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  List < Integer > xyz = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) xyz . add ( Integer . parseInt ( input ) ) ;
  int ans = 0 ;
  for ( int bit = 0 ;
  bit < 2 * 3 ;
  bit ++ ) {
    List < Integer > s = new ArrayList < > ( ) ;
    int [ ] isPlus = {
      1 , 1 , 1 }
      ;
      for ( int i = 0 ;
      i < 3 ;
      i ++ ) {
        if ( ( bit >> i & 1 ) != 0 ) isPlus [ i ] = - 1 ;
      }
      Iterator < Integer > iterator = xyz . iterator ( ) ;
      while ( iterator . hasNext ( ) ) s . add ( iterator . next ( ) * isPlus [ 0 ] + iterator . next ( ) * isPlus [ 1 ] + iterator . next ( ) * isPlus [ 2 ] ) ;
      Collections . sort ( s , Collections . reverseOrder ( ) ) ;
      ans = Math . max ( ans , Integer . valueOf ( s . subList ( 0 , m ) ) ) ;
    }
    System . out . println ( ans ) ;
  }
  