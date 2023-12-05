def _import ( ) :
    from time import sleep
    import random
    class PB ( object ) :
        PROBLEM_NAME = 'PB'
        INPUT_FILE_NAME = '%s.in' % PROBLEM_NAME
        OUTPUT_FILE_NAME = '%s.out' % PROBLEM_NAME
        class InputReader :
            def __init__ ( self , filename ) :
                self.fp = open ( filename , 'r' )
            def close ( self ) :
                try :
                    self.fp.close ( )
                except IOError :
                    pass
            def readline ( self ) :
                while self.fp is None or not self.fp.readline ( ) :
                    self.fp = open ( self.fp.readline ( ) , 'r' )
                return self.fp.readline ( )
            def __next__ ( self ) :
                return int ( self.fp.readline ( ) )
            def readline ( self ) :
                self.fp = None
                return self.fp.readline ( )
        def solve ( self ) :
            rd = InputReader ( self.fp )
            wr = open ( OUTPUT_FILE_NAME , 'w' )
            t = rd.__next__ ( )
            for ti , b in enumerate ( t ) :
                n = rd.__next__ ( )
                m = [ rd.__next__ ( ) for _ in range ( b ) ]
                wr.write ( 'Case #%d: %d\n' % ( ti + 1 , subsolve ( n , m ) ) )
            rd.close ( )
            wr.close ( )
    def f ( t , m ) :
        b = len ( m )
        p = 0
        for i in range ( b ) :
            p += 1l + ( t // m [ i ] )
        return p
    def subsolve ( n , m ) :
        if n % 2 == 0 :
            return 1
        return 0
    return 1
