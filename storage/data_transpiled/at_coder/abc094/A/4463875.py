def main ( ) :
    import sys
    from itertools import count
    for i in range ( sys.argv [ 1 ] ) :
        cats = count ( i )
        mix = count ( i )
        rslt = count ( i )
        if rslt >= cats and cats + mix >= rslt :
            print ( "YES" )
        else :
            print ( "NO" )
