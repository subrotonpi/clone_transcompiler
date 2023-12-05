static final Scanner solve = new Scanner ( System . in ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  final String nextLine = scanner . nextLine ( ) . trim ( ) ;
  final int [ ] col = new int [ scanner . nextInt ( ) ] ;
  scanner . nextLine ( ) . trim ( ) ;
  final int [ ] [ ] diag = new int [ scanner . nextInt ( ) ] [ scanner . nextInt ( ) ] ;
  scanner . nextLine ( ) . trim ( ) ;
  final int [ ] [ ] res = test ( diag ) ;
  if ( scanner . hasNext ( ) ) {
    return res ;
  }
  scanner . nextLine ( ) . trim ( ) ;
  final int [ ] [ ] diag = new int [ scanner . nextInt ( ) ] [ scanner . nextInt ( ) ] ;
  scanner . nextLine ( ) . trim ( ) ;
  final int [ ] [ ] res = test ( diag ) ;
  if ( scanner . hasNext ( ) ) {
    return res ;
  }
  scanner . nextLine ( ) . trim ( ) ;
  return "Game has not completed" ;
}
;
final String DEBUG = "i" ;
@ SuppressWarnings ( {
  "rawtypes" , "unchecked" }
  ) final String [ ] [ ] cases = {
    {
      "" }
      , {
        "" }
        , {
          "" }
          , {
            "" }
            , {
              "" }
              , {
                "" }
                , {
                  "" }
                  , {
                    "" }
                    , {
                      "" }
                      , {
                        "" }
                        , {
                          "" }
                          , {
                            "" }
                            , {
                              "" }
                              , {
                                "" }
                                , {
                                  "" }
                                  , {
                                    "" }
                                    , {
                                      "" }
                                      , {
                                        "" }
                                        , {
                                          "" }
                                          , {
                                            "" }
                                            , {
                                              "" }
                                              , {
                                                "" }
                                                , {
                                                  "" }
                                                  , {
                                                    "" }
                                                    , {
                                                      "" }
                                                      , {
                                                        "" }
                                                        , {
                                                          "" }
                                                          , {
                                                            "" }
                                                            , {
                                                              "" }
                                                              , {
                                                                "" }
                                                                , {
                                                                  "" }
                                                                  , {
                                                                    "" }
                                                                    , {
                                                                      "" }
                                                                      , {
                                                                        "" }
                                                                        , {
                                                                          "" }
                                                                          , {
                                                                            "" }
                                                                            , {
                                                                              "" }
                                                                              , {
                                                                                "" }
                                                                                , {
                                                                                  "" }
                                                                                  , {
                                                                                    "" }
                                                                                    , {
                                                                                      "" }
                                                                                      , {
                                                                                        "" }
                                                                                        , {
                                                                                          "" }
                                                                                          , {
                                                                                            "" }
                                                                                            , {
                                                                                              "" }
                                                                                              , {
                                                                                                "" }
                                                                                                , {
                                                                                                  "" }
                                                                                                  , {
                                                                                                    "" }
                                                                                                    , {
                                                                                                      "" }
                                                                                                      , {
                                                                                                        "" }
                                                                                                        , {
                                                                                                          "" }
                                                                                                          , {
                                                                                                            "" }
                                                                                                          }
                                                                                                          