def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        M = sc.readline ( ).strip ( )
        dict = defaultdict ( list )
        for i , P , Y in enumerate ( sc.readlines ( ) ) :
            dict [ Y ].append ( [ P , i ] )
    ans = [ ]
    count = [ 0 ] * ( N + 1 )
    for list in dict.values ( ) :
        ans.append ( "%06d%06d" % ( list [ 0 ] , 1 ) )
        count [ list [ 0 ] ] += 1
    for i in range ( M ) :
        print ( ans [ i ] )
