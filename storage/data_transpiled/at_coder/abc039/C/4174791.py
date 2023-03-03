def main ( ) :
    import sys
    from string import printable
    s = printable.split ( ' ' )
    a = ( 'Do' , 'Re' , 'Mi' , 'Fa' , 'So' , 'La' , 'Si' )
    w1 , w2 = - 1 , - 1
    for i in range ( len ( s ) - 1 ) :
        if s [ i ] == 'W' and s [ i + 1 ] == 'W' :
            if w1 < 0 :
                w1 = i
            elif w2 < 0 :
                w2 = i
    if w2 - w1 == 7 :
        print ( a [ 2 - w1 // 2 ] )
    else :
        print ( a [ 6 - w1 // 2 ] )
