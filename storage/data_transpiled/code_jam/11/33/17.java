static final String print ( String ... st ) {
  final StringBuilder sb = new StringBuilder ( ) ;
  final Scanner input = new Scanner ( System . in ) ;
  final int N = input . nextInt ( ) ;
  final int l = input . nextInt ( ) ;
  int [ ] orchestra = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int n = input . nextInt ( ) ;
    final int l = input . nextInt ( ) ;
    final int h = input . nextInt ( ) ;
    orchestra [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    final int [ ] notes = new int [ n ] ;
    for ( int i = l ;
    i <= h ;
    i ++ ) {
      notes [ i ] = i ;
    }
    for ( int l = 0 ;
    l < orchestra . length ;
    l ++ ) {
      int i = 0 ;
      while ( i < notes . length ) {
        if ( notes [ i ] % l == 0 || l % notes [ i ] == 0 ) {
          i ++ ;
        }
        else {
          notes [ i ] = i ;
        }
      }
      printe ( notes ) ;
    }
    if ( notes . length == 0 ) {
      return "NO" ;
    }
    else {
      return notes [ 0 ] ;
    }
  }
  if ( className . equals ( "java.util.Scanner" ) ) {
    for ( int i = 0 ;
    i < Integer . parseInt ( input . nextLine ( ) ) ;
    i ++ ) {
      System . out . println ( "Case #" + ( i + 1 ) + ": " + simulate ( ) ) ;
    }
  }
  return sb . toString ( ) ;
}
