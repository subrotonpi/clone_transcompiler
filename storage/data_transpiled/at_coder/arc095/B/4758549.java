static int upperbound ( int [ ] zs , int left , int right , Predicate < Integer > ok ) {
  if ( left + 1 >= right ) return left ;
  int m = ( left + right ) / 2 ;
  if ( ok . test ( zs [ m ] ) ) return upperbound ( zs , m , right , ok ) ;
  else return upperbound ( zs , left , m , ok ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > xs = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) xs . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  List < Integer > ds = new ArrayList < > ( xs ) ;
  ds . sort ( ) ;
  int a = ds . get ( ds . size ( ) - 1 ) ;
  int c = a / 2 ;
  zs = zs [ d ] ;
  for ( int i = 0 ;
  i < zs . length - 1 ;
  i ++ ) zs [ d ] = zs [ d - c ] ;
  int j = i < zs . length - 1 ? i + 1 : i ;
  int b = Math . abs ( zs [ i ] ) < Math . abs ( zs [ j ] ) ? ds . get ( j ) : ds . get ( j ) ;
  System . out . println ( a + " " + b ) ;
}
