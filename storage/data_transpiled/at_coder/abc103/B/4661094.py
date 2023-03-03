def main ( ) :
    import sys
    from string import printable
    sc = sys.stdin
    s , t = [ ] , [ ]
    flag = False
    for i in range ( len ( s ) ) :
        s = list ( Rotate ( s ) )
        if str ( t ) == str ( s [ i ] ) :
            flag = True
            break
    if flag == True :
        print ( "Yes" )
    else :
        print ( "No" )
    def Rotate ( str ) :
        s = list ( s )
        t = str [ 0 ]
        for i in range ( len ( s ) - 1 ) :
            s [ i ] = s [ i + 1 ]
        s [ - 1 ] = t
        return s
    return Rotate
