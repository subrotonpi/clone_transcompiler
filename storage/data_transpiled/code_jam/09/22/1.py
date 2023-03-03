def _import ( ) :
    from os import environ
    from os import environ
    from os import environ
    from os import environ
    from locale import getpreferredencoding
    class B ( object ) :
        NAME = 'b-large'
        def __init__ ( self , place , flag , s ) :
            if place == len ( s ) :
                if not flag :
                    opt = s
                return
            for i in range ( 10 ) :
                if opt :
                    return
                if not stats [ i ] :
                    continue
                if flag and i < ord ( n [ place ] ) - ord ( '0' ) :
                    continue
                stats [ i ] -= 1
                self._calc_opt ( place + 1 , flag & i == ord ( n [ place ] ) - ord ( '0' ) , s + i )
                stats [ i ] += 1
        def solve ( self ) :
            tests = int ( self.read_word ( ) )
            for test in range ( 1 , tests + 1 ) :
                n = self.read_word ( )
                n = n.rstrip ( '' )
                stats = [ 0 ] * 10
                for i in range ( 10 ) :
                    stats [ i ] -= '0'
                opt = None
                self._calc_opt ( 0 , True , '' )
                if not opt :
                    n = '0' + n
                    n += 1
                    stats [ 0 ] += 1
                    self._calc_opt ( 0 , True , '' )
                stdout.write ( 'Case #%d: %s\n' % ( test , opt ) )
    class stdin ( object ) :
        def __init__ ( self , environ ) :
            try :
                environ [ 'PATH' ] = os.environ [ 'PATH' ]
            except KeyError :
                pass
            else :
                environ [ 'PATH' ] = os.environ [ 'PATH' ]
        def readline ( self ) :
            try :
                return stdin.readline ( )
            except :
                pass
            return stdout
    def main ( ) :
        try :
            stdin = open ( '%s.in' % os.environ [ 'PATH' ] , 'r' )
            stdout = open ( '%s.out' % environ [ 'PATH' ] , ' w