public static void main ( String input ) {
  int scaffoldCount = Integer . parseInt ( input ) ;
  List < Integer > scaffoldList = Lists . newArrayList ( ) ;
  for ( String s : input . split ( " " ) ) {
    scaffoldList . add ( Integer . parseInt ( s ) ) ;
  }
  int [ ] jumpCosts = new int [ scaffoldCount ] ;
  jumpCosts [ 0 ] = 0 ;
  jumpCosts [ 1 ] = Math . abs ( scaffoldList . get ( 0 ) - scaffoldList . get ( 1 ) ) ;
  for ( int i = 2 ;
  i < scaffoldCount ;
  i ++ ) {
    jumpCosts [ i ] = Math . min ( jumpCosts [ i - 2 ] + Math . abs ( scaffoldList . get ( i - 2 ) - scaffoldList . get ( i ) ) , jumpCosts [ i - 1 ] + Math . abs ( scaffoldList . get ( i - 1 ) - scaffoldList . get ( i ) ) ) ;
  }
  System . out . println ( jumpCosts [ scaffoldCount - 1 ] ) ;
}
