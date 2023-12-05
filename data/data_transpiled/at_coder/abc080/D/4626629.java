public static void main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int C = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] [ ] [ ] dic = new int [ C + 1 ] [ ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final String s = input . nextLine ( ) ;
    final String t = input . nextLine ( ) ;
    final int c = Integer . parseInt ( s ) ;
    dic [ Integer . parseInt ( c ) ] [ i ] = new int [ ] {
      Integer . parseInt ( s ) , Integer . parseInt ( t ) }
      ;
    }
    for ( int c = 0 ;
    c < C + 1 ;
    c ++ ) {
      final int l = dic [ c ] . length ;
      if ( l == 1 ) {
        continue ;
      }
      Arrays . sort ( dic [ c ] ) ;
      int i = 0 ;
      while ( i < l - 1 ) {
        if ( i < l - 1 && dic [ c ] [ i ] [ 1 ] == dic [ c ] [ i + 1 ] [ 0 ] ) {
          dic [ c ] [ i + 1 ] [ 0 ] ++ ;
        }
        else {
          i ++ ;
        }
      }
    }
    final int [ ] f = new int [ 100002 ] ;
    for ( int c = 0 ;
    c < C + 1 ;
    c ++ ) {
      for ( int [ ] t : dic [ c ] ) {
        f [ t [ 0 ] ] ++ ;
        f [ t [ 1 ] + 1 ] -- ;
      }
    }
    int ans = 0 ;
    for ( int i = 1 ;
    i < 100001 ;
    i ++ ) {
      f [ i ] += f [ i - 1 ] ;
      if ( ans < f [ i ] ) {
        ans = f [ i ] ;
      }
    }
    System . out . println ( ans ) ;
  }
  