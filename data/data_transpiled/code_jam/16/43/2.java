{
  dirNext = new char [ ] {
    'N' , '\\' , 'E' , '/' , 'S' , '\\' , 'W' , }
    ;
    dirEffectOfSlash = new char [ ] {
      ( char ) 'N' , '/' , 'W' , 'N' , '\\' , 'E' , '/' , 'S' , 'E' , '\\' , '/' }
      ;
      dirEffectOfSlash = new char [ ] {
        ( char ) 'W' , ( char ) 'N' , ( char ) 'E' , ( char ) 'E' , ( char ) '/' , ( char ) 'S' , ( char ) 'E' , ( char ) 'N' , ( char ) 'S' , ( char ) 'E' , ( char ) 'E' , ( char ) 'E' , ( char ) 'E' , ( char ) 'N' , ( char ) 'E' , ( char ) 'E' , ( char ) 'E' , ( char ) 'E' , ( char ) 'E' , ( char ) 'E' , ( char ) 'E' , ( char ) 'E' , ( char ) 'N' , ( char ) 'E' , ( char ) 'E' , ( char ) 'E' , ( char ) 'E' , ( char ) 'E' , ( char ) 'N' , ( char ) 'E' , ( char ) 'E' , ( char ) 'E' , ( char ) 'E' , ( char ) 'E' , ( char ) 'E' , ( char ) 'E' , ( char ) 'E' , ( char ) 'E' , ( char ) 'N' , ( char ) 'E' , ( char ) 'E' , ( char ) 'E' , ( char ) 'E' , ( char ) 'E' , ( char ) 'E' , ( char ) 'E' , ( char ) 'E' , ( char ) 'E' , ( char ) 'E' , ( char ) 'E' , ( char ) 'E' }
        ;
        int r = Integer . parseInt ( input ( ) ) ;
        int c = Integer . parseInt ( input ( ) ) ;
        int [ ] matches = new int [ r ] ;
        for ( int i = 0 ;
        i < r