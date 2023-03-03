def main ( ) :
    import sys
    from string import printable
    print ( printable )
    data = printable.split ( '' )
    ans = ''
    j = 1
    for i in range ( 0 , len ( data ) - 1 ) :
        if data [ i ] == data [ i + 1 ] :
            j += 1
        else :
            ans = ans + data [ i ] + j
            j = 1
        if i == len ( data ) - 2 :
            ans = ans + data [ i + 1 ] + j
    print ( ans )
