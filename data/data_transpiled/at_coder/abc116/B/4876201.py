def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.start = 0
            self.abc116B = Main ( )
            print ( self.abc116B.solve ( start ) )
        def solve ( self , start ) :
            abc116BSolve = ABC116BSolve ( )
            return abc116BSolve.search ( start )
    class ABC116BSolve ( object ) :
        def search ( self , start ) :
            history = [ False ] * 1000000
            current = start
            i = 1
            while True :
                if history [ current ] :
                    return i
                history [ current ] = True
                if current % 2 == 1 :
                    current = 3 * current + 1
                else :
                    current /= 2
                i += 1
