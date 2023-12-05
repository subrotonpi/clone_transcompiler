@ VisibleForTesting static void from ( @ NotNull List < Tuple2 < Integer , Integer >> input ) {
  int N = input . size ( ) ;
  int K = input . get ( 0 ) ;
  List < Tuple2 < Integer , Integer >> sushi = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    sushi . add ( new Tuple2 < > ( input . get ( i ) ) ) ;
  }
  List < Tuple2 < Integer , Integer >> allSushi = new ArrayList < > ( sushi ) ;
  Collections . sort ( sushi , new Comparator < Tuple2 < Integer , Integer >> ( ) {
    @ Override public int compare ( Tuple2 < Integer , Integer > o1 , Tuple2 < Integer , Integer > o2 ) {
      return - o1 . _2 ;
    }
  }
  ) ;
  List < Tuple2 < Integer , Integer >> defaultSushi = allSushi . subList ( 0 , K ) ;
  List < Tuple2 < Integer , Integer >> amari = allSushi . subList ( K , allSushi . size ( ) ) ;
  int lenAmari = amari . size ( ) ;
  final AtomicInteger counter = new AtomicInteger ( ) ;
  final AtomicInteger counter = new AtomicInteger ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    counter . set ( counter . get ( i ) . _1 ) ;
  }
  final AtomicInteger fs = new AtomicInteger ( ) ;
  final Runnable r = new Runnable ( ) {
    @ Override public void run ( ) {
      int oishisa = new AtomicInteger ( ) ;
      fs . set ( counter . get ( i ) . _2 ) ;
      fs . add ( oishisa + counter . get ( i ) . _2 ) ;
    }
  }
  ;
  r . run ( ) ;
}
