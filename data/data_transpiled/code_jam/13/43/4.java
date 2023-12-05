@ VisibleForTesting static void run ( ) {
  final MemoizedSupplier < HashMap < String , String >> mem = new MemoizedSupplier < HashMap < String , String >> ( ) {
    @ Override public HashMap < String , String > get ( ) {
      return mem ;
    }
    @ Override public String get ( String key ) {
      if ( ! mem . containsKey ( key ) ) {
        mem . put ( key , mem . get ( key ) ) ;
      }
      return mem . get ( key ) ;
    }
  }
  ;
  final IntSupplier readIntSupplier = new IntSupplier ( ) {
    @ Override public int get ( ) {
      return Integer . parseInt ( in . nextLine ( ) ) ;
    }
  }
  ;
  final IntSupplier readIntSupplier = new IntSupplier ( ) {
    @ Override public int get ( ) {
      return Integer . parseInt ( in . nextLine ( ) ) ;
    }
  }
  ;
  final IntSupplier readIntSupplier = new IntSupplier ( ) {
    @ Override public int get ( ) {
      return Integer . parseInt ( in . nextLine ( ) ) ;
    }
  }
  ;
  final String FILE = TASK ;
  @ Override public String getName ( ) {
    return FILE ;
  }
  @ Override public String toString ( ) {
    return "Task " + TASK ;
  }
}
