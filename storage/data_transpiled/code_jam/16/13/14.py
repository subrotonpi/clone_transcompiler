def import _largestCircle
class C ( object ) :
    def __init__ ( self ) :
        self.C = int ( self.C )
        for thisCase in range ( 1 , C + 1 ) :
            self.print ( "Case #%d: %d" % ( thisCase , self.largestCircle ( ) ) )
    def largestCircle ( self ) :
        N = len ( self.bff )
        bff = [ self.bff [ i ] - 1 for i in range ( N ) ]
        status = [ - 2 for i in range ( N ) ]
        chain_length = [ 0 for i in range ( N ) ]
        for i in range ( N ) :
            if bff [ bff [ i ] ] == i :
                status [ i ] = - 1
        max_loop_size = 0
        for i in range ( N ) :
            if status [ i ] != - 1 :
                current = bff [ i ]
                status [ i ] = i
                steps = 1
                done = False
                while not done :
                    if current == i :
                        if steps > max_loop_size :
                            max_loop_size = steps
                        done = True
                    elif status [ current ] == i :
                        done = True
                    elif status [ current ] == - 1 :
                        if steps > chain_length [ current ] :
                            chain_length [ current ] = steps
                        done = True
                    else :
                        steps += 1
                        status [ current ] = i
                        current = bff [ current ]
    frankenCircle = 0
    for i in range ( N ) :
        if status [ i ] == - 1 :
            frankenCircle += ( chain_length [ i ] + 1 )
    return max ( frankenCircle , max_loop_size )
