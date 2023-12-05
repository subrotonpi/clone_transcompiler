def _import ( ) :
    from collections import deque
    from os import urandom
    class Main ( object ) :
        def __init__ ( self ) :
            sc = urandom ( )
            def __init__ ( self ) :
                self.s = sc
            def consume ( self ) :
                s = self.s.decode ( 'utf-8' )
                deq = deque ( )
                for c in s :
                    if c == '0' :
                        deq.append ( '0' )
                    elif c == '1' :
                        deq.append ( '1' )
                    else :
                        deq.popleft ( )
            self.s = [ ]
            while len ( deq ) != 0 :
                self.s.append ( deq.pop ( ) )
            print ( s )
