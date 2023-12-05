private static int [ ] E = new int [ input . length ] ;
for ( int i = 0 ;
i < input . length ;
i ++ ) {
  E [ i ] = Integer . parseInt ( input [ i ] ) ;
}
int B = Integer . parseInt ( input [ i ] ) ;
List < Integer > L = new ArrayList < Integer > ( ) ;
for ( int i = 0 ;
i < input . length ;
i ++ ) {
  L . add ( Integer . parseInt ( input [ i ] ) ) ;
}
return L . toArray ( ) ;
}
