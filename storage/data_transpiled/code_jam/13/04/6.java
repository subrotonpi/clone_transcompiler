static final Scanner in = new Scanner ( System . in ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  final int n = scanner . nextInt ( ) ;
  final int [ ] chests = chests . values ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    chests [ i ] = scanner . nextInt ( ) ;
  }
  final Map < String , Chest > list = new HashMap < String , Chest > ( ) ;
  for ( String k : keys ) {
    list . addAll ( chests . get ( k ) ) ;
  }
  Collections . sort ( list , new Comparator < Chest > ( ) {
    final Chest c = list . get ( chests [ 0 ] ) ;
    @ Override public int compare ( Chest o1 , Chest o2 ) {
      return c . id - o1 . id ;
    }
  }
  ) ;
  final Map < String , Chest > newKeys = new HashMap < String , Chest > ( ) ;
  newKeys . put ( chestKey , chests . get ( chestKey ) ) ;
  chestsList . add ( chest ) ;
  final boolean valid = false ;
  if ( preCheck ( chests , myKeys ) ) valid = treasure ( myKeys , chests ) ;
  if ( valid != null ) {
    final String openListS = " " . concat ( Arrays . toString ( valid ) ) ;
    for ( int i = 0 ;
    i < valid ;
    i ++ ) {
      newKeys . remove ( valid . get ( i ) ) ;
    }
  }
  final String openFiles = " " ;
  final List < Chest > keys = new ArrayList < Chest > ( ) ;
  final Iterator < Chest > it = chests . values ( ) . iterator ( ) ;
  while ( it . hasNext ( ) ) {
    keys . addAll ( it . next ( ) . chests ) ;
  }
  final File o = new File ( openFiles ) ;
  if ( it . hasNext ( ) ) {
    final File f = new File ( it . next ( ) ) ;
    o . delete ( ) ;
  }
  final Scanner scanner = new Scanner ( o ) ;
  scanner . close ( ) ;
  return scanner ;
}
