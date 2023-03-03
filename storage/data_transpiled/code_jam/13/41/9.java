@ org . jetbrains . annotations . Nullable public static String getTask ( ) {
  @ org . jetbrains . annotations . Nullable final Function < String , String > memoized = new org . jetbrains . annotations . internal . compiler . util . concurrent . memoize . Function < String , String > ( ) {
    @ org . jetbrains . annotations . Nullable @ Override public String apply ( String input ) {
      final Map < String , String > mem = new HashMap < > ( ) ;
      @ Override public String get ( String key ) {
        if ( ! mem . containsKey ( key ) ) {
          mem . put ( key , input ) ;
        }
        else {
          FILE = TASK ;
        }
        System . out . println ( "Initialization done." ) ;
        return mem . get ( key ) ;
      }
    }
    ;
    final Function < String , Integer > readInt = new Function < String , Integer > ( ) {
      @ Override public Integer apply ( String input ) {
        return Integer . parseInt ( input ) ;
      }
    }
    ;
    final Function < String , Integer > readInts = new Function < String , Integer > ( ) {
      @ Override public Integer apply ( String input ) {
        return Integer . parseInt ( input ) ;
      }
    }
    ;
    @ Override public String apply ( String input ) {
      return FILE + ".in" ;
    }
  }
  ;
  final Function < String , Integer > readInt = new Function < String , Integer > ( ) {
    @ Override public Integer apply ( String input ) {
      return readInt . apply ( input ) ;
    }
  }
  ;
  final Function < String , Integer > readInt = new Function < String , Integer > ( ) {
    @ Override public Integer apply ( String input ) {
      return readInt . apply ( input ) ;
    }
  }
  ;
  final Function < String , Integer > readInt = new Function < String , Integer > ( ) {
    @ Override public Integer apply ( String input ) {
      return readInt . apply ( input ) ;
    }
  }
  ;
  final Function < String , Integer > readInt = new Function < String , Integer > ( ) {
    @ Override public Integer apply ( String input ) {
      return readInt . apply ( input ) ;
    }
  }
  ;
  final Function < String , Integer > solver = new Function < String , Integer > ( ) {
    @ Override public Integer apply ( String input ) {
      return solver . run ( input , readInt ) ;
    }
  }
  ;
  return new String ( ) {
    @ Override public Integer apply ( String input ) {
      return solver . apply ( input ) ;
    }
  }
  ;
}
