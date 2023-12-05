def _import ( ) :
    from time import sleep
    from os import getenv
    class PB ( object ) :
        class Data :
            def __init__ ( self ) :
                self.tok = None
                self.rd = sys.stdin
                self.wr = sys.stdout
            def write ( self , line ) :
                self.wr.write ( line )
            def close ( self ) :
                self.rd.close ( )
                self.wr.close ( )
            def readline ( self ) :
                while not self.tok or not self.tok :
                    self.tok = self.rd.readline ( )
                return self.tok [ 0 ]
            def randint ( self ) :
                return int ( self.tok [ 0 ] )
            def long ( self ) :
                return long ( self.tok [ 1 ] )
        def console ( self ) :
            return PB ( )
        def files ( self ) :
            return { 'b' : self.name }
    def main ( ) :
        with Data ( ) :
            return PB ( )
    def solve ( ) :
        data = Data ( files = 'b' )
        t = data.randint ( 1 , 10 )
        for i in range ( t ) :
            x = data.randint ( 1 , 10 )
            res = subsolve ( x )
            data.write ( 'Case #%d: %s' % ( i + 1 , res ) )
        data.close ( )
    def pow10 ( k ) :
        res = 1
        for i in range ( k ) :
            res = res * 10L
        return res
    def rep ( d , k ) :
        res = 0
        for i in range ( k ) :
            res = res * 10L + d
        return res
    def subsolve ( x ) :
        res = 1
        for i in range ( k ) :
            res = res * 10L + x
        return subsolve ( x )
