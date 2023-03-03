def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.k = args.k
            self.s = args.s
            self.answer = 0
            for x in range ( 0 , k ) :
                for y in range ( 0 , k ) :
                    z = s - x - y
                    if ( 0 <= z <= k ) :
                        self.answer += 1
        print ( self.answer )
