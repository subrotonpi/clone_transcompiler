static final String getExample ( ) {
  final String className = "java.util.concurrent.atomic.AtomicLong" ;
  final double INF = Double . MAX_VALUE ;
  System . setProperty ( className , "java.util.concurrent.atomic.AtomicLong" ) ;
  final double [ ] dy = {
    0 , - 1 , 0 , 1 }
    ;
    final double [ ] dx = {
      1 , 0 , - 1 , 0 }
      ;
      final int N = Integer . parseInt ( input . nextLine ( ) ) ;
      final int X = Integer . parseInt ( input . nextLine ( ) ) ;
      final int [ ] wArray = {
        Integer . parseInt ( input . nextLine ( ) ) }
        ;
        final int [ ] wList1 = {
          Integer . parseInt ( input . nextLine ( ) ) }
          ;
          final int [ ] wList2 = {
            Integer . parseInt ( input . nextLine ( ) ) }
            ;
            final int [ ] wList3 = {
              Integer . parseInt ( input . nextLine ( ) ) }
              ;
              final int [ ] wList4 = {
                Integer . parseInt ( input . nextLine ( ) ) }
                ;
                final int [ ] wList3 = {
                  Integer . parseInt ( input . nextLine ( ) ) }
                  ;
                  final int [ ] wList4 = {
                    Integer . parseInt ( input . nextLine ( ) ) }
                    ;
                    final int [ ] wList3 = {
                      Integer . parseInt ( input . nextLine ( ) ) }
                      ;
                      final int [ ] wList4 = {
                        Integer . parseInt ( input . nextLine ( ) ) }
                        ;
                        final int [ ] wList3 = {
                          Integer . parseInt ( input . nextLine ( ) ) }
                          ;
                          final int [ ] wList4 = {
                            Integer . parseInt ( input . nextLine ( ) ) }
                            ;
                            final int [ ] wList3 = {
                              Integer . parseInt ( input . nextLine ( ) ) }
                              ;
                              final int [ ] wList4 = {
                                Integer . parseInt ( input . nextLine ( ) ) }
                                ;
                                final int n = wList3 . length ;
                                final int [ ] s = new int [ n ] ;
                                for ( int b = 0 ;
                                b < 2 * n ;
                                b ++ ) {
                                  int total = 0 ;
                                  for ( int i = 0 ;
                                  i < n ;
                                  i ++ ) {
                                    if ( ( b & 1 << i ) != 0 ) {
                                      total += wList3 [ i ] ;
                                    }
                                  }
                                  s [ n - 1 ] = total ;
                                  n = wList4 . length ;
                                  final int [ ] d = {
                                    Integer . parseInt ( input . nextLine ( ) ) }
                                    ;
                                    d [ n -