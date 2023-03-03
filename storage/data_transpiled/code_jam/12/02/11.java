@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicReference" ) public static < T > void process ( final Supplier < T > supplier ) throws IOException {
  final MemoizedSupplier < T > mem = supplier :: get ;
  final Function < T , T > readInteger = new Function < T , T > ( ) {
    @ Override public T apply ( T input ) {
      if ( ! mem . containsKey ( input ) ) {
        mem . put ( input , supplier . get ( input ) ) ;
      }
      return input ;
    }
  }
  ;
  final Function < T , Integer > readInts = new Function < T , Integer > ( ) {
    @ Override public Integer apply ( T input ) {
      return Integer . parseInt ( input . toString ( ) ) ;
    }
  }
  ;
  final Function < T , Integer > readInts = new Function < T , Integer > ( ) {
    @ Override public Integer apply ( T input ) {
      return ( Integer ) readInts . apply ( input ) ;
    }
  }
  ;
  @ SuppressWarnings ( "unchecked" ) @ Override public T apply ( T input ) {
    return ( T ) readInts . apply ( input ) ;
  }
  ;
}
