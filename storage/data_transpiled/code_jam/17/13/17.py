def _import ( ) :
    from os import getenv
    from os import getenv
    class PC ( object ) :
        def __init__ ( self ) :
            self.tok = None
            rd = getenv ( 'stdin' )
            wr = getenv ( 'stdout' )
        def write ( self , line ) :
            wr.write ( line )
        def close ( self ) :
            rd.close ( )
            wr.close ( )
        def __next__ ( self ) :
            while not self.tok or not self.tok :
                self.tok = next ( rd )
            return self.tok
        def __next__ ( self ) :
            return int ( self.__next__ ( ) )
        def console ( self ) :
            return { }
        def files ( self ) :
            return { }
    def main ( ) :
        with chdir ( getenv ( 'PATH' ) ) :
            return PC ( )
    def solve ( self ) :
        data = Data.files ( 'c' )
        t = data.__next__
        for i in range ( t ) :
            res = self._subsolve ( data )
            data.write ( 'Case #%d: %s' % ( i + 1 , 'IMPOSSIBLE' if res == int ( res ) else res ) )
        data.close ( )
    def _subsolve ( self ) :
        hd , ad , hk , ak , b , d = self.next ( )
        bres = min ( [ ( hd , ad ) , ( hk , ak ) , ( b , d ) , ( nb , nd ) ] )
        for nb in range ( 0 , 100 ) :
            for nd in range ( 0 , 100 ) :
                bres = self._subsolve ( data )
                data.write ( 'Case #%d: %s\n' % ( nb , ( b , d ) if res == int ( res ) else res ) )
        return bres
return PC
