public static String HORIZ = "-" ;
final String VERTI = "|" ;
final Set < String > SHOOTER = new HashSet < String > ( ) {
  {
    add ( "|" ) ;
    add ( "-" ) ;
  }
}
;
final String EMPTY = "." ;
final String WALL = "#" ;
final String IMP = "IMPOSSIBLE" ;
@ SuppressWarnings ( {
  "unchecked" , "rawtypes" }
  ) public boolean check ( String [ ] A ) {
    Set < String > todo = new HashSet < String > ( ) ;
    Set < String > cv = grp . count ( EMPTY ) ;
    if ( cv . size ( ) > 1 ) {
      for ( int r = 0 ;
      r < A . length ;
      r ++ ) {
        String [ ] row = A [ r ] ;
        int cc = 0 ;
        for ( int k = 0 ;
        k < A . length ;
        k ++ ) {
          String [ ] grp = Arrays . copyOf ( row , k ) ;
          if ( check ( A [ r ] ) ) return '\n' . concat ( "POSSIBLE" ) . concat ( Arrays . toString ( grp ) ) . concat ( "" ) ;
          @ SuppressWarnings ( {
            "unchecked" }
            ")publicbooleanequals(Objecto){return((Integer)o).equals(HORIZ);}}returnfalse;}}}intrr=0;for(intk=0;k<A.length;k++){String[]row=A[r];if(check(A[r]))return'\n'.concat(" POSSIBLE ").concat(Arrays.toString(row));intcv=grp.count(VERTI);intce=grp.count(EMPTY);if((ch>1)||(ch==1&&cv==0))returnfalse;if(ce>0){if((!ch)){for(intc=0;k<A.length;k++){String[]grp=Arrays.copyOf(row,k);if(check(A[r]))return'\n'.concat(" POSSIBLE ").concat(Arrays.toString(grp)).concat(" " ) ; } } else { for ( int c = 0 ; c < A . length ; c ++ ) { if ( check ( A [ r ] )