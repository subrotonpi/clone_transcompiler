def main ( ) :
    import sys
    from itertools import count
    for i in range ( sys.argv [ 1 ] ) :
        a = sys.argv [ 1 ]
        w , h = 0 , 0
        d = [ i for i in range ( a ) ]
        e = [ i for i in range ( a ) ]
        e.sort ( )
        for i in range ( a ) :
            e.sort ( )
        for i in range ( a ) :
            e.sort ( )
        for i in range ( 1 , a ) :
            if e [ i ] == e [ i - 1 ] :
                i += 1
                if count == 0 :
                    w , count = e [ i - 1 ] , e [ i - 1 ]
                    count += 1
                else :
                    h , = e [ i - 1 ] , e [ i ]
                    break
        print ( w * h )
