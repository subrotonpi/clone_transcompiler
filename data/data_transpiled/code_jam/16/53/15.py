def _import ( ) :
    from os import system , getfile
    from os import getenv
    class C :
        def __init__ ( self ) :
            self.x = getenv ( 'x' )
            self.y = getenv ( 'y' )
            self.z = getenv ( 'z' )
            self.x = getenv ( 'x' )
            self.y = getenv ( 'y' )
            self.z = getenv ( 'z' )
            self.x = getenv ( 'x' )
            self.y = getenv ( 'y' )
            self.z = getenv ( 'z' )
        def dist2 ( second ) :
            dx = self.x - second.x
            dy = self.y - second.y
            dz = self.z - second.z
            return dx * dx + dy * dy + dz * dz
    def solve_one ( f ) :
        n = eval ( f.read ( ) )
        f.seek ( 0 )
        p = [ Point ( f ) for f in f.readlines ( ) ]
        connected = [ False ]
        INF = sum ( [ p [ i ] for i in range ( n ) ] )
        dist2 = [ 0 ] * n
        dist2 [ 0 ] = 0
        max = 0
        while True :
            best_i = - 1
            best_dist2 = INF
            for i in range ( n ) :
                if not connected [ i ] and dist2 [ i ] < best_dist2 :
                    best_dist2 = dist2 [ i ]
                    best_i = i
            connected [ best_i ] = True
            max = max ( max , best_dist2 )
            for i in range ( n ) :
                if not connected [ i ] :
                    dist2 [ i ] = min ( dist2 [ i ] , p [ best_i ].dist2 ( p [ i ] ) )
            if best_i == 1 :
                break
        return "" , math.sqrt ( max )
    def solve ( f , out = sys.stdout ) :
        ntests = eval ( f.read ( ) )
        for itest in range ( 1 , ntests + 1 ) :
            out.write ( "Case #%d: %s\n" % ( itest , solve_one ( f ) ) )
    run ( )
