def _main ( ) :
    import os
    import sys
    import os
    import sys
    import random
    class D ( object ) :
        def __init__ ( self ) :
            with open ( 'input.txt','w' ) as f :
                self.dst = f.read ( )
        def add_edge ( self , prev , target ) :
            self.dst = self.dst
            self.dst = self.dst
            self.dst = self.dst
            self.dst = self.dst
            self.dst = self.dst
            self.dst = self.dst
            self.dst = self.dst
            self.dst = self.dst
            self.dst = self.dst
            self.dst = self.dst
            self.dst = self.dst
            self.dst = self.dst
            self.dst = self.dst
            self.dst = self.dst
            self.dst = self.dst
            self.dst = self.dst
            self.dst = self.dst
            self.dst = self.dst
            self.dst = self.dst
            self.dst = self.dst
            self.dst = self.dst
            self.dst = self.dst
            self.dst = self.dst
            self.dst = self.dst
            self.dst = self.dst
            self.dst = self.dst
            self.dst = self.dst
            self.dst = self.dst
            self.dst = self.dst
        def solve ( self ) :
            P = self.dst
            W = self.dst
            v = [ ]
            for i in range ( P ) :
                v.append ( Node ( i ) )
            for s in self.next ( ).split ( ',' ) :
                x = int ( s [ 0 ] )
                y = int ( s [ 1 ] )
                v [ x ].add_edge ( v [ y ] )
            q = [ v [ 0 ] ]
            self.visited = True
            h = 0
            t = 1
            while t > h :
                node = q [ h ]
                h += 1
                for edge in node.edges :
                    next = edge.dst
                    if not next.visited :
                        next.visited = True
                        next.d = node.d + 1
                        q [ t ] = next
            self.visited = False
            return h