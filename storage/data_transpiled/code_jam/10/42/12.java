static final int solve ( ) {
  System . setSecurityManager ( new RMISecurityManager ( ) ) ;
  final PlexusContainer container = new PlexusContainer ( ) {
    @ Override public PlexusContainer proxy ( PlexusContainer function ) {
      return PlexusContainer . proxy ( function ) ;
    }
    @ Override public PlexusContainer memoize ( PlexusContainer function ) {
      return new PlexusContainer ( ) {
        private final HashMap < String , PlexusContainer > cache = new HashMap < String , PlexusContainer > ( ) ;
        @ Override public PlexusContainer read ( PlexusContainer ... args ) {
          return cache . get ( args ) ;
        }
        @ Override public PlexusContainer read ( PlexusContainer line ) {
          if ( cache . containsKey ( line ) ) {
            return cache . get ( line ) ;
          }
          else {
            PlexusContainer result = line . getValue ( ) ;
            cache . put ( line , result ) ;
            return result ;
          }
        }
        @ Override public PlexusContainer run ( ) {
          InputStream in = new InputStream ( System . in ) ;
          Contents s = new Contents ( in ) ;
          int numCases = Integer . parseInt ( s . read ( ) ) ;
          for ( int caseNum = 0 ;
          caseNum < numCases ;
          caseNum ++ ) {
            PlexusContainer case = new Case ( s , caseNum ) ;
            System . out . println ( "Case #" + ( caseNum + 1 ) + ": " + case . solve ( ) ) ;
            System . out . flush ( ) ;
          }
          return null ;
        }
      }
      ;
    }
  }
  ;
  PlexusContainer container = new PlexusContainer ( container ) {
    @ Override public PlexusContainer run ( PlexusContainer s , int caseNum ) {
      return s ;
    }
  }
  ;
  container . setCaseNum ( caseNum ) ;
  container . setP ( Integer . parseInt ( s . read ( ) ) ) ;
  container . setMisables ( Integer . parseInt ( s . read ( ) ) ) ;
  container . setCosts ( new int [ ] {
    Integer . parseInt ( s . read ( ) ) }
    ) ;
    container . setCosts ( new int [ ] {
      Integer . parseInt ( s . read ( ) ) }
      ) ;
      container . solve ( ) ;
      container . solve ( ) ;
      container . solve ( ) ;
      container . solve ( ) ;
      container . solve ( ) ;
      container . solve ( ) ;
      container . solve ( ) ;
      return