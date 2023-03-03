def main ( ) :
    import sys
    from numpy import arange
    from numpy.core import zeros
    from numpy.core import copy_reg
    from numpy.core import copy_reg
    n = int ( sys.stdin.readline ( ) )
    a = [ [ ] for _ in range ( n ) ]
    b = [ [ ] for _ in range ( n ) ]
    used = [ False for _ in range ( n ) ]
    a.sort ( key = lambda x : x [ 0 ] - x [ 0 ] )
    b.sort ( key = lambda x : x [ 0 ] - x [ 1 ] )
    cnt = 0
    for i in range ( n ) :
        pare = - 1
        maxy = 0
        for j in range ( n ) :
            if i in a [ j ] [ 0 ] < b [ i ] [ 0 ] :
                if used [ j ] :
                    continue
                if i in a [ j ] [ 1 ] < b [ i ] [ 1 ] and maxy <= a [ j ] [ 1 ] :
                    pare = j
                    maxy = a [ j ] [ 1 ]
            if pare != - 1 :
                used [ pare ] = True
                cnt += 1
        print ( cnt )
