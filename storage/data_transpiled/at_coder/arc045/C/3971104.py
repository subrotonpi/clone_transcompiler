def _ import _ , SPACETOKEN sys.stdout , SPACETOKEN sys.stderr , SPACETOKEN etc...
import os , re , getopt , sys , sys
class Main ( object ) :
    dist = { }
    map = [ ]
    def __init__ ( self ) :
        with open ( sys.stdin , 'r' ) as sc :
            n = int ( sc.readline ( ) )
            X = int ( sc.readline ( ) )
            map = [ [ ] for i in range ( 0 , n + 1 ) ]
            for a , b , c in [ ( a , b , c ) for a in range ( n - 1 ) ] :
                map [ a ].append ( ( b , c ) )
            map [ b ].append ( ( a , c ) )
        for e in map [ 1 ] :
            dfs ( e.to , 1 , e.weight )
        if X is None :
            ans = dist.get ( 0 , None )
            for w in dist :
                cur = dist [ w ]
                ans += cur * ( cur - 1 ) / 2
            print ( ans )
        else :
            ans1 = dist.get ( X , None )
            ans2 = 0
            for w in dist :
                cur = dist [ w ]
                ans2 += cur * dist.get ( w ^ X , None )
            print ( ans1 + ans2 / 2 )
    def dfs ( cur , from , len ) :
        dist [ len ] = dist.get ( len , None ) + 1
        for e in map [ cur ] :
            if e.to == from :
                continue
            dfs ( e.to , cur , len ^ e.weight )
    class Edge ( object ) :
        def __init__ ( self , t , w ) :
            self.to , self.weight = t , w
    Note :./ Main.py.uses.unchecked or unsafe.operations.Note : Recompile ( )
