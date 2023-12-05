def _import ( ) :
    import sys
    import os
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.graph = [ ]
        def main ( self ) :
            with open ( self.filename , 'r' ) as f :
                self.graph.append ( [ ] )
            self.graph = [ [ ] for i in range ( 0 , n + 1 ) ]
            for a , b in self.graph [ : n ] :
                self.graph [ a ].append ( b )
                self.graph [ b ].append ( a )
    ans = helper ( n )
    f = sys.stdout
    print ( len ( ans ) )
    while len ( ans ) > 0 :
        f.write ( ans.pop ( ) )
        f.write ( " " )
    f.flush ( )
    def helper ( self ) :
        vis = [ False ] * ( n + 1 )
        ans = list ( range ( 1 , self.graph [ 1 ] [ 0 ] ) )
        vis [ 1 ] = True
        vis [ ans.pop ( ) ] = True
        flag = True
        while flag :
            flag = False
            for w in self.graph [ ans.pop ( ) ] :
                if not vis [ w ] :
                    ans.append ( w )
                    vis [ w ] = True
                    flag = True
                    break
        flag = True
        while flag :
            flag = False
            for w in self.graph [ ans.pop ( ) ] :
                if not vis [ w ] :
                    ans.append ( w )
                    vis [ w ] = True
                    flag = True
                    break
        return ans
    Note :./ Main._ _ uses _ or _ unsafe.operations.Note : Recompile SPACETOKEN with - Xlint : unchecked SPACETOKEN for SPACETOKEN details.
