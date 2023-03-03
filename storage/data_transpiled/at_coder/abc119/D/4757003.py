def __main__ ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.readline ( ).rstrip ( )
            self.B = sys.stdin.readline ( ).rstrip ( )
            self.Q = sys.stdin.readline ( ).rstrip ( )
            temples = sorted ( [ ] )
            shrines = sorted ( [ ] )
            for i in range ( A ) :
                shrines.append ( sys.stdin.readline ( ).rstrip ( ) )
            for i in range ( B ) :
                temples.append ( sys.stdin.readline ( ).rstrip ( ) )
            for i in range ( Q ) :
                startPos = sys.stdin.readline ( ).rstrip ( )
                min = min ( dist ( shrines , temples , startPos ) )
                print ( min )
        def dist ( self , set1 , set2 , pos ) :
            min = float ( 'inf' )
            pair1 = self.closest_dist ( set1 , pos )
            if pair1 [ 0 ] is not None :
                second = self.closest_dist ( set2 , pair1 [ 0 ] )
                first_step = abs ( pos - pair1 [ 0 ] )
                if second [ 0 ] is not None :
                    dist = first_step + abs ( second [ 0 ] - pair1 [ 0 ] )
                    min = min ( dist )
                if second [ 1 ] is not None :
                    dist = first_step + abs ( second [ 1 ] - pair1 [ 0 ] )
                    min = min ( dist )
            if pair1 [ 1 ] is not None :
                second = self.closest_dist ( set2 , pair1 [ 1 ] )
                first_step = abs ( pos - pair1 [ 1 ] )
                if second [ 0 ] is not None :
                    dist = first_step + abs ( second [ 0 ] - pair1 [ 1 ] )
                    min = min ( dist )
            return min
        def closest_dist ( self , pos ) :
            ceiling = self.closest_dist ( pos )
            if second [ 0 ] is not None :
                dist = first_step + abs ( second [ 0 ] - pair1 [ 1 ] )
                min = min ( dist )
            return min
    return Main ( )
