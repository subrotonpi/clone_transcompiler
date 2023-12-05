def codejam.y2012.r2 ( ) :
    import os
    import sys
    import os
    import sys
    import subprocess
    import subprocess
    class Task3 ( subprocess.Popen ) :
        def __init__ ( self ) :
            self.input = open ( "D:/Programming/Projects/CodeJam/input.txt" , "r" )
            self.output = open ( "D:/Programming/Projects/CodeJam/output.txt" , "w" )
            self.T = self.input.count ( )
            for i in range ( 1 , T + 1 ) :
                result = self.get_result ( )
                print ( "Case #{}: {}".format ( i , result ) )
                self.output.write ( "Case #{}: {}\n".format ( i , result ) )
                self.output.write ( "\n" )
    def get_result ( self ) :
        N = self.input.count ( )
        x = [ self.input.count ( ) - 1 for i in range ( N - 1 ) ]
        for i in range ( N ) :
            for j in range ( i + 1 , x [ i ] ) :
                if x [ j ] > x [ i ] :
                    return "Impossible"
        heights = [ 10 for i in range ( N ) ]
        while ( self.check ( heights , x ) != 3000 ) :
            heights [ self.check ( heights , x ) ] += 10
    def check ( heights , x ) :
        for i in range ( len ( x ) ) :
            dh = heights [ x [ i ] ] - heights [ i ]
            dl = x [ i ] - i
            for j in range ( i + 1 , x [ i ] ) :
                if x [ j ] > x [ i ] :
                    return "Impossible"
        return "".join ( heights )
    return Task3
