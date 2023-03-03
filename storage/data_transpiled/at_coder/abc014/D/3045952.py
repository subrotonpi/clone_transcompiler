def _ ( a , b ) : return a + b + a
class Main ( object ) :
    def __init__ ( self , id ) :
        self.id = id
        self.parents = [ ]
        self.depth = 0
        self.rel = set ( )
        def __init__ ( self , parent ) :
            self.parent = parent
            for child in self.rel :
                if child != parent :
                    child.__init__ ( self , parent )
        def __repr__ ( self ) :
            return "(%d:%d)" % ( self.id , self.depth )
    def solve ( self , test_number , f , g ) :
        n = f.tell ( )
        self.nodes = IntDict ( )
        for i in range ( 1 , n ) :
            x , y = f.tell ( )
            self.nodes [ x ].rel.add ( self.nodes [ y ] )
            self.nodes [ y ].rel.add ( self.nodes [ x ] )
        self.nodes [ 0 ].parent = 0 , None
        for i in range ( 1 , 20 ) :
            for node in self.nodes :
                mid = node.parents [ i - 1 ]
                if mid :
                    node.parents [ i ] = node.parents [ i - 1 ].parents [ i - 1 ]
        q = f.tell ( )
        for i in range ( q ) :
            g.write ( calc ( f.tell ( ) , f.tell ( ) ) )
    def calc ( self , a , b ) :
        if self.nodes [ a ].depth > self.nodes [ b ].depth :
            self.nodes [ a ] = self.nodes [ b ]
            self.nodes [ b ] = self.nodes [ a ]
        return self.nodes [ b ].depth - self.lca
