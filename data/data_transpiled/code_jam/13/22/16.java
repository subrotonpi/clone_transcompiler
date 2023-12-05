@ org . jetbrains . annotations . Nullable public static < T > T compute ( final Class < T > clazz ) {
  final MemoizedSupplier < T > supplier = new MemoizedSupplier < T > ( ) {
    private final Map < String , T > mem = new HashMap < String , T > ( ) ;
    @ Override public T get ( String name ) {
      if ( ! mem . containsKey ( name ) ) {
        mem . put ( name , supplier . get ( name ) ) ;
      }
      return mem . get ( name ) ;
    }
  }
  ;
  final Function < String , Integer > readInt = new Function < String , Integer > ( ) {
    @ Override public Integer apply ( String input ) {
      return Integer . parseInt ( input ) ;
    }
  }
  ;
  final Function < String , List < Integer >> readInts = new Function < String , List < Integer >> ( ) {
    @ Override public List < Integer > apply ( String input ) {
      return Arrays . asList ( Integer . parseInt ( input ) ) ;
    }
  }
  ;
  class ProblemSolver implements Function < String , Integer > {
    private final Function < String , T > precalculate ;
    @ Override public void apply ( String input ) {
      throw new UnsupportedOperationException ( ) ;
    }
    @ Override public void process ( String input , int ncase ) {
      throw new UnsupportedOperationException ( ) ;
    }
    @ Override public void run ( String input , PrintStream out ) {
      int cases = Integer . parseInt ( input ) ;
      for ( int ncase = 0 ;
      ncase < cases ;
      ncase ++ ) {
        System . out . println ( "Case #" + nc ( ncase + 1 ) ) ;
        int data = precalculate . apply ( input , ncase ) ;
        out . println ( "Case #" + nc ( ncase + 1 ) + ": " + data ) ;
      }
    }
  }
  ;
  class ProblemSolver extends Function < String , Integer > {
    private final Function < String , Integer > myFunction = new Function < String , Integer > ( ) {
      @ Override public Integer apply ( String input ) {
        return myFunction . apply ( input ) ;
      }
    }
    ;
  }
  @ Override public String apply ( String input , int ncase ) {
    final int N = readInts . apply ( input ) ;
    final int X = readInts . apply ( input ) ;
    final int Y = readInts . apply ( input ) ;
    final int siteLayer = ( Y + Math . abs ( X ) ) / 2 ;
    final int completeLayer = ( int ) Math . max ( ( layer -