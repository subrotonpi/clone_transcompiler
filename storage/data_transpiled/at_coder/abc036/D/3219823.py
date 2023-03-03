def import _main
class Main ( object ) :
    Mod = 1000000000 + 7
    maxN = 100000 + 5
    ungraph = [ ]
    digraph = [ ]
    black = [ ]
    white = [ ]
    all = [ ]
    def main ( ) :
        with open ( "../" ) as sc :
            for i in range ( 0 , maxN ) :
                ungraph.append ( [ ] )
                digraph.append ( [ ] )
            N = sc.read ( )
            black = [ ]
            white = [ ]
            all = [ ]
            for i in range ( N - 1 ) :
                a = sc.read ( )
                b = sc.read ( )
                ungraph [ a ].append ( b )
                ungraph [ b ].append ( a )
            bfs ( N )
            black.append ( 1 )
            white.append ( 1 )
            dfs ( 1 )
            print ( all [ 1 ] )
    def dfs ( root ) :
        if len ( digraph [ root ] ) != 0 :
            for i in digraph [ root ] :
                dfs ( i )
            for i in digraph [ root ] :
                cur = i
                white [ root ] = white [ root ] * all [ cur ] % Mod
                black [ root ] = black [ root ] * white [ cur ] % Mod
        all [ root ] = ( white [ root ] + black [ root ] ) % Mod
    def bfs ( N ) :
        vis = [ ]
        cur = list ( range ( 1 , N + 1 ) )
        while len ( cur ) > 0 :
            now = cur.pop ( )
            vis [ now ] = True
            for w in ungraph [ now ] :
                if not vis [ w ] :
                    cur.append ( w )
                    digraph [ now ].append ( w )
