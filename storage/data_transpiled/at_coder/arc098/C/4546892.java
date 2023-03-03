public static int solve ( int n , int k , int q , List < Integer > a ) {
  List < Pair < Integer , Integer >> sortedPairs = a . stream ( ) . map ( ai -> Pair . of ( ai , i ) ) . collect ( Collectors . toList ( ) ) ;
  Collections . sort ( sortedPairs ) ;
  int ans = 10 * 10 ;
  List < Pair < Integer , Integer >> segments = new ArrayList < > ( ) ;
  segments . add ( new Pair < > ( 0 , n ) ) ;
  int ly = 0 ;
  for ( int i = 0 ;
  i < n - q + 1 ;
  i ++ ) {
    int y = sortedPairs . get ( i ) . compareTo ( a . get ( i ) ) ;
    final int left = sortedPairs . get ( i ) . getLeft ( ) ;
    if ( y == ly ) {
      continue ;
    }
    ly = y ;
    List < Integer > b = new ArrayList < > ( ) ;
    for ( int left = 0 ;
    left < left ;
    left ++ ) {
      int right = sortedPairs . get ( i ) . getRight ( ) ;
      if ( k <= right - left ) {
        List < Integer > c = a . subList ( left , right ) . stream ( ) . map ( a :: get ) . collect ( Collectors . toList ( ) ) ;
        Collections . sort ( c ) ;
        b . addAll ( c . subList ( 0 , right - left - k + 1 ) ) ;
      }
    }
    if ( q <= b . size ( ) ) {
      Collections . sort ( b ) ;
      int x = b . get ( q - 1 ) ;
      ans = Math . min ( ans , x - y ) ;
    }
    int iEnd = n - q + 1 ;
    for ( int i2 = i + 1 ;
    i2 <= n - q ;
    i2 ++ ) {
      if ( sortedPairs . get ( i2 ) . getLeft ( ) != y ) {
        iEnd = i2 ;
        break ;
      }
    }
    for ( int i2 = i ;
    i2 < iEnd ;
    i2 ++ ) {
      final int j = sortedPairs . get ( i2 ) . getRight ( ) ;
      for ( int h = 0 ;
      h < segments . size ( ) ;
      h ++ ) {
        final Pair < Integer , Integer > seg = segments . get ( h ) ;
        final int left = seg . getLeft ( ) ;
        final int right = seg . getRight ( ) ;
        if ( left <= j && j < right ) {
          segments . remove ( h ) ;
          segments . add ( new