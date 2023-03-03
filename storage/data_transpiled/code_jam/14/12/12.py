def round1a ( ) :
    import random
    import numpy as np
    import numpy.random
    import numpy.random
    import os
    import os
    import sys
    class B :
        def __init__ ( self , nodes ) :
            self.nodes = nodes
        def __init__ ( self , nodes ) :
            self.nodes = nodes
    def __init__ ( self , nodes ) :
        sc = os.open ( os.path.join ( os.path.dirname ( __file__ ) , 'test_data.txt' ) , os.O_RDONLY )
        self.nodes = nodes
        for caze in range ( 1 , cases + 1 ) :
            N = sc.randint ( 0 , 3 )
            self.adj = [ [ ] for _ in range ( N ) ]
            for a in range ( N - 1 ) :
                b = sc.randint ( 0 , N - 1 )
                self.adj [ a ].append ( b )
                self.adj [ b ].append ( a )
            ans = N
            for i in range ( N ) :
                self.visited = [ False for _ in range ( N ) ]
                val = self.get_data ( i ).min_remove
                ans = min ( ans , val )
            print ( 'Case #%d: %d' % ( caze , ans ) )
    def get_data ( self , node ) :
        self.visited [ node ] = True
        children = [ ]
        for vec in self.adj [ node ] :
            if not self.visited [ vec ] :
                children.append ( get_data ( vec ) )
        if len ( children ) == 0 :
            return ( 0 , 1 )
        elif len ( children ) == 1 :
            child = children [ 0 ]
            return ( child.nodes , child.nodes + 1 )
        totnodes = 0
        for child in children :
            totnodes += child.nodes
        children.sort ( key = lambda x : x.min_remove )
    B.__init__ ( A , B )
