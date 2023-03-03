def _ _ main _ _ ( ) : return
from pyjamas.config import Config
class ProblemA :
    class Node ( object ) :
        def __init__ ( self , s ) :
            self.name = s
            self.children = [ ]
        def add_child ( self , child ) :
            self.children.append ( child )
        def is_basic ( self ) :
            return self.name.islower ( )
    def main ( self ) :
        with open ( "A-small-attempt1.in" , "r" ) as sc :
            f = open ( "C:/Documents and Settings/codejam/Desktop/A-small-out.txt" , "w" )
            C = int ( sc.readline ( ) )
            for i in range ( 1 , C + 1 ) :
                n_mixtures = int ( sc.readline ( ) )
                root = None
                d = { }
                for j in range ( n_mixtures ) :
                    data = parse_string_array ( sc.readline ( ) )
                    node = self.get_node ( data [ 0 ] )
                    if j == 0 : root = node
                    for k in data [ 2 : ] :
                        child = self.get_node ( data [ k ] )
                        node.add_child ( child )
                ans = go ( root )
                f.write ( "Case #%d: %d\n" % ( i , ans ) )
            f.flush ( )
            f.close ( )
    def getNode ( self ) :
        if self.name in d : return d [ self.name ]
        ret = Node ( self.name )
        d [ self.name ] = ret
        return ret
    def go ( self ) :
        if self.name in d : return 0
        ret01 = 1
        x = [ ]
        for child in self.children :
            if not child.is_basic ( ) : ret01 += 1
            rec = go ( child )
            x.append ( rec )
        x.sort ( )
        largest = x [ - 1 ]
        ties = 0
        for y in x :
            if y == largest : ties += 1
        ret02 = max ( ret01 , ret02 )
        return ret01
    return ProblemA
