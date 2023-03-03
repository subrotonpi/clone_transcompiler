def main ( ) :
    import sys
    from collections import defaultdict
    from os import path
    input = open ( path.join ( path.dirname ( __file__ ) , '..' ) , 'r' )
    N = int ( input.read ( ) )
    M = int ( input.read ( ) )
    d = defaultdict ( list )
    for i , P , Y in enumerate ( input ) :
        arr = [ P , i ]
        d [ Y ].append ( arr )
    ans = [ ]
    city = [ 0 ] * N
    for arr in d.values ( ) :
        ans.append ( '%06d%06d' % ( arr [ 1 ] , 1 ) )
        city [ arr [ 0 ] - 1 ] += 1
    for i in range ( M ) :
        print ( ans [ i ] )
