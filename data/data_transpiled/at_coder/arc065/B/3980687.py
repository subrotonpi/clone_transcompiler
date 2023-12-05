def _import ( ) :
    import os
    import sys
    import os
    import sys
    import os
    import sys
    import os
    import sys
    import os
    import sys
    import os
    import os
    import sys
    import set
    class Main ( ) :
        def find_tree ( self , n ) :
            self.node_num = n
            self.parent = [ ]
            self.height = { }
            for i in range ( 1 , self.node_num + 1 ) :
                self.parent.append ( i )
                self.height [ i ] = 0
        def find_tree ( self , x ) :
            if self.parent [ x ] == x :
                return x
            else :
                return self.parent [ x ] = self.find ( x )
        def union ( self , x ) :
            root_x = self.find ( x )
            root_y = self.find ( y )
            if root_x == root_y :
                return
            if self.height [ root_x ] < self.height [ root_y ] :
                self.parent [ root_x ] = self.root_y
            else :
                if self.height [ root_x ] == self.height [ root_y ] :
                    self.height [ root_x ] += 1
                self.parent [ root_y ] = self.root_x
    class Edge ( object ) :
        def __init__ ( self ) :
            self.a = a
            self.b = b
        def __eq__ ( self , other ) :
            if self == other : return True
            if not isinstance ( other , type ) or get_class ( self ) != other.__class__ :
                return False
            self.other = other
        def __hash__ ( self ) :
            return hash ( self.a )
    class Main ( ) :
        def find_tree ( self , n ) :
            self.node_num = n
            self.parent = [ ]
            self.height = { }
            self.father_pairs = { }
            for i in range ( 0 , self.node_num + 1 ) :
                self.parent [ i ] = self.parent [ i ]
                self.height [ i ] = self.size [ i ] + 1
    return Main
