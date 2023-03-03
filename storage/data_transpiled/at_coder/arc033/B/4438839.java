, na = Integer . MAX_VALUE ) , nb = Integer . MAX_VALUE ) ;
List a = list ( Integer . MAX_VALUE ) ;
List b = list ( Integer . MAX_VALUE ) ;
List c = a . stream ( ) . map ( x -> x ) . collect ( toList ( ) ) ;
int t = c . stream ( ) . mapToInt ( x -> x ) . sum ( ) ;
int s = c . stream ( ) . mapToInt ( x -> x ) . sum ( ) ;
return s / t ;
}
