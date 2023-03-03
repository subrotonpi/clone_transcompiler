static final int getBase ( ) {
  System . setSecurityManager ( new SecurityManager ( ) {
    private final int INF = 10 * * 18 ;
    private final int MOD = 10 * * 9 + 7 ;
    @ Override public int [ ] checkPermission ( Permission permission ) {
      return new int [ ] {
        INF , MOD }
        ;
      }
      @ Override public int [ ] checkPermission ( Permission permission ) {
        return new int [ ] {
          INF , MOD }
          ;
        }
        @ Override public int [ ] checkPermission ( Permission permission ) {
          return new int [ ] {
            MOD }
            ;
          }
          @ Override public int [ ] checkPermission ( Permission permission ) {
            return new int [ ] {
              INF , MOD }
              ;
            }
          }
          ) ;
          return INF ;
        }
        