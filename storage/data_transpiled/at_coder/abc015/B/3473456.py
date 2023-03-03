def main ( ) :
    import sys
    from itertools import count
    with open ( sys.argv [ 1 ] ) as f :
        N = len ( f.readlines ( ) )
        A = [ ]
        sum = 0
        count = 0
        for i in range ( N ) :
            A.append ( f.read ( ) )
        for i in range ( N ) :
            if A [ i ] != 0 :
                sum += A [ i ]
                count += 1
        print ( ( sum + count - 1 ) / count )
