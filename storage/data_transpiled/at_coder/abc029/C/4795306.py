def Main ( ) :
    global _number
    n = _number
    _number = '%' + str ( n ) + 's'
    _number = str ( int ( math.pow ( 3 , n ) ) ).replace ( ' ' , 'a' ).replace ( '0' , 'a' ).replace ( '1' , 'b' ).replace ( '2' , 'c' )
