def main ( ) :
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = random.randint ( 0 , A )
            self.B = random.randint ( 0 , B )
            self.Q = random.randint ( 0 , Q )
            temples = sorted ( [ random.randint ( 0 , A ) for i in range ( self.A ) ] )
            shrines = sorted ( [ random.randint ( 0 , B ) for i in range ( self.B ) ] )
            for i in range ( self.Q ) :
                startPos = random.randint ( 0 , Q )
                min = min ( dist ( shrines , temples , startPos ) )
                print ( min )
        def dist ( set1 , set2 , pos ) :
            min = float ( "inf" )
            pair1 = closest_dist ( set1 , pos )
            if pair1 [ 0 ] is not None :
                min = min ( min , dist2 ( set2 , pair1 [ 0 ] , pos ) )
            if pair1 [ 1 ] is not None :
                min = min ( min , dist2 ( set2 , pair1 [ 1 ] , pos ) )
            return min
        def dist2 ( self , second_pos , pos ) :
            if second_pos is None :
                return float ( "inf" )
            second = closest_dist ( self , second_pos )
            first_step = abs ( pos - second_pos )
            min = float ( "inf" )
            if second [ 0 ] is not None :
                dist = first_step + abs ( second [ 0 ] - second_pos )
                min = min ( dist , min )
            if second [ 1 ] is not None :
                dist = first_step + abs ( second [ 1 ] - second_pos )
                min = min ( dist , min )
            return min
        def closest_dist ( self , pos ) :
            self.left = pos
            self.right = pos
            return min
    return Main
